package STREAM.B_OPERATIONS_INTERMEDIAIRES.CONVERSION;

import java.util.stream.Stream;

/*
 *  Grace au Mapping on va : 
 *  - changer le type d’un ensemble de données
	- conserver leur nombre
	- conserver l’ordre
 */

// S'utilise avec une FUNCTION 

public class MAP {

	public static void main(String[] args) {
		
		Stream <Integer> myStream = 
				Stream.of("one", "two", "three")
				
				.map( s -> s.length() );
		
	}

}
