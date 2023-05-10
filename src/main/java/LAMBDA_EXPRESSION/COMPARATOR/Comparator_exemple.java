package LAMBDA_EXPRESSION.COMPARATOR;

import java.util.Comparator;
import java.util.function.Function;

import LAMBDA_EXPRESSION.COMPARATOR.model.User;



/*
 * Méthode compare de l'interface fonctionnel Comparator retourne un int : 
 * 
 * -  > 0 	si 	t1 >  t2
 * -  = 0	si	t1 = t2
 * -  < 0	si	t1 < t2
 */


public class Comparator_exemple {

	public static void main(String[] args) {
		

		
		////// COMPARE   /   COMPARE_TO //////
		
		Comparator<String> alphabetique = (s1, s2) -> s1.compareTo(s2);
		Comparator<String> inverse = (s1, s2) -> s2.compareTo(s1);
		
		
		int resultAlphabetique = alphabetique.compare("a", "b");
		int resultInverse = inverse.compare("a", "b");
		
		System.out.println("Comparaison Alphabétique : " + resultAlphabetique + "\n" + 
							"Comparaison Inversée : " + resultInverse);

		
		
		 Comparator<String> compareWithInteger = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		 int resultLength = compareWithInteger.compare("hello", "Bonjour");
		 System.out.println("Comparaison des length : " + resultLength);
		
		
		 
		 
		 
		 ////// COMPARING  /   THEN_COMPARING //////
		 
		 
		 /*
		  * METHODE STATIC de l'interface Comparator qui permet de comparer via une FUNCTION
		  */
		 
		 
		 User user1 = new User("Silvio", 36);
		 User user2 = new User("Delphine", 34);
		 User user3 = new User("Silvio", 40);
		 
		 
		 // La fonction que je vais utiliser dans le comparator va se focus sur le NOM et sur l'AGE
		 Function<User, String> compareByName = myUser -> myUser.getName();
		 Function<User, Integer> compareByAge = myUser -> myUser.getAge();
		 
		 // Je passe la Function  en paramètre de la méthode COMPARING
		 Comparator<User> nameComparator = Comparator.comparing(compareByName);
		 Comparator<User> ageComparator = Comparator.comparing(compareByAge);
		 
		 // J'affiche le résultat
		 boolean resultComparator1 = nameComparator.compare(user1, user2) > 0;
		 boolean resultComparator2 = ageComparator.compare(user1, user2) > 0;
		 
		 System.out.println("NOM de Silvio > Delphine ? => " + resultComparator1);
		 System.out.println("AGE de Silvio > Delphine ? => " + resultComparator2);
		 
		 
		 
		 
		 // THEN COMPARING => En cas d'égalité, on applique un critère 2.
		 
		 Comparator<User> byNameThenByAge = 
				 Comparator.comparing(compareByName)
				 .thenComparing(compareByAge);
		 
		 
		 boolean resultCompareByNameAndAge = byNameThenByAge.compare(user1, user3) > 0;
		 
		 System.out.println("Silvio1 > Silvio2 ? => " + resultCompareByNameAndAge);
		 
	}

}
