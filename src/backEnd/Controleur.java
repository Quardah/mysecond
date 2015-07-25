package backEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

import commandes.ChargerMemento;
import commandes.Commande;
import commandes.Defaire;
import commandes.Quitter;
import commandes.Refaire;
import commandes.SauverMemento;
import commandes.Translater;
import commandes.Zoomer;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 JavaPaint
Nom du fichier: Controlleur.java
Date cree: 2015-07-15
*******************************************************
* Classe definissant le controlleur et son comportement
* permet d'agir et de faire des modifications sur l'image
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion
2015-07-15 Version Initiale (attributs, constructeur, get & set)
2015-07-22 Version fonctionnelle avec constructeur Singleton
*******************************************************/

public class Controleur implements ActionListener {

	protected ArrayList<Commande> cmdListe;
	private static Controleur controleur = null;
	private Caretaker caretaker = null;
	private ImageModel image = null;
	private int currentMemento = 0;
	private Factory factory = null;	
	private int positionx;
	private int positiony;

	protected Controleur() {
		//
	}

	public static Controleur getControleur() {
		if (controleur == null) { // pattern singleton
			controleur = new Controleur();
			controleur.factory = new Factory();
			controleur.cmdListe = new ArrayList<Commande>();
			controleur.ajouterCommande(new Defaire());
			controleur.ajouterCommande(new Refaire());
			controleur.ajouterCommande(new ChargerMemento());
			controleur.ajouterCommande(new SauverMemento());
			controleur.ajouterCommande(new Translater());
			controleur.ajouterCommande(new Zoomer());
			controleur.ajouterCommande(new Quitter());
			controleur.caretaker = new Caretaker();
			controleur.positionx = 0;
			controleur.positiony = 0;
		}
		return controleur;
	}

	public void runCommande(int nb) {
		/*
		 * ici, on envoi un numero pour executer une commande en particulier
		 * selon la liste de commande. 0 = Defaire 1 = Refaire 2 =
		 * ChargerMemento 3 = SauverMemento 4 = Translater 5 = Zommer 6 =
		 * Quitter
		 */
		cmdListe.get(nb).execute();
	}

	public void ajouterCommande(Commande aCommande) {
		cmdListe.add(aCommande);
	}

	public int getPositionx() {
		return positionx;
	}

	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}

	public int getPositiony() {
		return positiony;
	}

	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}

	public BufferedImage getImage() {
		return image.getImage();
	}

	public void setImage(ImageModel image) {
		this.image = image;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Action Performe");

	}

	// fonctions de memento

	public void nouveauMemento(Memento memento) {
		caretaker.add(memento);
	}

	public Memento loadMemento(int nb) {
		currentMemento = nb;
		return caretaker.loadMemento(nb);
	}

	public int getCurrentMemento() {
		return currentMemento;
	}

	// fonction de commandes touchant au memento

	public boolean hasNext() {
		return (currentMemento + 1 < caretaker.getNbMemento());
	}

	public boolean hasPrevious() {
		return (currentMemento - 1 < 0);
	}

	public ImageModel getImageModel() {
		// Pour SauverMemento Uniquement
		return image;
	}
}
