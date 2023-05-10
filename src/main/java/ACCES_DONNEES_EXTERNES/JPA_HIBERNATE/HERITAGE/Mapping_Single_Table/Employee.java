package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.HERITAGE.Mapping_Single_Table;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Entity;

@Entity
public class Employee extends User{
	
	private int salary;

}
