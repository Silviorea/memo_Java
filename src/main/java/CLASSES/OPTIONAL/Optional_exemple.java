package CLASSES.OPTIONAL;

import java.util.Optional;

// Classe WRAPPER pouvant accueillir des valeures nulles



public class Optional_exemple {

	public static void main(String[] args) throws Exception {


// Méthodes de construction		
		
		Optional<Object> optionalVide = Optional.empty();			// <= Construction d'un Optional VIDE
		
		Optional<Object> optionalNull = Optional.ofNullable(null);	// <= Construction d'un Optional NULL
		
		Optional<String> optionalString = Optional.of("ma string"); // <= Construction d'un Optional d'un Type <T>
		
		
		
// Methodes de TEST (Boolean)
		optionalString.isEmpty();
		optionalVide.isPresent();
		
		
// Récupérer résultat de l'OPTIONAL
		optionalString.get();			//<= JAVA 8 et 9, pour versions ultérieures, utiliser orElseThrow	
		optionalString.orElseThrow(); 	//<= JAVA 10 +
		
// Retourne ce qu'il y a en paramètre si l'OPTIONAL EST VIDE		
		optionalVide.orElse("Mon Optional est vide");

		
/*
 *  Retourne ce qu'il y a en paramètre si l'OPTIONAL EST VIDE
 *  C'est un SUPPLIER en paramètre qui va créer l'objet
 *  Utiliser si l'objet en paramètre est COUTEUX A CONSTRUIRE
 */
		
		optionalVide.orElseGet( () -> "Mon Optional est vide" );
		
		
/*
*  Retourne l'éxception en paramètre si l'OPTIONAL EST VIDE
*  C'est un SUPPLIER en paramètre qui va créer l'exception
*  
*/		
	//	optionalVide.orElseThrow(() -> new Exception("Ceci est une Exception"));
		

		
		
// Si l'optional n'est pas vide : applique le CONSUMER en paramètre	
		optionalString.ifPresent( System.out::println);
		
		

/*
 *  Si l'optional n'est pas vide : applique la FUNCTION de MAPPING en paramètre	
 *  Retourne un OPTIONAL	
 */
		optionalString.map( string -> string.length()).get();
		
		
		
/*
 *  Si l'optional n'est pas vide et que le PREDICAT de FILTER en paramètre est TRUE, retourne la valeur de l'OPTIONAL
*/		
		optionalString.filter( p -> p.length() > 5).get();
		
	
		
	}

}
