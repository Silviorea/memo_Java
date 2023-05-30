package CONVERSIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {

	public static void main(String[] args) {
		
		String myString = "Bonjour le monde";
		
		
		
		// STRING => To Array => To List
		
		String[] stringToArray = myString.split(" ");
		
		List<String> arrayToList = new ArrayList<>(Arrays.asList(stringToArray));
		
		
		
		arrayToList.forEach(System.out::println);
		

	}

}
