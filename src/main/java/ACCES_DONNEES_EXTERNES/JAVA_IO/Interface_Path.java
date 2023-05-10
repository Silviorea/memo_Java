package ACCES_DONNEES_EXTERNES.JAVA_IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Interface_Path {
 
	public static void main(String[] args) {
		
		// En JAVA 11 + 
		Path p = Path.of("files/Fichier.txt");
		
		// Avant Java 11
		Path p2 = Paths.get("chemin d'accès au fichier");
		
		
		System.out.println(Files.exists(p));
		
		;

	}

}
