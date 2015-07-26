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
	private double facteurZoom;
	private ImageModel image;

	public Zoomer() {
		this.controleur = Controleur.getControleur();
		this.image = controleur.getImageModel();
		this.facteurZoom = image.getFacteurZoom();
	}

	@Override
	public void execute() {
		image.setFacteurZoom(facteurZoom);
	}
}
