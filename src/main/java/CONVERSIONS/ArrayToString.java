package CONVERSIONS;

public class ArrayToString {

	
	public static void main(String[] args) {
		
		String[] myArray = {"Bonjour", "le", "monde"};
		
		
		// STRING.JOIN
		
		String withJoin = String.join(" - ", myArray);
		

		
	
		System.out.println("With String.join method : " + withJoin);
		
		

	}

}
