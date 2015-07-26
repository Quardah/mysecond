package commandes;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4
Nom du fichier: Sauvegarder.java
Date cree: 2015-07-19
*******************************************************
* Classe concrete Sauvegarder
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version Fonctionelle
*******************************************************/

import javax.imageio.ImageIO;

import backEnd.Controleur;
import backEnd.ImageModel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// faut trouver une facon de out du programme l'image modifier dans le buffer vers le disque.

public class Sauvegarder extends Commande {
	private Controleur controleur;

	private ImageModel pictureMemoire;
	
	public Sauvegarder(){
		this.controleur = Controleur.getControleur();
	}

	public void execute() {

		// execute save action

		// Enregistre les fichiers JPG uniquemente

		String format = "JPG";

		BufferedImage image = controleur.getImageModel().getImage();

		try {

			ImageIO.write(image, format,

			//works only on linux now
					
			new File("~/Documents/image.jpg"));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}