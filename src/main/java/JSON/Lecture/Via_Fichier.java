package JSON.Lecture;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import JSON.model.MonModel;

public class Via_Fichier {
	
	 public static void main(String[] args) throws Exception {
		 
	        String fileName = "monFichier.json"; // Nom du fichier JSON
	        
	        ObjectMapper objectMapper = new ObjectMapper(); // Initialise l'objet ObjectMapper
	        
	        MonModel monModel = objectMapper.readValue(new File(fileName), MonModel.class); // Lit les données JSON à partir du fichier et les stocke dans l'objet MyData
	        
	        System.out.println(monModel); // Affiche les données lues
	        
	        
	    }
}
