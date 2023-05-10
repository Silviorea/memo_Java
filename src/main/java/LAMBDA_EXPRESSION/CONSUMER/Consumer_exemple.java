package LAMBDA_EXPRESSION.CONSUMER;

import java.util.Arrays;
import java.util.function.Consumer;

public class Consumer_exemple {

	public static void main(String[] args) {

		Consumer<String> cons = myString -> System.out.println(myString);
		
		cons.accept("Bonjour");
		
	}
}
