package COLLECTIONS.INTERFACE_MAP_ET_LAMBDAS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Map.computeIfAbsent ( key, Function <T, R> )

// SI LA CLE N'EXISTE PAS, VA LA CREER ET LUI APPLIQUER LA FUNCTION
// SI LA CLE EXISTE, CA RETOURNER SA VALEUR


public class Compute_If_Absent {
	public static void main(String[] args) {
		
		
		/*
		 *  Je vais transformer une liste en map de liste,
		 *  pour chaque clé, une liste de valeur avec la clé en nombre de lettre
		 *  expl : 
		 *  3 -> one, two, six
		 *  4 -> four, five
		 */
		
		
	
	List<String> maListe = new ArrayList<>();
	maListe.add("one");
	maListe.add("two");
	maListe.add("three");
	maListe.add("four");
	maListe.add("five");
	
	
	
	HashMap<Integer, List<String>> maMap = new HashMap<>();
	for (String string : maListe) {
		
	}
	
	
	/*
	 * En paramètre de la méthode computeIfAbsent : 
	 * Key 		=> la longueur du mot en cous d'itération dans la boucle
	 * Function => si la clé absente, je crée une liste associoé a cette clé et je mets le mot dedans
	 * 			=> si la clé est présente, computeIfAbsent me retourne la liste de  valeur de la clé, 
	 * à laquelle j'ajoute le mot	
	 */
	
	for (String listeIterate : maListe) 
	{
		
		maMap.computeIfAbsent( 
				listeIterate.length(), 
				k -> new ArrayList<>()).add(listeIterate);
		
	}
	
	
	// J'affiche ma MAP

	maMap.forEach(
			(nombreDeLettre, listeDeMots) 
			-> System.out.println("CLE : " + nombreDeLettre + ", VALEUR : " + listeDeMots) ) ;
	
	
	
	}

}
