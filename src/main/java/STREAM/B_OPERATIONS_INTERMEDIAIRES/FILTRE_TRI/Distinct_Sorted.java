package STREAM.B_OPERATIONS_INTERMEDIAIRES.FILTRE_TRI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// DISTINCT = RETIRE LES DOUBLONS DU STREAM
// SORTED = TRI LES ELEMENTS DU STREAM


public class Distinct_Sorted {

	public static void main(String[] args) {

		
		// Distinct
		
		
		Stream<String> myStream = 
				Stream.of("one", "two", "three", "one")
				.distinct();									// <= le dernier "one" sera supprimé											
		
		
		
		
		// Sorted sans comparator
		
		Stream<Integer> myStream2 = 
				Stream.of(2, 4, 5,1,2,6,3)
				.sorted();										// les éléments seront triés par ordre alphabétique

		
		
		// Sorted AVEC comparator
		
		Comparator<String> comp = (s1, s2) -> s2.compareTo(s1);	// Mon comparator va trier les éléments par ordre inverse
		
		Stream<String> myStream3 = 
				Stream.of("one", "two", "three", "one")
				.sorted(comp);
		
		
	}
	
	

}
