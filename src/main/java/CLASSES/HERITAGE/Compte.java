package CLASSES.HERITAGE;

public class Compte {
	
	// ATTRIBUTS
	private String nom;
	private double montant;
	
	

	
	// CONSTRUCTEURS
	
	public Compte() {
		super();
	}
	
	public Compte(String nom, double montant) {
		super();
		this.nom = nom;
		this.montant = montant;
	}
	
	
	
	// GETTER SETTER
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}


	

	

	
	

}
