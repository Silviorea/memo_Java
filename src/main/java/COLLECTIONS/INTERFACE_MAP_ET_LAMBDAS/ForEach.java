package COLLECTIONS.INTERFACE_MAP_ET_LAMBDAS;

import java.util.HashMap;
import java.util.function.BiConsumer;

// BI CONSUMER

public class ForEach {

	public static void main(String[] args) {


		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put( 07, "Annonay" );
		myMap.put( 69, "Lyon" );
		myMap.put( 75, "Paris" );
		myMap.put( 13, "Marseille" );
		
		
		BiConsumer<Integer, String> biCons = 
				(key, value) -> System.out.println("Clé : " + key + ", Valeur : " + value);
				
		myMap.forEach(biCons);
		
		
		
		
		
		
		

	}

}
