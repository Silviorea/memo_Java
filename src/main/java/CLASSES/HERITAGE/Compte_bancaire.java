package CLASSES.HERITAGE;

public class Compte_bancaire extends Compte{
	
	private String nomDeLaBanque;

	
	/* CONSTRUCTEUR de la classe fille
	 * super() permets d'acceder au constructeur de la classe Mère
	 */

	public Compte_bancaire(String nom, double montant, String nomDeLaBanque) {
		super(nom, montant);							
		this.nomDeLaBanque = nomDeLaBanque;
	}
	
	
	
	/* METHODE TO_STRING 
	 * Le mot clé SUPER permets d'accèder aux attributs et méthodes de la classe mère
	 */
	
	@Override
	public String toString() {
		return "Compte_bancaire\n" 
				+ "NomDeLaBanque=" + nomDeLaBanque + "\n"
				+ "Nom =" + super.getNom() + "\n"
				+ "Prenom =" + super.getMontant();
						
	}
	

	public String getNomDeLaBanque() {
		return nomDeLaBanque;
	}

	public void setNomDeLaBanque(String nomDeLaBanque) {
		this.nomDeLaBanque = nomDeLaBanque;
	}



	
	


	
	

	

}
