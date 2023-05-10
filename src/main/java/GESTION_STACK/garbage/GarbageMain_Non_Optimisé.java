package GESTION_STACK.garbage;


public class GarbageMain_Non_Optimisé {

	public static void main(String[] args) {
		
		
		
		/*
		 * Explication : 
		 * Ici Article va rester en mémoire tant que la GROSSE METHODE ne sera pas terminé,
		 * ce qui peut prendre du temps.
		 * 
		 * L'OBJET va rester en mémoire TANT QUE LE BLOC DANS LEQUEL IL EST INSTANCIE n'est pas terminé...
		 */
		
		
		Article article = new Article();
		
		
		boolean isTrue = false;
		
		
		if (isTrue)
		{
			
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
