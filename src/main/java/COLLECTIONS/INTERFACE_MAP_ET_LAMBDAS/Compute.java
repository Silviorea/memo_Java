package COLLECTIONS.INTERFACE_MAP_ET_LAMBDAS;

import java.util.HashMap;

// Map.compute ( key, BiFunction <T, R, U> )

// AGIT SUR UNE SEULE PAIRE CLE/VALEUR. Si la nouvelle valeur est nulle, la paire est retirée de la table

public class Compute {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put( 07, "Annonay" );
		myMap.put( 69, "Lyon" );
		myMap.put( 75, "Paris" );
		myMap.put( 13, "Marseille" );
		
		
		myMap.compute(07, 
					(key, value) -> value.toUpperCase() + " EN ARDECHE" );
		
		myMap.forEach((k, v)-> System.out.println(k + " : " + v));
		
		
		

	}

}
