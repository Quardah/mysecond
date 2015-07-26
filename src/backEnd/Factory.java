package backEnd;

import java.util.ArrayList;

/******************************************************
Cours:  LOG121
Projet: laboratoire #4 JavaPaint
Nom du fichier: Factory.java
Date cree: 2015-07-15
*******************************************************
* Classe definissant la factory pour le backend. La factory ne fonctionne
* que sur le backend, simplement parce que les autres packages
*******************************************************
Historique des modifications
*******************************************************
*@author Jean-Pierre Bertrand Dorion
2015-07-23 Version Initiale
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
