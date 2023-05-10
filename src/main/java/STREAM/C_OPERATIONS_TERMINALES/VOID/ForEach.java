package STREAM.C_OPERATIONS_TERMINALES.VOID;

import java.util.stream.Stream;

// PREND UN CONSUMER EN PARAMETRE

// RETOURNE VOID


public class ForEach {

	public static void main(String[] args) {


		Stream.of("one", "two", "three", "one")
		.forEach( System.out::println);

	}

}
