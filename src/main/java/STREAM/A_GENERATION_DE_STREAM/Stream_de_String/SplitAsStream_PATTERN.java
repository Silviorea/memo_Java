package STREAM.A_GENERATION_DE_STREAM.Stream_de_String;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitAsStream_PATTERN {

	public static void main(String[] args) {
		
		
		String myString = "Bonjour le monde";


// 	Découper un tableau de String en Stream<String>
// 	on va utiliser la CLASSE PATTERN
		
		// <= Mon pattern va se focaliser sur les espaces " "
		Pattern simplePattern = Pattern.compile(" ");			 
		
		// Création d'un stream en découpant le tableau de string sur la focalisation du pattern	
		Stream<String> myStream = simplePattern.splitAsStream(myString);	
	
		List<String> myList = myStream.collect(Collectors.toList());
		
		myList.forEach( string -> System.out.println( string));

	}

}
