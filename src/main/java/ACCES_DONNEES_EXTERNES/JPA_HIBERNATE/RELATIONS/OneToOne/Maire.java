package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.OneToOne;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Embedded;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.GeneratedValue;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Id;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OneToOne;



@Entity
public class Maire {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	
	private String nom;
	
	// Uniquement en cas de relation Bi Directionnelle
	@OneToOne // (mappedBy="maire") = coté "esclave" .cette relation commune correspond au champ "maire" de l'autre entité
	private Commune commune;
	
	@Embedded // Relation avec la classe Address qui est Embeddable
	private Address address;

}
