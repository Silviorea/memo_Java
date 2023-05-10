package COLLECTIONS.API_COLLECTION_ET_LAMBDA;

import java.util.ArrayList;
import java.util.List;

// Iterable.forEach   <= CONSUMER


public class ForEach {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		
		
		
		
		
		myList.forEach( 
				s -> System.out.println
					( 
						"élément n° " + myList.indexOf(s) +  " : " 
						+ s)
					);
		
		
	}

}
