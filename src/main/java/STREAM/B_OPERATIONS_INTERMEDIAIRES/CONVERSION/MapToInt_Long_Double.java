package STREAM.B_OPERATIONS_INTERMEDIAIRES.CONVERSION;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// Pour passer d’un type d’objet à un type primitif 


public class MapToInt_Long_Double {

	public static void main(String[] args) {

		Stream<String> myStream = Stream.of("Bonjour");
		
		IntStream myNewStream = 
				myStream.mapToInt( string -> string.length());

		

	}

}
