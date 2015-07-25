package vue;
/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: FenetrePrincipale.java
Date cree: 2015-07-19
*******************************************************
* Classe definissant la FenetrePrincipale
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version fonctionelle
2015-07-23 Ya dequoi qui marche pas faut checker le run
*******************************************************/

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


public class FenetrePrincipale extends JFrame implements Observer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 338888666171414714L;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new Frame();
				} catch (IOException e) {
					System.out.println("Ce message devrait jamais être callé.");
				}
			}
		});
	}
	
	public FenetrePrincipale(){
	
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
