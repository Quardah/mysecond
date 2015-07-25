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

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class FenetrePrincipale extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
					try {
						new Frame();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		});
	}
}
