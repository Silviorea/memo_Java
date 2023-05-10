package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.HERITAGE.Mapping_Table_Per_Class;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.GeneratedValue;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Id;
import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Inheritance;


@Inheritance // ( strategy=InheritanceType.TABLE_PER_CLASS )
@Entity
public class User {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private int id;
	
	private String name;

}
