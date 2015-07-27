package commandes;

import backEnd.Controleur;
import backEnd.ImageModel;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: Zoomer.java
 * Date cree: 2015-07-19
 *******************************************************
 * Classe concrete zoomer
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-19 Version initiale
 * 2015-07-22 Version fonctionelle
 * 2015-07-23 Version finale.
 *******************************************************/

public class Zoomer extends Commande {
	
	private Controleur controleur;
	private ImageModel image;

	public Zoomer() {
		this.controleur = Controleur.getControleur();
		this.image = controleur.getImageModel();
	}

	@Override
	public void execute() {
		image.setFacteurZoom(controleur.getZoomLevel());
		System.out.println("ZOOM : " + controleur.getZoomLevel());
	}

}

