package PATTERNS.BUILDER;


/*
 * Grace à ma classe static de Builder crée à la place du constructeur,
 * je peux instancier mes objets sans avoir a rentrer de valeur NULL.
 */


public class Main {

	public static void main(String[] args) {
		
		// Je veux créer un objet User mais je ne connais que le Nom et Prénom...
		
		// User user1 = new User("REA", "Silvio", null, null)
		User user1 = new User.UserBuilder()
								.withFirstName("REA")
								.withLastName("Silvio")
								.build();
		
		
		/*
		 *  Maintenant si j'appelle les getters des attributs que je l'ai pas entrée
		 	j'aurais mes valeurs par défault
		 */
		
		System.out.println(user1.getPhone());
		System.out.println(user1.getAddress());
		
	}

}
