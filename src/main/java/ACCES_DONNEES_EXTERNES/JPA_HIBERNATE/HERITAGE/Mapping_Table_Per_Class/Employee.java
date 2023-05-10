package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.HERITAGE.Mapping_Table_Per_Class;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;

@Entity
public class Employee extends User{
	
	private int salary;

}
