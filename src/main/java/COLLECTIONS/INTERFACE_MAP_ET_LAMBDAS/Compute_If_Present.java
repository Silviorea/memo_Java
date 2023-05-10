package COLLECTIONS.INTERFACE_MAP_ET_LAMBDAS;

import java.util.HashMap;

//Map.computeIfPresent ( key, BiFunction <T, R, U> )

//AGIT SUR UNE SEULE PAIRE CLE/VALEUR QUE SI LA CLE EN PARAM7TRE SE TROUVE DANS LA TABLE.

// Agit si la clé est dans la table et associé a une valeur non nulle

// Si la nouvelle valeur est nulle, la paire est retirée de la table


public class Compute_If_Present {

	public static void main(String[] args) {


		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put( 07, "Annonay" );
		myMap.put( 69, "Lyon" );
		myMap.put( 75, "Paris" );
		myMap.put( 13, "Marseille" );
		
		
		myMap.computeIfPresent(07, 
					(key, value) -> value.toUpperCase() + " EN ARDECHE" );
		
		myMap.forEach((k, v)-> System.out.println(k + " : " + v));

	}

}
