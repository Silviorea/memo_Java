package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.ManyToMany.Avec_Table_Jointure_Simple;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Musicien {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private long id;
	
	private String nom;
	
	
	//@ManyToMany // (fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	
	@ManyToMany(mappedBy = "musiciens")
	private List<Instrument> instruments = new ArrayList<>();

}
