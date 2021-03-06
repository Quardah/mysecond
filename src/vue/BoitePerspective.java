package vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Observable;

import backEnd.Controleur;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: Boite.java
 * Date cree: 2015-07-22
 *******************************************************
 * Classe Boite. Defini une boite contenant une image
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-22 Version Initiale sa marche pas
 * 2015-07-22 Version qui implements finalement swing.JPanel fak sa marche
 * 2015-07-23 Version Finale. 
 * 2015-07-23 Nouvelle version finale qui extends pu 
 * 				ActionListener parce que sa sert a rien.
 *******************************************************/

public class BoitePerspective extends Boite {

	private static final long serialVersionUID = 589087543987932402L;

	public BoitePerspective(int positionx, int positiony, int Largeur, int Longueur) {
		super(positionx, positiony, Largeur, Longueur);
	}

	protected void paintComponent(Graphics g) {
		if (img != null) {
			if (img.getImage() != null) {
				
				Point offset = new Point(0 - img.getPositionX(), 0 - img.getPositionY());
				int newImageWidth = img.getImage().getWidth() * (int) img.getFacteurZoom();
				int newImageHeight = img.getImage().getHeight() * (int) img.getFacteurZoom();
				
				System.out.println("SMTH : " + img.getFacteurZoom());
				
				g.clearRect(0, 0, getWidth(), getHeight());
				g.clearRect(0, 0, getWidth(), getHeight());
				g.drawImage(img.getImage(), offset.x, offset.y, (img.getImage().getWidth() * (int) img.getFacteurZoom()) - 1,
						(img.getImage().getHeight() * (int) img.getFacteurZoom()) - 1, null);
			}
		}
	}

}
