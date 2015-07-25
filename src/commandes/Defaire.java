package commandes;

import backEnd.Controleur;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Defaire.java
Date cree: 2015-07-19
*******************************************************
* Classe concrete de Undo. C'est l'inverse de Redo, en français. 
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version Fonctionelle
*******************************************************/

// permet de reculer de 1 versus le memento loader presentement.

public class Defaire extends Commande {
	private Controleur controleur;
	
	public Defaire() {
		this.controleur = Controleur.getControleur();
	}
	
	public void execute(){
		if (controleur.hasPrevious()) {
			controleur.loadMemento(controleur.getCurrentMemento() - 1);
		} else {
			System.out.println("NO PREVIOUS\n");
		}
	}

}
