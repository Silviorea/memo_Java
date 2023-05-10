package RECURSIVITE;

public class RecursivitéViaBoucle {
public static void main(String[] args) {
	
		// n ! =   n * (n+1)
	
		
		System.out.println(factorielle(0));
		
	}



	
	public static int factorielle (int value) {
		
		int n = 1;
		
		for (int i = 1 ; i <= value ; i++)
		{
			n *= i;
		}
		
		
		return n;
	}

}
