package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.ManyToOne_OneToMany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.GeneratedValue;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Id;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.MapKey;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OneToMany;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OrderBy;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OrderColumn;

@Entity
public class Departement {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	
	private String nom;
	
	
	// Pour relation 1:p, il est préférable de passer par des SET si je veux EVITER LES DOUBLONS et L'ORDRE N'EST PAS IMPORTANT.
	
	@OneToMany // (mappedBy="departement") = Coté esclave de la relation Bi Directionnelle
	private Set<Commune> communes = new HashSet<>();
	
	
	
	// Si je souhaite tout de meme passer par des List (avec index et sans tri automatique), je devrais ajouter des annotations :
	
	@OneToMany // (mappedBy="departement") 
	@OrderBy // ("nom")  = je veux que mes données soient triées par le champ "nom"
	@OrderColumn // ("index") = je récupère les données par index. JPA va créer une colonne "index" en BDD et va l'entretenir
	private List<Commune> communes2 = new ArrayList<>();

	
	
	@OneToMany // (mappedBy="departement") 
	@MapKey // (name="code_postal") = JPA va mapper la valeur de l'Integer de ma map et la mapper dans la colonne en paramètre
	private Map<Integer, Commune> map = new HashMap<>();
	
	

	
	/*
	 * COPIE DEFENSIVE : 
	 * Il est important que le getter soit comme cela pour protéger la BDD
	   Ici on retourne une COPIE de la liste de commune de la BDD
	 * 
	 */
	public List<Commune> getCommunes() {
		return new ArrayList<>(this.communes);
	}

	

}
