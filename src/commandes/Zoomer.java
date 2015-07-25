package commandes;

import backEnd.ImageModel;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Zoomer.java
Date cree: 2015-07-19
*******************************************************
* Classe concrete zoomer
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version fonctionelle
*******************************************************/

public class Zoomer extends Commande {
	
	private double facteurZoom;
	private ImageModel image;

	public Zoomer(){
		// vide?
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		image.setFacteurZoom(facteurZoom);
		
	}
}
 
    


