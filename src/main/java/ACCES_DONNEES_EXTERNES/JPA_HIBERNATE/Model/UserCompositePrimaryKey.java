package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Annotations.Embeddable;

@Embeddable // Annotation qui veut dire que cette classe peut etre embarquée dans une autre
public class UserCompositePrimaryKey {
	
	long primaryKey;
	long secondPrimaryKey;

}
