package STREAM.B_OPERATIONS_INTERMEDIAIRES.CONVERSION;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// PASSER D'UN TYPE PRIMITIF A UN TYPE OBJET à l'aide d'une FUNCTION


public class MapToObj {

	public static void main(String[] args) {

		IntStream myIntStream = new Random().ints(3);
		
		Stream <String> myNewStream =  
				myIntStream.mapToObj( myInt -> "Bonjour");	// <= Va transformer tous les int en Bonjour
		

		myNewStream.forEach(System.out::println);
	}

}
