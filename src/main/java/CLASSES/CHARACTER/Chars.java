package CLASSES.CHARACTER;

import java.util.stream.Collectors;



public class Chars {
	public static void main(String[] args) {
		
		Character py = '\u03c0';
		
		String pyEnString = "Voici mon PY en majuscule dans ma String : \u03c0";
		
		char retourLigne = '\n';
		
		char tabulation = '\t';
		
		
		
		// Transformer un Unicode en String
		String UnicodeToString = Character.toString('\u03c0');
		
		// Transformer un Unicode en Int
		int UnicodeToINT = Character.getNumericValue(72);
		
		
		int myInt = 5;
		
		System.out.println(
			"Chars de 5 = "	 + 
			Integer.toString(myInt)
			.chars()
			.mapToObj(myChar -> Character.toString(myChar))
			.collect(Collectors.joining())
			
				);
		
//		Integer.toString(myInt).chars();
		
		
		System.out.println(py);
		System.out.println(pyEnString);
		System.out.println("Unicode to String via Character.toString('\\u03c0') => " + UnicodeToString);
		System.out.println("Unicode to INT via Character.getNumericValue(72) => " + UnicodeToINT);
		
	}

}
