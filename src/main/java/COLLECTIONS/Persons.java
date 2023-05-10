package COLLECTIONS;

public class Persons {
	
	String name;
	int age;
	
	
	
	public Persons(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + "]";
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
