package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.RELATIONS.OneToOne;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Embeddable;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.OneToMany;

@Embeddable // Annotation qui veut dire que cette classe peut etre embarquée dans une autre
public class Address {
	
	private String address;
	
	@OneToMany
	private Commune commune;

}
