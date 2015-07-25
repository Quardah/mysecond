package vue;

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

import java.io.*;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

// faut trouver une facon de out du programme l'image modifier dans le buffer vers le disque.

public class Sauvegarder extends Commande {

	private ImageModel pictureMemoire;

	@Override
	public void execute() {

		// execute save action

		// Enregistre les fichiers JPG uniquement

		String format = "JPG";

		BufferedImage image = pictureMemoire.getImage();

		try {

			ImageIO.write(image, format,

			new File("C://Users/chcodio/Documents/image.jpg"));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}