package STREAM.B_OPERATIONS_INTERMEDIAIRES.FILTRE_TRI;

import java.util.stream.Stream;

public class Limit_Skip {

	public static void main(String[] args) {


		Stream.of("one", "two", "three", "one")
				.limit(2)								// <= Je ne prends que les 2 premiers éléments du Stream
				.forEach(s -> System.out.println(s));
		
		
		
		Stream.of("one", "two", "three", "one")
				.skip(3)								// <= Je saute les 3 premiers éléments du Stream
				.forEach(s -> System.out.println(s));
		
	}

}
