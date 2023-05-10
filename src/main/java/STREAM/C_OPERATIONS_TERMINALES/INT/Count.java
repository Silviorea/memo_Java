package STREAM.C_OPERATIONS_TERMINALES.INT;

import java.util.stream.Stream;

// RETOURNE UN INT => Nombre d'élément d'un Stream

public class Count {

	public static void main(String[] args) {


		
		System.out.println
		(
				Stream.of("one", "two", "three", "one")
				.count()
		);
		
		
		

	}

}
