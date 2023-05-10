package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.HERITAGE.Mapping_Joined;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.DiscriminatorValue;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;


@DiscriminatorValue	// (name="EMP") Nom de la valeur que prendront les Employee dans la colonne TYPE
@Entity
public class Employee extends User{
	
	private int salary;

}
