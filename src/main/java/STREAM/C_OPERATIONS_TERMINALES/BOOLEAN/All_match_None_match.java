package STREAM.C_OPERATIONS_TERMINALES.BOOLEAN;

import java.util.stream.Stream;

public class All_match_None_match {

	public static void main(String[] args) {

		Stream<String> myStream = Stream.of("one", "two", "three");
		
		
		
		
		// All Match
		// Retourne VRAI si le prédicat retourne vrai pour TOUS les éléments
		
		boolean isTrue = myStream.allMatch( s -> s.length() > 1 );
		
		
		
		
		// None Match
		// Retourne FAUX si le prédicat retourne faux pour TOUS les éléments
		
		boolean isFalse = myStream.noneMatch( s -> s.contains("t") );
		
		
		
		// ANY MATCH
		
	}

}
