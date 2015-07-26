package backEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.awt.image.BufferedImage;

import commandes.Commande;
import commandes.ChargerMemento;
import commandes.Commande.TypeCommande;
import commandes.Defaire;
import commandes.Ouvrir;
import commandes.Quitter;
import commandes.Refaire;
import commandes.Rien;
import commandes.Sauvegarder;
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

public class Controleur extends Observable implements ActionListener, Observer  {

	private static Controleur instance = null;
	private Caretaker caretaker = null;
	private ImageModel image = new ImageModel();
	private int currentMemento = 0;
	private Factory factory = null;	
	private int positionx;
	private int positiony;

	protected Controleur() {
		this.factory = new Factory();
		this.caretaker = new Caretaker();
		this.positionx = 0;
		this.positiony = 0;
	}

	public static Controleur getControleur() {
		if (Controleur.instance == null) { // pattern singleton
			instance = new Controleur();
		}
		
		return instance;
	}

	public void runCommande(TypeCommande typeCmd) {
		Commande cmd;
		switch(typeCmd) {
		case CHARGERMEMENTO:
			cmd = new ChargerMemento(0);
			break;
		case DEFAIRE:
			cmd = new Defaire();
			break;
		case QUITTER:
			cmd = new Quitter();
			break;
		case REFAIRE:
			cmd = new Refaire();
			break;
		case SAUVERMEMENTO:
			cmd = new SauverMemento();
			break;
		case TRANSLATER:
			cmd = new Translater();
			break;
		case ZOOMER:
			cmd = new Zoomer();
			break;
		case OUVRIR:
			cmd = new Ouvrir();
			break;
		case SAUVEGARDER :
			cmd = new Sauvegarder();
			break;
		default:
			cmd = new Rien();
			break;
		}
		
		cmd.execute();
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

	public ImageModel getImage() {
		return image;
	}

	public void setImage(BufferedImage bufImg) {
		this.image.setImage(bufImg);
		this.setChanged();
		this.notifyObservers();
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

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		// call les repaints
		
	}
}
