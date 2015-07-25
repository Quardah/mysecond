package commandes;

/******************************************************
 * Cours: LOG121 Projet: laboratoire #4 Nom du fichier: Quitter.java Date cree:
 * 2015-07-21
 *******************************************************
 * Classe pour ouvrir un nouveau fichier. Est une commande.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-21 Version
 *         initiale 2015-07-22 Version Fonctionelle
 *******************************************************/


import java.io.IOException;

import backEnd.Controleur;
import backEnd.ImageModel;

public class Ouvrir extends Commande {
	private Controleur controleur;

	public Ouvrir() {
		this.controleur = Controleur.getControleur();
	}

	public void execute() {
		try {
			this.controleur.setImage(new ImageModel());
		} catch (IOException e) {
			System.out.println("Bad File");
		}
	}
	
	
}
