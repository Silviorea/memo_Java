package STREAM.C_OPERATIONS_TERMINALES.OPTIONAL;

import java.util.Optional;
import java.util.stream.Stream;

public class Find_first_Find_any {

	public static void main(String[] args) {
		
		// Find FIRST Retourne le 1er élément du stream qu'elle tourne

		Optional<Integer> monFindFirst = Stream.of(1, 2, 3, 4)
				.findFirst();
		
		
		
		// Find ANY retourne n'importe quel élément du Stream
		
		Optional<Integer> monFindAny = Stream.of(1, 2, 3, 4)
				.findFirst();
		
		
	}

}
