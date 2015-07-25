package commandes;

/******************************************************
 * Cours: LOG121 Projet: laboratoire #4 Nom du fichier: Commande.java Date cree:
 * 2015-07-17
 *******************************************************
 * Classe abstract commande. Dictes simplement que les commandes doivent avoir
 * une méthode execute();
 *******************************************************
 * Historique des modifications
 *******************************************************
 * @author Jean-Pierre Bertrand Dorion & Vincent N Cicciu.
 * @author Carl-Hendi Codio & Mohammed Nacereddine Toros. 2015-07-19 Version
 *         initiale 2015-07-20 Version Finale.
 *******************************************************/
public abstract class Commande {
	
	public enum TypeCommande { DEFAIRE, REFAIRE, CHARGERMEMENTO, SAUVERMEMENTO, TRANSLATER, ZOOMER, QUITTER };

	public abstract void execute();
}