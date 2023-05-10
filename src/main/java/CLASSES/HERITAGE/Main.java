package CLASSES.HERITAGE;



// QUESTION A SE POSER : La DROITE étant/implémente t'elle la GAUCHE??

public class Main {


	public static void main(String[] args) {
		
		
		Compte compte = new Compte_bancaire("Delphine", 30, "CA"); //<= Compte bancaire (droite) étend Compte (gauche)
		
		
		Compte_bancaire cb = new Compte_bancaire("silvio", 25,"CA"); 
		
		System.out.println(cb.toString());
		System.out.println(compte.toString());
		
	
		

	}

}
