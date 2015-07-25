package commandes;
/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Sauvegarder.java
Date cree: 2015-07-19
*******************************************************
* Classe concrete Sauvegarder
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version Fonctionelle
*******************************************************/

import java.io.*;

public class Sauvegarder extends Commande{
	
	private String path = null;	

	@Override
	public void execute() {
		// execute save action
		System.out.println(path);
	}
	
	
	

}
