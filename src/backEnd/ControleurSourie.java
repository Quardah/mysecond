package backEnd;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import commandes.Commande;

public class ControleurSourie extends MouseAdapter {

	private static final int MOUSE_LEFT_CLICK = MouseEvent.BUTTON1;
	private static final int MOUSE_RIGHT_CLICK = MouseEvent.BUTTON3;
	
	private Controleur controleur;
	private Point debut, fin, median;
	
	public ControleurSourie() {
		controleur = Controleur.getControleur();
	}
	
	public void mousePressed(MouseEvent event) {
		if (controleur.hasImage()) {
			if (event.getButton() == MOUSE_LEFT_CLICK){
				debut = event.getPoint();
			}
		}
	}
	
	public void mouseDragged(MouseEvent event) {
		if (controleur.hasImage()) {
			if ((event.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0 ) {
				if(debut != null) {
					if (median == null) median = debut;
					
					controleur.setPositionx(event.getPoint().x);
					controleur.setPositionx(event.getPoint().y);
					controleur.runCommande(Commande.TypeCommande.TRANSLATER);
										 
					median =  event.getPoint();
				}
			}
		}
	}

}
