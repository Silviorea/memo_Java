package LAMBDA_EXPRESSION.FUNCTION;

import java.util.function.BiFunction;

public class BiFunction_exemple {

	public static void main(String[] args) {

		BiFunction<String, String, Integer> myBF = 
				(s1, s2) -> s1.indexOf(s2);
				
		
		int result = myBF.apply("Bonjour", "on");
		
		System.out.println(result);
	}

}
