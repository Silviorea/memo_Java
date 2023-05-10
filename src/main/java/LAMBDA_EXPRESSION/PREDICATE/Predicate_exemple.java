package LAMBDA_EXPRESSION.PREDICATE;

import java.util.function.Predicate;

public class Predicate_exemple {
	
	public static void main(String[] args) {
		
		
		Predicate<String> pred = myString -> myString != null;
		
		boolean resultat = pred.test("Bonjour");
		
		System.out.println(resultat);
		
	}

}
