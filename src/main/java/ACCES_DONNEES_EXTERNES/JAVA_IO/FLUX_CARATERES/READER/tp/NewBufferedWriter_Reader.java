package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER.tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Méthodes static de la classe factory FILES qui fonctionne avec des Path


public class NewBufferedWriter_Reader {

	public static void main(String[] args) throws IOException {
		
		
		Path path = Path.of("files/Fichier.txt");
		
		Files.newBufferedWriter(path);
		
		Files.newBufferedReader(path);
		
		
		
		

	}

}
