package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.OneToOne;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.GeneratedValue;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Id;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OneToOne;



@Entity
public class Commune {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	
	private String nom;
	
	
	@OneToOne  // Coté "maitre" de la relation. Colonne de jointure sera crée dans cette table
	private Maire maire;
	
	/*
	 * @OneToOne(cascade=CascadeType.PERSIST)
	 * 
	 * Fonctionne uniquement pour relation 1:1
	 * Va permettre de persister automatiquement l'entité esclave lorsque l'entité maitre est persistée
	 * 
	 * 
	 * @OneToOne(fetch=FetchType.EAGER / LAZY)
	 * 
	 * Eager : En cas de requete select, les objets en relation seront chargés automatiquement lorsque l'entité maitre sera chargée
	 * 
	 * Lazy : C'est l'inverse, les Objets en relation seront chargés uniquement à la demande et pas automatiquement
	 * Eager plus couteux en perf que Lazy
	 */

}
