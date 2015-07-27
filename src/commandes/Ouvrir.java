package commandes;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: Quitter.java
 * Date cree: 2015-07-21
 *******************************************************
 * Classe pour ouvrir un nouveau fichier. Est une commande.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-21 Version Initiale 
 * 2015-07-22 Version Fonctionelle
 * 2015-06-26 Version Finale
 *******************************************************/


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import backEnd.Controleur;
import backEnd.ImageModel;

public class Ouvrir extends Commande {
	private Controleur controleur;
	protected static JFileChooser chooser = new JFileChooser();

	public Ouvrir() {
		this.controleur = Controleur.getControleur();
	}

	public void execute() {
		chooser.showOpenDialog(null);
		try {
			this.controleur.setImage(ImageIO.read(chooser.getSelectedFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
