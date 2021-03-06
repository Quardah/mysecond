package vue;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 
Nom du fichier: Frame.java
Date cree: 2015-07-19
*******************************************************
* Classe Frame. Contient le main frame
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
*@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-19 Version initiale
2015-07-22 Version fonctionelle
2015-07-23 Version avec belle indentation
*******************************************************/

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import backEnd.Controleur;
import backEnd.ControleurSourie;
import backEnd.ImageModel;


public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panneau = new JPanel();
	private MenuFenetre menu = new MenuFenetre();
	private Controleur controleur = Controleur.getControleur();
	private ControleurSourie ctrl1, ctrl2;

	public Frame() throws IOException {
		JPanel labelVignette = new JPanel();
		JPanel labelMain = new JPanel();
		JPanel labelPerspective = new JPanel();
		BoiteVignette boiteVignette = new BoiteVignette(39, 90, 136, 176);
		Boite boiteMain = new Boite(214, 95, 204, 264);
		BoitePerspective boitePerspective = new BoitePerspective(457, 95, 204, 264);

		ctrl1 = new ControleurSourie();
		ctrl2 = new ControleurSourie();
		
		
		boiteMain.addMouseListener(ctrl1);
		boiteMain.addMouseMotionListener(ctrl1);
		boiteMain.addMouseWheelListener(ctrl1);
		
		boitePerspective.addMouseListener(ctrl2);
		boitePerspective.addMouseMotionListener(ctrl2);
		boitePerspective.addMouseWheelListener(ctrl2);
		
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setTitle("Labo 4");
		this.add(this.menu, BorderLayout.NORTH);

		this.panneau.setLayout(null);

		labelVignette.setBounds(39,70,80,20);
		labelVignette.add(new JLabel("VIGNETTE"));
		labelMain.setBounds(214,75,80,20);
		labelMain.add(new JLabel("MAIN"));
		labelPerspective.setBounds(457,75,120,20);
		labelPerspective.add(new JLabel("PERSPECTIVE"));

		this.panneau.add(labelVignette);
		this.panneau.add(labelMain);
		this.panneau.add(labelPerspective);
		this.panneau.add(boiteVignette);
		this.panneau.add(boiteMain);
		this.panneau.add(boitePerspective);

		this.controleur.addObserver(boiteVignette);
		this.controleur.addObserver(boiteMain);
		this.controleur.addObserver(boitePerspective);

		this.add(this.panneau,  BorderLayout.CENTER);
		this.setVisible(true);
	}
}
