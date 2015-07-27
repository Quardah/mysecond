package commandes;

import backEnd.Controleur;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: ChargerMemento.java
 * Date cree: 2015-07-19
 *******************************************************
 * Classe Commande permettant de charger un memento particulier
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-22 Version Initiale. 
 * 2015-07-23 Version manquant l'indice pour charger le bon memento.
 * 2015-07-24 Version Finale.
 *******************************************************/

public class ChargerMemento extends Commande {
	private Controleur controleur;
	private int index = 0;

	public ChargerMemento(int a) {
		this.controleur = Controleur.getControleur();
		this.index = a;
	}

	public void execute() { // trouver facon statique de prendre indice dans le
							// runtime
		controleur.loadMemento(this.index);
	}

}
