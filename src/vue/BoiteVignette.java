package vue;

import java.awt.Graphics;
import java.util.Observable;

import backEnd.Controleur;

/******************************************************
 * Cours: LOG121 Projet: laboratoire #4 Nom du fichier: Boite.java Date cree:
 * 2015-07-22
 *******************************************************
 * Classe Boite. Defini une boite contenant une image
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-22 Version
 *         Initiale sa marche pas 2015-07-22 Version qui implements finalement
 *         swing.JPanel fak sa marche 2015-07-23 Version Finale. 2015-07-23
 *         Nouvelle version finale qui extends pu ActionListener parce que sa
 *         sert a rien.
 *******************************************************/

public class BoiteVignette extends Boite {

	private static final long serialVersionUID = 79857983724987984L;

	public BoiteVignette(int positionx, int positiony, int Largeur, int Longueur) {
		super(positionx, positiony, Largeur, Longueur);
	}

	protected void paintComponent(Graphics g) {
		// super.paintComponent(g);
		if (img != null) {
			if (img.getImage() != null) {
				g.clearRect(0, 0, getWidth(), getHeight());
				g.drawImage(img.getImage(), 0, 0, img.getImage().getWidth() - 1,
						img.getImage().getHeight() - 1, null);
			}
		}
	}

}
