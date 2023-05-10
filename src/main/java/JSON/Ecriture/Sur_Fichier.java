package JSON.Ecriture;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import JSON.model.MonModel;

public class Sur_Fichier {
	
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		String fileName = "output.json"; // Nom du fichier JSON
	 
		MonModel monModel = new MonModel("Alice", 25); // Crée un objet MyData à écrire dans le fichier JSON
		
    	ObjectMapper mapper = new ObjectMapper(); // Initialise l'objet ObjectMapper
     
     	mapper.writeValue(new File(fileName), monModel); // Écrit les données JSON dans le fichier
     
     
     	System.out.println("Les données ont été écrites dans le fichier " + fileName);

	}
	
}
