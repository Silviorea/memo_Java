package LAMBDA_EXPRESSION.FUNCTION;

import java.util.function.Function;

/*
 *  FUNCTION <T, R>	=>  public 	R 				apply 	(T t)
 *  				
 */




public class Function_exemple {

	public static void main(String[] args) {
		

		Function<String, Integer> myFunction = 
				(myString) -> myString.length();
		
		int result = myFunction.apply("Bonjour");
		
		System.out.println(result);
		
		
		/////////////////////////////
		
		
//		Function<String, Integer> myFunction2 = 
//				(myInt) -> myInt.length();
//				
//		Function<String, Integer> myFunction3 = 
//				(myInt) -> myInt.length() + 1;	
//				
//				
//		Function<String, Integer> F3 = 
//				myFunction2.compose(myFunction3);
		
		
		///////////////////////////


	}

}
