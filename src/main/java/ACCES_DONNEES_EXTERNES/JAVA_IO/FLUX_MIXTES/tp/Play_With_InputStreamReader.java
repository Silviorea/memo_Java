package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_MIXTES.tp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.SERIALIZABLE.Person;


public class Play_With_InputStreamReader {

	public static void main(String[] args) {
		
		try (	InputStream fis = new FileInputStream("files/mixte.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);)
		{
			String firstLine = br.readLine();
			List<Person> persons = (List<Person>) ois.readObject();
			System.out.println(firstLine);
		} 
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
