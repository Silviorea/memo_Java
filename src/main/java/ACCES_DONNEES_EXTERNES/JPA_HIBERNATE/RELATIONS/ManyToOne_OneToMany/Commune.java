package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.ManyToOne_OneToMany;


import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Commune {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	private String nom;
	
	// Dans cette relation, commune est le coté maitre car c'est cette table qui possède la colonne de jointure
	
	@ManyToOne //(fetch=FetchType.EAGER / LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name="departement_id")
	private Departement departement;

	
	
	
	// Méthode d'association à invoquer avant de persister
	
	public void associateWith (Departement dep)
	{
		this.departement = dep;
		dep.getCommunes().add(this);
	}
	
	
	
	
	
	
	
	// CONSTRUCTORS
	
	
	public Commune() {
		super();
	}

	public Commune(String nom, Departement departement) {
		super();
		this.nom = nom;
		this.departement = departement;
	}
	
	
	
	
	// GETTER / SETTER
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	

}
