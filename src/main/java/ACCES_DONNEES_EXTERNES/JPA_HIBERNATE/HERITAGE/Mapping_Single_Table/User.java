package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.HERITAGE.Mapping_Single_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;

@Inheritance // ( strategy=InheritanceType.SINGLE_TABLE )
@Entity
public class User {
	
	@GeneratedValue // (strategy = GenerationType.Auto)
	@Id
	private int id;
	
	private String name;

}
