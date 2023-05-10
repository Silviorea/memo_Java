package LAMBDA_EXPRESSION.FUNCTION;

import java.util.function.BinaryOperator;

//FUNCTION <T, R>  =>  public R apply (T t)

//BINARYOPERATOR <T> extends BiFunction <T,T,T>


public class BinaryOperator_exemple {

	public static void main(String[] args) {
		
		BinaryOperator<String> myBO = 
				(myFirstString, mySecondString) -> myFirstString + mySecondString;
		
		String result = myBO.apply("Bonjour ", "le monde!");
		System.out.println(result);
		
		
		
		BinaryOperator<Integer> myBO2 = 
				(myFirstInt, mySecondInt) -> myFirstInt * mySecondInt;
		
		int result2 = myBO2.apply(5, 10);
		System.out.println(result2);

	}

}
