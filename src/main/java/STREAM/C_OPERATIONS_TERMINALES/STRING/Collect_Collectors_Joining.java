package STREAM.C_OPERATIONS_TERMINALES.STRING;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Collect_Collectors_Joining {

	public static void main(String[] args) {
		
		
		
		List<String> myList = Arrays.asList("one", "two", "three");
		System.out.println("Ma liste sans le Joining : " + myList);
		
		
		
		
		// Joining avec 1 paramètre => caractère de séparation
		// Joining avec 1 paramètre => caractère de séparation + caractère de début + de fin
		
		String joinedString = myList.stream()
		                        .collect(Collectors.joining(" // ", "{", "}"));
		System.out.println("Ma liste avec Joining(3 paramètres) : " + joinedString); 

	}

}
