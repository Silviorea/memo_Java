package STREAM.C_OPERATIONS_TERMINALES.OPTIONAL;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		
		Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4);
		Stream<String> myStringStream = Stream.of("one", "two", "three");
		
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
				myIntStream.reduce( (i1, i2) -> i1 * i2);
		
		
		Optional<String> result2 = 
				myStringStream.reduce( (s1, s2) -> s1.replaceFirst(".", Character.toString(s2.charAt(0)))) ;
		
		
		System.out.println("Reduce du Stream<Integer> = " + result.orElseThrow());
		System.out.println("Reduce du Stream<String> = " + result2.orElseThrow());

	}

}
