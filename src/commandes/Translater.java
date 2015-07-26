package commandes;

import backEnd.Controleur;
import backEnd.ImageModel;

/******************************************************
 * Cours: LOG121 Projet: laboratoire #4 Nom du fichier: Tranlater.java Date
 * cree: 2015-07-19
 *******************************************************
 * Classe concrete pour la translation
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-19 Version
 *         initiale 2015-07-22 Version Fonctionelle.
 *******************************************************/

public class Translater extends Commande {

	private Controleur controleur;
	
	public Translater(){
		this.controleur = Controleur.getControleur();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		controleur.getImageModel().setPositionXY(controleur.getPositionx(), controleur.getPositiony());
//		System.out.println("Translator : \n- X : " + controleur.getPositionx() + "\n- Y : " + controleur.getPositiony());

	}

}
