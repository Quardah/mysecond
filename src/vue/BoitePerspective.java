package vue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Observable;

import backEnd.Controleur;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Boite.java
Date cree: 2015-07-22
*******************************************************
* Classe Boite. Defini une boite contenant une image
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-22 Version Initiale sa marche pas
2015-07-22 Version qui implements finalement swing.JPanel fak sa marche
2015-07-23 Version Finale.
2015-07-23 Nouvelle version finale qui extends pu ActionListener parce que sa sert a rien.
*******************************************************/

public class BoitePerspective extends Boite {
	
	private static final long serialVersionUID = 589087543987932402L;
	
	public BoitePerspective(int positionx, int positiony, int Largeur, int Longueur){
		super(positionx, positiony, Largeur, Longueur);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("OKSAUPDATE");
		memeImageQueControlleur = Controleur.getControleur().getImage();
		
		repaint();
	}
	
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
    	System.out.println("PAINT DEQUOI");
    	if (memeImageQueControlleur != null) {
    		g.clearRect(0, 0, getWidth(), getHeight());	
    		g.drawImage(memeImageQueControlleur, 0, 0, memeImageQueControlleur.getWidth() - 1, memeImageQueControlleur.getHeight() - 1, null);
    	}
    }
	
}
