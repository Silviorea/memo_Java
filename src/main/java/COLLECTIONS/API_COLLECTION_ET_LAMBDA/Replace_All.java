package COLLECTIONS.API_COLLECTION_ET_LAMBDA;

import java.util.ArrayList;
import java.util.List;

// List.replaceALL    <= UNARY OPERATOR


public class Replace_All {

	public static void main(String[] args) {


		List<String> myList = new ArrayList<>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		
		
		
		myList.replaceAll(s -> s.toUpperCase());
		
		myList.forEach(System.out::println);
		

	}

}
