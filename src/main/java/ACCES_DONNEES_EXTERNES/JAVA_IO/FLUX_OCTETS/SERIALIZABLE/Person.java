package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE;

import java.io.Serializable;
import java.util.Objects;



/*
 * Person implémente SERIALIZABLE : 
 * 
 * On peut écrire des instances de Person dans des fichiers au format binaire.
 */



public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8930237300603222182L;

	private String name, city;
	private int age;
	
	
	public Person() {
		super();
	}


	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, city, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}

	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
