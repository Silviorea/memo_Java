package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Classe abstraite qui définit des opérations de base : lire un caract ou tableau de carac
// plusieurs pattern




public class A_FileReader_Classe{

	public static void main(String[] args) {
		
	
	// METHODES DISPO	
		
		//		read 					// lire caractère
		//		read					// lire un tableau de caractère
		//		skip					// sauter des caractères
		//		close					// fermer les ressources une fois utilisées
		
		
		
		
		
		File file = new File("files/Fichier.txt");
		
		
		
		//////////////////////////////////////////////////
		// DEPUIS JAVA 7 => Pattern Try_With_Ressources //
		//////////////////////////////////////////////////
		
		
		// On passe le reader en paramètre du TRY
		
		
		try (Reader reader = new FileReader(file))
		
		{
			// Code de lecture
			// Close se fait automatiquement avec Try with Ressources
			
			// ON UTILISE LE STRINGBUILDER ET SA METHODE APPEND POUR CREER DES STRING EN UTILISANT LES CHARS DU FICHIER
			
		} 
		
		
		catch (IOException e) {
			// TODO: handle exception
		}
		
// PAS DE BLOC FINALLY
		
		
		
		
		

		
	
	//////////////////////////////////	
	// PATTERN READER jusqu'à JAVA 6 /	
	//////////////////////////////////	
		
		
		
		
		Reader reader = null;
		
		try {
		
			reader = new FileReader(file);
		
			// tout le code de lecture
			
		} 
		
		
		catch (IOException e) {
			// TODO: handle exception
		}
		
		
		finally {
			
			try {
				
				if (reader != null)
				{
					reader.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		

	}

}
