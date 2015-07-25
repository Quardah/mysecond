package commandes;


/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Quitter.java
Date cree: 2015-07-21
*******************************************************
* Classe pour quitter. Est une commande.
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-21 Version initiale
2015-07-22 Version Fonctionelle
*******************************************************/


public class Quitter extends Commande{
	
	public Quitter(){
	}

	@Override
	public void execute()  {
		   System.exit(0);
	}
}
