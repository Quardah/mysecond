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

public class ImageModel extends Observable {

	protected BufferedImage image;
	private double facteurZoom;
	private int positionX;
	private int positionY;

	public ImageModel() throws IOException {
		this.image = null;
		this.facteurZoom = 1;
		this.positionX = 0;
		this.positionY = 0;
	}

	public void setFacteurZoom(double afacteurZoom) {
		this.facteurZoom = afacteurZoom;
	}

	public void setPositionXY(int posX, int posY) {
		this.positionX = posX;
		this.positionY = posY;
	}

	public BufferedImage getImage() {
		return image;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
