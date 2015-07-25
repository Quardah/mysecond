package commandes;

import backEnd.Controleur;
import backEnd.ImageModel;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Tranlater.java
Date cree: 2015-07-19
*******************************************************
* Classe concrete pour la translation
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version Fonctionelle.
*******************************************************/

public class Translater extends Commande {
	
	private int positionX, positionY;
	private ImageModel image;
	private Controleur controleur;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		image.setPositionXY(controleur.getPositionx(),controleur.getPositiony());
		
	}	
	
	
	
	

}
