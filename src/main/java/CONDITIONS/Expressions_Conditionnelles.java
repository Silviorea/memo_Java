package CONDITIONS;

public class Expressions_Conditionnelles {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
	}
	
	
// AVEC IF / ELSE
	
	public static int min (int a, int b) 
	{
		if ( a > b ) {
			return a;
		}
		else {
			return b;
		}
	}
	
// AVEC EXPRESSION CONDITIONNELLE
	
	public static int min2 (int a, int b) 
	{
//		       condition   siVRAI  siFAUX
		return ( a > b)  ? 	a   :   b;
	}

}
