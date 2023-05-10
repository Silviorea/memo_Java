package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

// Classe qui extend Reader.

// Le constructeur du BR prend une instance de Reader en paramètre

public class BufferedReader_Classe {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("files/Fichier.txt");
		Reader reader = new FileReader(file);
		
		BufferedReader myBR = new BufferedReader(reader);
		
		
		
		// Méthodes
		
		myBR.readLine();						//<= Lire les lignes une par une
		myBR.lines();							//<= Stream de String de chaque ligne

		
		
// BufferedReader étend une autre classe qui se construit de la meme manière que lui
		
		LineNumberReader lnr = new LineNumberReader(myBR);
		lnr.getLineNumber();					//<= Retroune le numéro de ligne que je lis
		
		
		
		
		////////////
		// PATTERN//
		////////////
		
		try (Reader myReader = new FileReader(file); BufferedReader br = new BufferedReader(reader))
		{
			
		} 
		
		catch (IOException e) {
			// TODO: handle exception
		}
		
		
	}

}
