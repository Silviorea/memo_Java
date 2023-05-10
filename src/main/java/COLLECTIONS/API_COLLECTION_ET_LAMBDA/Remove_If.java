package COLLECTIONS.API_COLLECTION_ET_LAMBDA;

import java.util.ArrayList;
import java.util.List;

// Collection.removeIf    <= PREDICAT


public class Remove_If {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		
		
		
		myList.removeIf( s -> s.startsWith("t") );
		
		
		
		myList.forEach(System.out::println);

	}

}
