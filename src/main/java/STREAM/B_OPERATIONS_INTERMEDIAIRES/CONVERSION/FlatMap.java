package STREAM.B_OPERATIONS_INTERMEDIAIRES.CONVERSION;

import java.util.regex.Pattern;
import java.util.stream.Stream;


/*
 * Prend une FUNCTION en paramètre
	S’utilise lorsqu’on se retrouve dans la situation où, dans notre stream, 
	on a  non plus des éléments classiques à manipuler, 
	mais des LISTES ou D’AUTRES STREAM.
	
	!!!!!ATTENTION !!!!!
	
	!!! La fonction en paramètre du FlatMap DOIT RETOURNER UN STREAM !!!
 */


public class FlatMap {

	public static void main(String[] args) {


		Stream.of("un jardin","des fleurs","un raton laveur")
		.flatMap( line -> Pattern.compile(" ").splitAsStream(line))
		.forEach(System.out::println);
		

	}

}
