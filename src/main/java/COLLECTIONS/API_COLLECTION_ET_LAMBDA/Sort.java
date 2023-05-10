package COLLECTIONS.API_COLLECTION_ET_LAMBDA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

// List.sort  <=  COMPARATOR

public class Sort {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		
		
//		Function<String, Integer> compareByLenght = 
//				string -> string.length();
	
		Comparator<String> myComparator = Comparator.comparing(string -> string.length());
		
		myList.sort(myComparator);
		
		myList.forEach( string -> System.out.println( string) );
		
	}

}
