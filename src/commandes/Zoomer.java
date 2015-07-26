package commandes;

import backEnd.Controleur;
import backEnd.ImageModel;

/******************************************************
 * Cours: LOG121 Projet: laboratoire #4 Nom du fichier: Zoomer.java Date cree:
 * 2015-07-19
 *******************************************************
 * Classe concrete zoomer
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-19 Version
 *         initiale 2015-07-22 Version fonctionelle
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

//	public void mouseWheelMoved(MouseWheelEvent e) {
//		Point pos = new Point(controleur.getPositionx(), controleur.getPositiony());
//		Point dimension = new Point();
//		dimension.x = (int)(e.getX()*(0.9f - 1f) + 0.9f*pos.x);
//		dimension.y = (int)(e.getY()*(0.9f - 1f) + 0.9f*pos.y);
//		controleur.setZoomLevel(e.getWheelRotation());
//		controleur.runCommande(Commande.TypeCommande.ZOOMER);
//	}