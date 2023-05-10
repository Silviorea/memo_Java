package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.output;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;


public class B_Play_Fun_With_Write_Serializable {

	public static void main(String[] args) {
		
		Person p1 = new Person("Silvio", "Peaugres", 36);
		Person p2 = new Person("Delphine", "Vénissieux", 34);
		Person p3 = new Person("Valentina", "Lyon", 5);
		Person p4 = new Person("Emilia", "Lyon", 1);
		Person p5 = new Person("Plume", "Vénissieux", 3);
		
		Person[] persons = new Person[] {p1,p2,p3,p4,p5};
		
		
		/*
		 * Je souhaite écrire : 	
		 * 		- le nombre de personne dans le fichier		-> DataOutputStream car entier à écrire
		 * 		- chaque personne 1 par 1					-> ObjectOutputStream car objet a écrire
		 */
		
		
		
		try (OutputStream fos = new FileOutputStream("files/personsListBin.bin");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 DataOutputStream dos = new DataOutputStream(fos))
		{
			
			dos.writeInt(persons.length);
			oos.writeObject(persons);
			
			
			System.out.println("Done");
			
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
