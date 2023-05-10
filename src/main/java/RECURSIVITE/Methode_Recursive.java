package RECURSIVITE;

public class Methode_Recursive {
	
	public static void main(String[] args) {
		
		System.out.println(methode_Recursive(4));
		
	}
	
	public static int methode_Recursive (int value)
	{
		if (value == 0 || value == 1 )
		{
			return 1;
		}
		
		return value * methode_Recursive(value - 1);
	}

}
