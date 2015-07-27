package backEnd;

import java.util.ArrayList;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 JavaPaint
Nom du fichier: Factory.java
Date cree: 2015-07-15
*******************************************************
* Classe definissant la factory pour le backend.
*******************************************************
Historique des modifications
*******************************************************
@author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
@author Carl-Hendi Codio & Mohammed Nacereddine Toros.
2015-07-22 Version Initiale.
2015-07-26 Version Finale
*******************************************************/

public class Factory {
	
	public Factory() {
	}
	
	public Caretaker makeCaretaker(){
		ArrayList<Memento> mementoList = new ArrayList<Memento>();
		return new Caretaker(mementoList);
	}

	public ImageModel makeImage(){
		return new ImageModel();
	}
}
