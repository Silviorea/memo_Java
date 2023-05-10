package ERROR_EXCEPTIONS.GESTION_EXCEPTIONS.Transmettre_Exception;

import java.io.FileNotFoundException;

/*
 * Principe de la PATATE CHAUDE : Je l'attrape, je veux pas me bruler donc je la passe le plus vite possible
 * 
 * Pour l'exemple j'écris une méthode qui lit un fichier txt. Si jamais le fichier n'éxiste pas cela va générer une exception.
 */



public class Transmettre_une_Exception {

	public static void main(String[] args) {
 	
	}
	
	
	public String readFromFile() throws FileNotFoundException //<= Je veux ajouter "throws" + le type d'exception que je souhaite remonter
	{
		
		String line = readLine();
		
		return line;
		
	}



	
	
	
	
	
	

	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
