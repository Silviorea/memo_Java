package COLLECTIONS;

import java.util.regex.Pattern;

public class Arrays {
	
	public static void main(String[] args) {
		

		
		
		
// CREATION DE TABLEAU		
		
//=>		
	int [] firstArray = new int [5] ;
	firstArray [0] = 1;
	firstArray [1] = 2;
	firstArray [2] = 4;
	firstArray [3] = 8;
	firstArray [4] = 16;
	
	
//=>	
	char [] secondArray = {'a', 'b', 'c'};
	
	
//=>	
	String [][]	thirdArray = 
		{
			
			{"maman", "papa", "frère", "soeur"},
			{"épouse", "époux", "fils", "fille"},
			{"cousin", "cousine", "oncle", "tante"}
			
		};
	
	
//=>	
	String text = "one two three four five";
	String[] fourthArray = text.split(" ");
	
	
//=>
	Pattern pattern = Pattern.compile(" ");
	String[] fifthArray = pattern.split(text);
	
	
	
	
	
	 // Tableau a deux dimensions
    int [][] tab2Dim = new int [5][2];
    tab2Dim[0][0] = 1;
    tab2Dim[0][1] = 2;
    tab2Dim[0][2] = 3;
    tab2Dim[1][0] = 4;
     
    
    // Longueur de la 1ère dimension du tableau
    System.out.println(tab2Dim.length);
    
    // Longueur de la 2ème dimension du tableau
    System.out.println(tab2Dim[0].length);
    
    // Parcours du tableau pour afficher le contenu.
    for (int [] ligne : tab2Dim)
    {
        for (int colonne : ligne)
        {
            System.out.println(colonne);
        }
    }
	
	
	
	
	}
}
