package GESTION_STACK.garbage;

public class Garbage_Main_Optimisée {
	
public static void main(String[] args) {
		
		
		
		/*
		 * Explication : 
		 * Ici Article ne va pas rester en mémoire lgtps car il est instancié au plus proche de son appel ,
		 * 
		 * Il va se faire GarbageCollecté une fois la boucle terminé,
		 * 
		 * sans attendre que le GROSSE METHODE finisse.
		 * 
		 * Ce qui prend de la place en mémoire ce n'est pas l'instance mais la classe qu'elle instancie.
		 * 
		 * A partir du moment où il reste 1 pointeur d'une classe actif, le garbage collector ne s'en occupera pas
		 * 
		 */
	
	
	
		
		
		boolean isTrue = false;
		
		if (isTrue)
		{
			Article article = new Article();	// Mauvais exemple car ici instancier dans une boucle n'est pas terrible mais l'idée est la
			article.methodeCourte();
			
		}
		
		methodeQuiPrendBcpDeMemoire();

	}
	
	
	
	
	
	
	
	
	
	
	
	

	private static void methodeQuiPrendBcpDeMemoire() {
		// TODO Auto-generated method stub
		
	}



	private static void methodeCourte() {
		// TODO Auto-generated method stub
		
	}

	private static void methodeLongue() {
		// TODO Auto-generated method stub
		
	}


}
