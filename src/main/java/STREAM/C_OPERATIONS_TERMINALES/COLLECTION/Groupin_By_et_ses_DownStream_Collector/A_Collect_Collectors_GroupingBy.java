package STREAM.C_OPERATIONS_TERMINALES.COLLECTION.Groupin_By_et_ses_DownStream_Collector;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// GROUPING_BY permet la construction de table de hachage. S'utilise avec 1 OU 2 PARAMETRES

// FUNCTION EN PARAMETRE


/*
 *  1er paramètre : PARAMETRAGE DE LA CLE : Pour chaque élément du stream, va appliquer la fonction en paramètre 
 *  					et construire une table de hachage. Chaque élément va etre rattaché a sa clé 
 *  					en fonction de la Function en paramètre
 *  
 *  2ème paramètre "DOWNSTREAM COLLECTOR" : PARAMETRAGE DE LA VALUE :  
 *  						sert a paramètrer la valeur associée à chaque clé (type de collection, formatage, etc...)
 */


public class A_Collect_Collectors_GroupingBy {

	public static void main(String[] args) {
		
		
		// EXEMPLE AVEC 1 PARAMETRE
		

		Stream<String> myStream = Stream.of("one","two","three","four","five","six","seven","eight","nine","ten");
		
		Map<Integer, List<String>> myMap = 
				myStream.collect(Collectors.groupingBy(String::length));  // <= Ici la clé sera le nombre de lettre
		
		
		System.out.println("EXEMPLE GROUPING_BY 1 PARAMETRE :");
		myMap.forEach((key, value) -> System.out.println("key : " + key + " // value : " + value));
		
		
		
		
		
		// EXEMPLES AVEC 2 PARAMETRES
		
		
		// 1 => DOWNSTREAM COLLECTOR = Collectors.toSet
		
		Stream<String> myStream2 = Stream.of("one","one","three","three","five","six","six","eight","nine","ten");
				
		Map<Integer, Set<String>> myMap2 = 
				myStream2.collect(Collectors.groupingBy(
									String::length,			// <= Les clés seront crées en fonction de la taille des mots
									Collectors.toSet()));	// <= Les valeurs seront intégrées dans un SET => Pas de doublon
				
		System.out.println("EXEMPLE 1 GROUPING_BY 2 PARAMETRES // DOWNSTREAM COLLECTOR = Collectors.toSet:");	
		myMap2.forEach((key, value) -> System.out.println("key : " + key + " // value : " + value));
		
		
		
		
		
		// 2 => DOWNSTREAM COLLECTOR = Collectors.joining
		
		Stream<String> myStream3 = Stream.of("one","one","three","three","five","six","six","eight","nine","ten");
		
		Map<Integer, String> myMap3 = 
				myStream3.collect(Collectors.groupingBy(
									String::length,						// <= Les clés seront crées en fonction de la taille des mots
									Collectors.joining("/", "$", "$")));// <= Les valeurs seront des Strings paramétrées via JOINING
		
		System.out.println("EXEMPLE 2 GROUPING_BY 2 PARAMETRES // DOWNSTREAM COLLECTOR = Collectors.joining:");
		myMap3.forEach((key, value) -> System.out.println("key : " + key + " // value : " + value));
		
		
		
		
		
		// 3 => DOWNSTREAM COLLECTOR = Collectors.counting
		//		compte le nombre d'élément dans chaque valeur et retourne un LONG
		
		
		Stream<String> myStream4 = Stream.of("one","one","three","three","five","six","six","eight","nine","ten");
		
		Map<Integer, Long> myMap4 = 
				myStream4.collect(Collectors.groupingBy(
									String::length,			// <= Les clés seront crées en fonction de la taille des mots
									Collectors.counting()));// <= Les valeurs seront un compte du nombre de valeur dans la map
		
		System.out.println("EXEMPLE 3 GROUPING_BY 2 PARAMETRES // DOWNSTREAM COLLECTOR = Collectors.counting:");
		myMap4.forEach((key, value) -> System.out.println("key : " + key + " // value : " + value));
		
		
		
		
		// 4 => DOWNSTREAM COLLECTOR = Collectors.maxBy // minBy
		// prennent un comparator en paramètre et retourne le max/min en fonction de lui. Retourne OPTIONAL
		
		Stream<String> myStream5 = Stream.of("one","one","three","three","five","six","six","eight","nine","ten");
		
		Map<Integer, Optional<String>> myMap5 = 
				myStream5.collect(Collectors.groupingBy(
									String::length,							// <= Les clés seront crées en fonction de la taille des mots
									Collectors.maxBy(
											(v1, v2) -> v1.compareTo(v2))));// <= Les valeurs seront le max de chacune d'entre elle au sens du comparator
		
		System.out.println("EXEMPLE 4 GROUPING_BY 2 PARAMETRES // DOWNSTREAM COLLECTOR = Collectors.maxBy");
		myMap5.forEach((key, value) -> System.out.println("key : " + key + " // value : " + value.get())); //<= OPTIONAL = .GET
		

	}

}
