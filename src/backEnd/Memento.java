package backEnd;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: Memento.java
 * Date cree: 2015-07-19
 *******************************************************
 * Classe concrete d'un Memento. Il s'agit d'un "snapshot" de l'image présente
 * dans le runtime.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 
 * 2015-07-22 Version Initiale.
 *******************************************************/

// un etat signifie une alteration de l'image.

public class Memento {
	private ImageModel etat;

	public Memento(ImageModel etat) throws CloneNotSupportedException {
		this.etat = new ImageModel();
		this.etat = (ImageModel) etat.clone();
		System.out.println("DEBUG: FROM : " + etat + "  .TO. : " + this.etat);
	}

	public ImageModel getEtat() {
		System.out.println("LOAD:   " + etat);
		return etat;
	}

}
