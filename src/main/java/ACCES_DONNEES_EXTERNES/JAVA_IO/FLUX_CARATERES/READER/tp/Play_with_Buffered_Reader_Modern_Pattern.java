package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER.tp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Collectors;

public class Play_with_Buffered_Reader_Modern_Pattern {

	public static void main(String[] args) {
		
		File file = new File("files/data.txt");
		
		try (Reader reader = new FileReader(file); BufferedReader bf = new BufferedReader(reader))
		{
			
			String contenu = bf.lines().collect(Collectors.joining("\n"));
			
			System.out.println("Contenu de mon fichier :\n" + contenu);
	
		} 
		
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}

}
