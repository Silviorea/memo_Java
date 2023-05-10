package LAMBDA_EXPRESSION.CONSUMER;

import java.util.function.BiConsumer;



// BICONSUMER < T, U >   =>  public VOID accept (T t, U u)



public class BiConsumer_Exemple {

	public static void main(String[] args) {
		
		
		BiConsumer<String, Integer> monBiConsumer =
				(string, integer) -> System.out.println( "Bonjour je m'appelle " + string + " et j'ai " + integer + " ans." );
		
		monBiConsumer.accept("Silvio", 35);

	}

}
