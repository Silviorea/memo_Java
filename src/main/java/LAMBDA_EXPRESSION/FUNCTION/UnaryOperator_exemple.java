package LAMBDA_EXPRESSION.FUNCTION;

import java.util.function.UnaryOperator;

// FUNCTION <T, R>  =>  public R apply (T t)

// UNARYOPERATOR <T> extends Function <T,T>


public class UnaryOperator_exemple {
	
	public static void main(String[] args) {
		
		UnaryOperator<String> myUO = 
				myString -> myString.toUpperCase();
	
		String result = myUO.apply("bonjour");
		System.out.println(result);

		
		
		UnaryOperator<Integer> myUO2 = 
				myInt -> myInt + 1;
				
		int result2 = myUO2.apply(5);
		System.out.println(result2);
		
		
	}

}
