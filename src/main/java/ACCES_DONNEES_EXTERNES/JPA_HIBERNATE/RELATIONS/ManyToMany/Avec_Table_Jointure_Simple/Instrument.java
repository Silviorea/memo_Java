package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.ManyToMany.Avec_Table_Jointure_Simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Instrument {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	private String nom;
	
	
	//@ManyToMany // Uniquement pour relation Bi Directionnelle. Ajouter le MappedBy
	//(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	
	@ManyToMany
	@JoinTable(
	name="INSTRUMENT_MUSICIEN",
	joinColumns = @JoinColumn(name="INSTRUMENT_ID"),
	inverseJoinColumns = @JoinColumn(name="MUSICIEN_ID"))
	private List<Musicien> musiciens = new ArrayList<>();
	
	
	
	
	

}
