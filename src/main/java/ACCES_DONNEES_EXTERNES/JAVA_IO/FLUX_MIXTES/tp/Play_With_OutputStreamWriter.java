package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_MIXTES.tp;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;


public class Play_With_OutputStreamWriter {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Silvio", "Peaugres", 36);
		Person p2 = new Person("Delphine", "Vénissieux", 34);
		Person p3 = new Person("Valentina", "Lyon", 5);
		Person p4 = new Person("Emilia", "Lyon", 1);
		Person p5 = new Person("Plume", "Vénissieux", 3);
		
		List<Person> persons = List.of(p1,p2,p3,p4,p5);
		
		
		
		
		try (	OutputStream fos = new FileOutputStream("files/mixte.txt");		//<= Mon FOS
				OutputStreamWriter osw = new OutputStreamWriter(fos);			//<= Décoration de FOS pour écrire du mixte
				PrintWriter pw = new PrintWriter(osw);							//<= Décoration du OSW pour formater le texte
				BufferedWriter bw = new BufferedWriter(osw);
				ObjectOutputStream oos = new ObjectOutputStream(fos))			//<= Décoration de FOS pour écrire des Objets
		{
			pw.printf("Nombre de personne = %d", persons.size());
			pw.flush();
			bw.newLine();
			bw.flush();
			oos.writeObject(persons);
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DONE");
		

	}

}
