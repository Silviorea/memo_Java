package JSON.model;

public class MonModel {
	
	private String name;
    private int age;
    
    

    public MonModel() {}
    
    
    



	public MonModel(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}






	@Override
    public String toString() {
        return "MyData [name=" + name + ", age=" + age + "]";
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
