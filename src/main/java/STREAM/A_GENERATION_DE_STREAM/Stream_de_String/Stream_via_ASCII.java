package STREAM.A_GENERATION_DE_STREAM.Stream_de_String;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_via_ASCII {

	public static void main(String[] args) {

		
	// Génération IntStream des CODES ASCII des char d'une String.
		
		String s = "Bonjour";
		IntStream asciiStream = s.chars();
		
		
	// Character.toString pour Génération d'un Stream<String> via le code ASCII 
		
		Stream<String> stream = 
				asciiStream.mapToObj(
						codeAscii -> Character.toString(codeAscii));
		
	}

}
