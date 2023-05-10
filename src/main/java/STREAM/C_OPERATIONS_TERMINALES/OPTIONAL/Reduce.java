package STREAM.C_OPERATIONS_TERMINALES.OPTIONAL;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		
		Stream<Integer> myStream = Stream.of(1, 2, 3, 4);
		
		/*
		 *  La réduction DOIT ETRE ASSOCIATIVE : 
		 *  Une opération mathématique est associative si l'ordre 
		 *  dans lequel les opérations sont effectuées n'affecte 
		 *  pas le résultat final.
		 *  
		 *  Addition et Multiplication principalement
		 */
		
		// La méthode .reduce() prend un BINARY OPERATOR en paramètre.
		
		
		Optional<Integer> result = 
				myStream.reduce( (i1, i2) -> i1*i2);

	}

}
