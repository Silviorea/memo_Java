package SWITCH;

import java.util.Random;

public class New_Switch {
	public static void main(String[] args) {
		
		int value = new Random().nextInt(10+1);
		
		String result = switch (value) {
		
		case 0, 1, 2, 3, 4 -> 
		{
            double racineCarré = Math.sqrt( value );
            yield value + " : Petit chiffre dont la racine carré vaut " + racineCarré;
        }
		
		case 5, 6, 7, 8, 9 -> 
		{ 
			double carré = value * value;
			yield value + " : Grand chiffre dont le carré vaut " + carré;
		}
		
		default -> value + " : ce n'est plus un chiffre mais un nombre";

		};

		
		System.out.println(result);
		
	}

}
