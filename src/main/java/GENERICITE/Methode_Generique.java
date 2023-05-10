package GENERICITE;

public class Methode_Generique {

	public static void main(String[] args) {
		
		Classe_Generique<String> classeString = 
				new Classe_Generique<String>("STRING");
		
		Classe_Generique<Integer> classeInt = 
				new Classe_Generique<>(123);
		
		System.out.println("Ici le type dela classe GENERIQUE sera " +  classeString.getElement());
		System.out.println("Ici le type dela classe GENERIQUE sera " + classeInt.getElement());
		
		
		dialogue("james bond", "bonjour");
		dialogue('M', "salutation");
		dialogue(007, "bonjour");
		

	}
	
	
	public static <TYPE> void dialogue (TYPE nom, String phrase)
	{
		System.out.println(nom + " vous dit " + phrase);
	}
	

}
