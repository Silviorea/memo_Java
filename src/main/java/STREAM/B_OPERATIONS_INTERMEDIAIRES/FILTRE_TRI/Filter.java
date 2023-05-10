package STREAM.B_OPERATIONS_INTERMEDIAIRES.FILTRE_TRI;

import java.util.stream.Stream;

/*
 *  - Conserve le type
	- Ne conserve pas le nombre d’objet
 */

// On filtre le stream a l'aide d'un PREDICAT


public class Filter {

	public static void main(String[] args) {

		
		Stream<String> myStream = Stream.of("one", "two", "three")
				.filter( string -> string.length() > 3 );
		

	}

}
