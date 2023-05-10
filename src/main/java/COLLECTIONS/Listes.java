package COLLECTIONS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listes {
	public static void main(String[] args) {
		
		
		// CREATION DE LISTE
		
		List <Persons> personList = new ArrayList<>();
		personList.add(new Persons("silvio", 36));
		

		// Liste d'une taille non modifiable
		List<String> list = Arrays.asList("one","two","three");
		List<Integer> list2 = Arrays.asList(1, 2, 3);
//		list2.add(4);				// <= génère une UnsupportedOperationException 
		

		// JAVA 13 => LISTE IMMUTABLE
		List<String> myStringList = List.of("one","two","three");
//		myStringList.add("four"); // <= génère une UnsupportedOperationException 
		
	
	}
}
