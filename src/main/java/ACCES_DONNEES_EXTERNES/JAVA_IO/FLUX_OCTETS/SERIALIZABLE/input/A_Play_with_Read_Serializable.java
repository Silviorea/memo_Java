package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;


public class A_Play_with_Read_Serializable {

	public static void main(String[] args) {

		
		try (InputStream fis = new FileInputStream("files/person.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis))
		{
			
			Person p = (Person) ois.readObject();
			
			System.out.println(p.toString());
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
