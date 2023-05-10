package SWITCH;

import java.util.Random;

public class Classic_Switch {
	
	public static void main(String[] args) {
		
		int value = new Random().nextInt(5 + 1);
		
		switch (value) {
		
			case 0 : 
			case 1 :
			case 2 : 
				System.out.println("voici le case 3");
				break;
			case 3 : 
			case 4 :
				System.out.println("voici le case 4");
				break;
				
			default : System.out.println("autre case");
		}
		
		
		
	}

}
