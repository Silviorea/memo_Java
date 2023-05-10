package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.WRITER.tp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Play_with_files {

	public static void main(String[] args) throws IOException {

		File directory = new File("files");
		File file = new File("files/data.txt");
		
		
		// Utiliser le FILEWRITER pour ne pas écraser le fichier mais écrire a la suite
		FileWriter fileWriter = new FileWriter("files/data.txt", true);
		
		
		
		
		//En utilisant FILE = écraser le fichier 
		
		try (Writer writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer))
		{
			
			directory.mkdir();
			file.createNewFile();
			

			bufferedWriter.write("une 1ère ligne");
			bufferedWriter.newLine();
			bufferedWriter.write("une 2ème ligne");
//			bufferedWriter.close();    <= Obligatoire pour éditer le fichier. Automatiquement appelé si Try_With_Ressources
	
		} 
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	//En utilisant FILEWRITER = écrire a la suite du fichier 
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
		{
			
			directory.mkdir();
			file.createNewFile();
			

			bufferedWriter.write("une 1ère ligne");
			bufferedWriter.newLine();
			bufferedWriter.write("une 2ème ligne");
			bufferedWriter.newLine();
//			bufferedWriter.close();    <= Obligatoire pour éditer le fichier. Automatiquement appelé si Try_With_Ressources
	
		} 
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
