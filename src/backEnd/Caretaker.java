package backEnd;

import java.util.ArrayList;

/******************************************************
 * Cours: LOG121
 * Projet: laboratoire #4
 * Nom du fichier: CareTaker.java 
 * Date cree: 2015-07-19
 *******************************************************
 * Classe concrete du gestionnaire d'etat "Memento". Permet de reprendre un
 * etat.
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-22 Version
 *         Initiale.
 *******************************************************/

public class Caretaker {

	protected ArrayList<Memento> mementoList = null;

	public Caretaker(ArrayList<Memento> mementoList) {
		this.mementoList = mementoList;
	}

	public void add(Memento memento) {
		mementoList.add(memento);
	}

	public Memento loadMemento(int nb) {
		return mementoList.get(nb);
	}

	public int getNbMemento() {
		return mementoList.size();
	}
}
