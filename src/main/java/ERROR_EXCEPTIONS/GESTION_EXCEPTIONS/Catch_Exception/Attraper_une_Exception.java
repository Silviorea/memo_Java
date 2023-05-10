package ERROR_EXCEPTIONS.GESTION_EXCEPTIONS.Catch_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

// Permet de traiter l'Exception localement



public class Attraper_une_Exception {

	public static void main(String[] args) {

	}
	
	
	
// Lorsque je vais appeler ma méthode ...
	
	public String readFromFile() 
	{
		String line = "J'initialise ma variable";
		
// ... je vais essayer de lire le code dans le bloc TRY ...		
		try {
			
			line = readLine();
			int number = Integer.parseInt(line);
			
			return line + number;
		} 

// ... en cas de problème, je vais attraper une exception via le bloc CATCH et lui invoquer les méthode de THROWABLE
		
		catch (NumberFormatException | NullPointerException e) {
			
			e.getMessage();
			e.printStackTrace();
			
		}
		
		
		
// Quoiqu'il arrive, je vais executer le code du FINALLY	
		
		finally 
		{
			/*
			 * Dans ce bloc je mets le code qui doit absolument etre executé, exception ou pas
			 */
			
		}
		
		
		
		
// Ne JAMAIS mettre de return dans les bloc "catch" et "finally"		
		return line;

	}

	
	
	
	
	
	
	

	private String readLine() {
		
		String readLine = null;
		return readLine;
	}
	
	
	

}
