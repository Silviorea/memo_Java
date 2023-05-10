package PATTERNS.BUILDER;

import jakarta.persistence.Id;

// Permet de contruirte des objets meme sans avoir tous les attributs
// Cela évite de laisser trainer des "null" un peu partout



public class User {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	
	
	
	public User() {
		super();
	}



	// Dans ma classe, je remplace mon constructeur par une classe Builder	
	public static class UserBuilder{
		
		
		/*
		 * Je récupère les attributs de ma classe mais je peux leur passer une valeur par défault.
		 * Si certain de ces attributs sont inconnus lors de la construction de l'objet, ces valeurs
		 * par défaut seront utilisés pour créer mon objet.
		 */
		private String firstName = "First Name indisponible";
		private String lastName= "Last Name indisponible";
		private String phone= "Phone indisponible";
		private String address= "Address indisponible";
		
		
		/*
		 * Dans mon Builder je crée des méthodes qui retournent le Builder
		 * Cela permet de les enchainer comme on le souhaite
		 */
		public UserBuilder withLastName(String lastName)
		{
			this.lastName = lastName;
			return this;
		}
		
		public UserBuilder withFirstName(String firstName)
		{
			this.firstName = firstName;
			return this;
		}
		
		public UserBuilder withPhone(String phone)
		{
			this.phone = phone;
			return this;
		}
		
		public UserBuilder withAddress(String address)
		{
			this.address = address;
			return this;
		}
		
		
		/*
		 * Enfin, je crée ma méthode BUILD qui servira a contruire ma classe a build
		 * en utilisant les attribut du builder et en les passant à ma classe à build
		 */
		
		
		
		public User build()
		{
			User user = new User();
			user.firstName = firstName;
			user.lastName = lastName;
			user.phone = phone;
			user.address = address;
			return user;
		}
		
		
//		public User build()
//		{
//			
//			return new User(this);
//		}
//		
//		
//
//		public UserBuilder(Integer id) {
//			this.id = id;
//		}
//
//		
		
		
	
		
		
		
	}
	
//	
//	private User(UserBuilder userBuilder)  {
//		id = userBuilder.id;
//	}
//

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
