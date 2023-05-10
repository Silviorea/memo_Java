package COLLECTIONS.INTERFACE_MAP_ET_LAMBDAS;

import java.util.HashMap;
import java.util.function.BiFunction;

// BI FUNCTION


public class Replace_All {

	public static void main(String[] args) {
	
		
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put( 07, "Annonay" );
		myMap.put( 69, "Lyon" );
		myMap.put( 75, "Paris" );
		myMap.put( 13, "Marseille" );
		
		
		BiFunction<Integer, String, String> replaceByUpperCase =
				(key, value) -> value.toUpperCase();
				
		myMap.replaceAll(replaceByUpperCase);
		
		myMap.forEach((key, value) -> System.out.println(key + " : " + value));
		

	}

}
