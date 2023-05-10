package LAMBDA_EXPRESSION.PREDICATE;

import java.util.function.BiPredicate;

//PREDICATE <T, U>  =>  public BOOLEAN test (T t, U u)


public class BiPredicate_exemple {

	public static void main(String[] args) {
		
		
		BiPredicate <String, String> monBiPredicate = 
				(string1, string2) -> string1.contains(string2);
				
		boolean result = monBiPredicate.test("bonjour", "on");
		
		System.out.println(result);
		
		//////////////////////////////
		
		

	}

}
