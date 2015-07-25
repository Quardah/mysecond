package vue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuListener;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: MenuFenetre.java
Date cree: 2015-07-21
*******************************************************
* Classe du menu de la fenetre. Contient les actions
* selectionnable via menus en haut du frame.
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-21 Version initiale
2015-07-22 Version Fonctionelle
*******************************************************/


public class MenuFenetre extends JMenuBar {
	
	/**
	 * ?
	 */
	private static final long serialVersionUID = 1L;
	
	JMenu aide , fichier , modifier, quitter;
	JMenu zoom , importer , save , undo ;
	

	//private Controlleur maincontrolleur = null;
	
	public MenuFenetre() {
		//maincontrolleur = getControlleur();
		 Frameprincipale();	
	}
	
	protected void Frameprincipale(){
		addMenuFichier();
		addMenuModifier();
		addMenuaAide();	
	}

	protected void addMenuFichier(){
		fichier = new JMenu("Fichier");
		fichier.add("Ouvrir Image");
		fichier.add("Sauvegarder Image");
		fichier.add("Quitter");
		add(fichier);
	}
	
	protected void addMenuModifier(){
		modifier = new JMenu("Modifier");
		modifier.add("Filtres");
		modifier.add("Zoom");
		add(modifier);
	}
	
	protected void addMenuaAide(){
		aide = new JMenu("Aide");
		aide.add("try harder");
		add(aide);
	}
	
}
