package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.input;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;



// Il faut lire le fichier dans l'ordre dans lequel il a été écrit : 
// D'abord l'int du nombre de person, ensuite les persons elle meme


public class B_Play_Fun_With_Read_Serializable {

	public static void main(String[] args) {
		
		
		
		List<Person> personsListWithLoop = new ArrayList<>();
		Person [] persons = null;
		
		try (	InputStream fis = new FileInputStream("files/personsListBin.bin");
				DataInputStream dis = new DataInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(fis))
		
		{
			
			int length = dis.readInt();					// <= Je lis le Int
			
			
//			for (int i = 0; i < length; i++)			// <= Je lis les Persons une par une et les ajoute à la liste.
//			{
//				Person p = (Person) ois.readObject();
//				personsListWithLoop.add(p);
//			}
			
			
			persons = (Person[]) ois.readObject();		// <= Je lis les Persons en une fois et les mets dans le tableau	
			
			
		} 
		
		catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
		Arrays.stream(persons).forEach(System.out::println)	;	// <= J'affiche le résultat.
		System.out.println("//////////////////////////////////");

	}

}
