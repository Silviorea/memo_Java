package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;


public class A_Play_with_Write_Serializable {


	public static void main(String[] args) {
		
		Person person = new Person("Paul", "Paris", 32);
		
		try (OutputStream fos = new FileOutputStream("files/person.bin");
			 ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			
			oos.writeObject(person);
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DONE");
		
		

	}

}
