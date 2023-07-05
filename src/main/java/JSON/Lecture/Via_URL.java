package JSON.Lecture;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import JSON.model.MonModel;

public class Via_URL {
	

	
	public static void main(String[] args) throws StreamReadException, DatabindException, MalformedURLException, IOException {
		
		 String url = "https://example.com/data.json"; // URL du fichier JSON
		
	     ObjectMapper objectMapper = new ObjectMapper(); // Initialise l'objet ObjectMapper
	     
	     MonModel monModel = objectMapper.readValue(new URL(url), MonModel.class); // Lit les données JSON à partir de l'URL et les stocke dans l'objet MonModel
	}
}
