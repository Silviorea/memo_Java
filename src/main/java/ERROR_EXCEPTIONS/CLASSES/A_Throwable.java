package ERROR_EXCEPTIONS.CLASSES;


// Toutes les classes qui étendent THROWABLE vont modéliser des erreurs


public class A_Throwable {

	public static void main(String[] args) {
		
		
		Throwable t = new Throwable();
		
		
		// 3 propriétés principales
		
		
		
		
		// MESSAGE D'ERREUR
		// Permet de porter le message d'erreur
		t.getMessage();
		
		
		// STACK TRACE
		// Permet d'afficher la stack trace (enchainement d'appel de méthode qui a générer l'erreur)
		t.printStackTrace();
		
		
		// ROOT CAUSE
		// Si une erreur est liée à une autre

	}

}
