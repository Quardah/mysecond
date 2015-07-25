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
import backEnd.ImageModel;


public class Frame extends JFrame  {
	
	/**
	 * ?
	 */
	private static final long serialVersionUID = 749876921641L;
	private JPanel panneau = new JPanel();
	private MenuFenetre menu ;
	private Controleur ConTemp = null; //ConTemp = controlleur temporaire
	private ImageModel ImageTampon = null;
	//private Graphics g;

	public Frame() throws IOException {
		
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setTitle("FenetrePrincipal Lab4");
		menu = new MenuFenetre();
		add(menu, BorderLayout.NORTH);

		panneau = new JPanel();
		panneau.setLayout(null);
		JPanel label1 = new JPanel();
		label1.setBounds(39,70,80,20);
		label1.add(new JLabel("VIGNETTE"));
		JPanel label2 = new JPanel();
		label2.setBounds(214,75,80,20);
		label2.add(new JLabel("MAIN"));
		JPanel label3 = new JPanel();
		label3.setBounds(457,75,120,20);
		label3.add(new JLabel("PERSPECTIVE"));
		
		BoiteVignette BoiteV = new BoiteVignette(39,90,136,176);
		Boite BoiteMain = new Boite(214,95,204,264);
		BoitePerspective BoiteP = new BoitePerspective(457,95,204,264);
		
		panneau.add(label1);
		panneau.add(label2);
		panneau.add(label3);
		panneau.add(BoiteV);
		panneau.add(BoiteMain);
		panneau.add(BoiteP);
		
		ConTemp = Controleur.getControleur();
		try {
		ImageTampon = new ImageModel();
		} catch(IOException e) {
			System.out.println("Pas supposé fail");
			System.out.println("Si sa a fail ici ben le programme a juste brise");
			System.exit(0);
		}
		ImageTampon.addObserver(BoiteV);
		ImageTampon.addObserver(BoiteMain);
		ImageTampon.addObserver(BoiteP);
		ConTemp.setImage(ImageTampon);
		ImageTampon.notifyObservers();

		this.add(panneau,  BorderLayout.CENTER);
		setVisible(true);
	}
	


}