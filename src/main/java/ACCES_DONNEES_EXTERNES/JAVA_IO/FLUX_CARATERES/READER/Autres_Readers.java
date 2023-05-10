package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER;

import java.io.CharArrayReader;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;

import CLASSES.CHARACTER.Chars;

public class Autres_Readers {

	public static void main(String[] args) {
		
		
		
		// Gestion des flux textuels vers des buffers en mémoire ...
		
		
		
		// ... de String
		
		Reader stringReader = new StringReader("my string");	
		
		
		
		// ... ou de tableau de caractères
		
		char[] JavaCharArray = {'r', 's', 't', 'u', 'v'};
		CharArrayReader charArrayReader = new CharArrayReader(JavaCharArray);
		

	}

}
