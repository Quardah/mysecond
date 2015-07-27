package commandes;

import backEnd.Controleur;
import backEnd.Memento;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: SauverMemento.java
 * Date cree: 2015-07-19
 *******************************************************
 * Classe Commande permettant de Sauver un nouveau Memento.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-22 Version
 *         Initiale. 2015-07-23 Version manquant l'imagemodel a sauvegarder. :/
 *         2015-07-24 Version Fonctionnelle passe par le controlleur.
 *******************************************************/

public class SauverMemento extends Commande {
	private Controleur controleur;

	public SauverMemento() {
		this.controleur = Controleur.getControleur();
	}

	public void execute() {
		try {
			controleur.nouveauMemento(new Memento(controleur.getImageModel()));
		} catch (CloneNotSupportedException e) {
			//Clone failed. Devrais jamais arriver.
			e.printStackTrace();
		}
		controleur.currentMementoIncrementation();
		controleur.change();
	}

}
