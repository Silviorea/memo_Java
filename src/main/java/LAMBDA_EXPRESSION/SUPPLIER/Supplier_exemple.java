package LAMBDA_EXPRESSION.SUPPLIER;

import java.util.function.Supplier;

// SUPPLIER <T>  =>  public <T> get()


public class Supplier_exemple {

	public static void main(String[] args) {
		
		
		Supplier<String> mySupplier = 
				() -> "Bonjour";
				
		System.out.println(mySupplier.get());
		

	}

}
