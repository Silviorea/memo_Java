package CLASSES.STRING;

import java.util.stream.Stream;

public class STRINGS_methods {
	public static void main(String[] args) {
		
		String myString = "78 - Yvelines";
		
		
		
		String substring = myString.substring(2, 5); 			 //<= Extrait la string a partir du Param1 (inclu)
		System.out.println("Substring : " + substring);			 //    jusqu'au Param2 (exclu)
		
		
		
		int length = myString.length();							// <= Retourne la longueur de String
		System.out.println("lenght : " + length);
		
		
		
		int indexOf = myString.indexOf(" - ");					// <= Retourne indice de la 1ere occurence trouvée
		System.out.println("index of ' - ' : " + indexOf);
		
		
		
		int lastIndexOf = myString.lastIndexOf(" ");			// <= Retourne indice de la dernière occurence trouvée
		System.out.println("last index of ' ' : " + lastIndexOf);
		
		
		
		String replaceString = myString.replace('-', '/');		// <= remplace CHAR du Param1 par CHAR du Param2
		String replaceString2 = myString.replace(" - ", "<><>");// <= remplace String du Param1 par String du Param2
		System.out.println("replace : " + replaceString);
		System.out.println("replace2 : " + replaceString2);
		
		
		
		String replaceAll = myString.replaceAll(" ", ""); 		// <= Remplace toutes les occurences du PARAM1 par PARAM2
		System.out.println("replace ALL : " + replaceAll);
		
		
		
		String[] split = myString.split(" - ");					// <= Decoupe string au niveau du PARAM et crée un Array
		System.out.println("split part 1 : " + split[0]
				+ "\nsplit part 2 : " + split[1]);
		
		
		

		
		myString.trim();										// <= Enleve les espace avant et après la String
		
		
	}

}
