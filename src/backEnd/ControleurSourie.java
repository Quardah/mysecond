package backEnd;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

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
					controleur.setPositiony(event.getPoint().y);
					controleur.runCommande(Commande.TypeCommande.TRANSLATER);
										 
					median =  event.getPoint();
				}
			}
		}
	}
	
	public void mouseReleased(MouseEvent event) {
		if (controleur.hasImage()) {
			if (event.getButton() == MOUSE_LEFT_CLICK){
				fin = event.getPoint();
				if(debut != null) {
					controleur.setPositionx(debut.x - fin.x);
					controleur.setPositionx(debut.y - fin.y);
					controleur.runCommande(Commande.TypeCommande.TRANSLATER);
				}
			}
		}
	}
	public void mouseWheelMoved(MouseWheelEvent e) {
		Point pos = new Point(controleur.getPositionx(), controleur.getPositiony());
		Point dimension = new Point();
		dimension.x = (int)(e.getX()*(0.9f - 1f) + 0.9f*pos.x);
		dimension.y = (int)(e.getY()*(0.9f - 1f) + 0.9f*pos.y);
		controleur.setZoomLevel(e.getWheelRotation());
		controleur.runCommande(Commande.TypeCommande.ZOOMER);
	}

}
