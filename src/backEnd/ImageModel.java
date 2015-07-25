package backEnd;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 JavaPaint
Nom du fichier: ConcreteImage.java
Date cree: 2015-07-15
*******************************************************
* Classe definissant le controlleur et son comportement
* permet d'agir et de faire des modifications sur l'image
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion
2015-07-15 Version Initiale (Live sa fait rien)
2015-07-22 Version Fonctionelle
*******************************************************/
import java.util.Observable;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class ImageModel extends Observable {

	protected BufferedImage image;
	protected static JFileChooser chooser = new JFileChooser();
	private double facteurZoom;
	private int positionX;
	private int positionY;

	public ImageModel() throws IOException {
		newImage();
	}

	public void setFacteurZoom(double afacteurZoom) {
		this.facteurZoom = afacteurZoom;
	}

	public void setPositionXY(int posX, int posY) {
		this.positionX = posX;
		this.positionY = posY;
	}

	public void newImage() throws IOException {
		chooser.showOpenDialog(null);
		try {
			image = ImageIO.read(chooser.getSelectedFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		notifyObservers();
	}

	public BufferedImage getImage() {
		return image;
	}

}
