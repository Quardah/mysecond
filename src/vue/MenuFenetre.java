package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import commandes.Commande;
import commandes.Commande.TypeCommande;
import backEnd.Controleur;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: MenuFenetre.java
 * Date cree: 2015-07-21
 *******************************************************
 * Classe du menu de la fenetre. Contient les actions selectionnable via menus
 * en haut du frame.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-21 Version initiale 
 * 2015-07-22 Version Fonctionelle
 *******************************************************/

public class MenuFenetre extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private Controleur controleur = null;
	private int nbmemento = 0;

	private JMenu aide, fichier, modifier;
	private JMenuItem ouvririmage, saveimage, quit, defaire, refaire, savemem, zoomdeux, zoomquatre;
	private JMenu loadmem;
	
	public MenuFenetre() {
		this.controleur = Controleur.getControleur();
		addMenuFichier();
		addMenuModifier();
	}

	protected void addMenuFichier() {
		fichier = new JMenu("Fichier");
		
		ouvririmage = new JMenuItem("Ouvrir Image");
		ouvririmage.addActionListener(new OpenLis());
		fichier.add(ouvririmage);
		
		saveimage = new JMenuItem("Sauvegarder Image");
		saveimage.addActionListener(new SaveLis());
		fichier.add(saveimage);
		
		quit = new JMenuItem("Quitter");
		quit.addActionListener(new QuitLis());
		fichier.add(quit);
		
		add(fichier);
	}
	
	protected void addMenuModifier() {
		modifier = new JMenu("Modifier");
		
		defaire = new JMenuItem("Defaire");
		defaire.addActionListener(new UndoLis());
		modifier.add(defaire);
		
		refaire = new JMenuItem("Refaire");
		refaire.addActionListener(new RedoLis());
		modifier.add(refaire);

		loadmem = new JMenu("Charger Memento");
		modifier.add(loadmem);
		
		savemem = new JMenuItem("Sauver Memento");
		savemem.addActionListener(new SaveMemLis());
		modifier.add(savemem);
		
		zoomdeux = new JMenuItem("Zoom x2");
		zoomdeux.addActionListener(new ZoomLis2());
		modifier.add(zoomdeux);
		
		zoomquatre = new JMenuItem("Zoom x4");
		zoomquatre.addActionListener(new ZoomLis4());
		modifier.add(zoomquatre);


		add(modifier);
	}
	
	private class ZoomLis2 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(controleur.getZoomLevel() == 2) {
				controleur.setZoomLevel(1);
			} else {
				controleur.setZoomLevel(2);
			}
			
			controleur.runCommande(Commande.TypeCommande.ZOOMER);
		}
	}
	
	private class ZoomLis4 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(controleur.getZoomLevel() == 4) {
				controleur.setZoomLevel(1);
			} else {
				controleur.setZoomLevel(4);
			}
			
			controleur.runCommande(Commande.TypeCommande.ZOOMER);
		}
	}
	
	private class UndoLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.runCommande(Commande.TypeCommande.DEFAIRE);
		}
	}
	
	private class RedoLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.runCommande(Commande.TypeCommande.REFAIRE);
		}
	}
	
	private class LoadMemLis implements ActionListener {
		private int index;
		
		public LoadMemLis(int nb) {
			this.index = nb;
		}

		public void actionPerformed(ActionEvent arg0) {
			controleur.setIndex(index);
			controleur.runCommande(Commande.TypeCommande.CHARGERMEMENTO);
		}
	}
	
	private class SaveMemLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ajouterMemento(nbmemento);
			nbmemento++;
			controleur.runCommande(Commande.TypeCommande.SAUVERMEMENTO);
		}
	}
	
	private class QuitLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.runCommande(Commande.TypeCommande.QUITTER);
		}
	}
	
	private class OpenLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.runCommande(Commande.TypeCommande.OUVRIR);
		}
	}
	
	private class SaveLis implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			controleur.runCommande(Commande.TypeCommande.SAUVEGARDER);
		}
	}
	
	public void ajouterMemento(int nb) {
		JMenuItem nextmemento = new JMenuItem("" + nb + "");
		nextmemento.addActionListener(new LoadMemLis(nb));
		loadmem.add(nextmemento);
	}
	
}