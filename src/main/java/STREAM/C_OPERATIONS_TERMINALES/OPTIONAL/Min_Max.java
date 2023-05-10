package STREAM.C_OPERATIONS_TERMINALES.OPTIONAL;

import java.util.Optional;
import java.util.stream.Stream;


// TROUVER LE MIN / MAX D'UN STREAM

// Prend un COMPARATOR en paramètre

// Retourne un OPTIONAL



public class Min_Max {
	public static void main(String[] args) {
		
		
		Optional<Integer> monMin = Stream.of(1, 2, 3, 4)
									.min((int1, int2) -> Integer.compare(int1, int2));
		
		System.out.println(monMin.orElseThrow());
		
		//////////////////////////////////////////////////////////////
		
		
		
		Optional<Integer> monMax = Stream.of(1, 2, 3, 4)
				.max((int1, int2) -> Integer.compare(int1, int2));
		
		System.out.println(monMax.get());
		
		
	}

}
