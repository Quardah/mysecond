package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import backEnd.Controleur;
import backEnd.ImageModel;

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
 *         2015-07-23 Version Finale.
 *         2015-07-23 Nouvelle version finale qui extends pu ActionListener 
 *         parce que sa sert a rien basicly.
 *******************************************************/

public class Boite extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	protected ImageModel img;

	public Boite(int positionx, int positiony, int Largeur, int Longueur) {
		this.setBounds(positionx, positiony, Largeur, Longueur);
		this.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Controleur controleur = (Controleur) arg0;
		this.img = controleur.getImageModel();
		repaint();
	}

	protected void paintComponent(Graphics g) {
		if (img != null) {
			if (img.getImage() != null) {
				System.out.println("DEBUG X :" + img.getPositionX() + "Y :" + img.getPositionY());
				Point offset = new Point(0 - img.getPositionX(), 0 - img.getPositionY());
				
				g.clearRect(0, 0, getWidth(), getHeight());
				g.drawImage(img.getImage(), offset.x, offset.y, img.getImage().getWidth() - 1,
						img.getImage().getHeight() - 1, null);
			}
		}
	}
}
