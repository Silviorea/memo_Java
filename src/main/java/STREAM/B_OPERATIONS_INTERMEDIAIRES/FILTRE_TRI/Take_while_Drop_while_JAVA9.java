package STREAM.B_OPERATIONS_INTERMEDIAIRES.FILTRE_TRI;

import java.util.stream.Stream;

public class Take_while_Drop_while_JAVA9 {

	public static void main(String[] args) {
		
		
		// TAKE WHILE (prend tant que)
		
		/*
		 *  C’est UNE PORTE QUI SE FERME et qui garde tous les éléments avant sa fermeture
		 *  Prend un PREDICAT en paramètre. Va transmettre les éléments au Stream suivant 
		 *  TANT QUE le prédicat est vrai. A partir du moment ou le prédicat renvoi faux, 
		 *  le takeWhile se stoppe et ne prendra pas non plus les éléments qui 
		 *  suivent le résultat faux même s’il sont vrai
		 */
		System.out.println("Take while : ");
		
		Stream.of("one", "two", "three", "one")
			.takeWhile( s -> s.length() == 3)
			.forEach(System.out::println);;
		
		
		
		
			
		// DROP WHILE (jette tant que)
		
		/*
		 * C’est UNE PORTE QUI S’OUVRE et qui JETTE tous les éléments avant son ouverture
		 * Prend un PREDICAT en paramètre. Va jeter les éléments du stream TANT QUE le prédicat est vrai. 
		 * Va ensuite garder tous les éléments qui suivent.
		 */
		System.out.println("Drop while : ");
		
		Stream.of("one", "two", "three", "one")
			.dropWhile( s -> s.startsWith("o"))
			.forEach(System.out::println);
		
		
			
	}

}
