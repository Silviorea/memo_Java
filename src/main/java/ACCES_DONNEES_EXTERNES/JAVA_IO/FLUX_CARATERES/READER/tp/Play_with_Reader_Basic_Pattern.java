package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.READER.tp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Play_with_Reader_Basic_Pattern {

	public static void main(String[] args) {
		
		
		
		
			///////////////////////////////////////////////////////////////////
			// PATERN DE BASE POUR LIRE LE CONTU D'UN FICHIER AVEC UN READER //
			///////////////////////////////////////////////////////////////////
		
		
		
		// 1
		
		System.out.println("METHODE 1 : \n");
		
		try (BufferedReader bf = Files.newBufferedReader(Path.of("files/data.txt"));)
		
		{
			String currentLine = bf.readLine();
			while(currentLine != null)
			{
				System.out.println(currentLine);
				currentLine = bf.readLine();
			}
			
			
		} 
		
		
		
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		// 2
		
		System.out.println("\n\nMETHODE 2 : \n");
		
		File file = new File("files/data.txt");
		
		StringBuilder sb = new StringBuilder();			//<= Va permettre de créer des string avec les chars du fichier		
		
		try (Reader reader = new FileReader(file);)
		{
			
			
			
			char [] chars = new char [64];				//<= je crée un tableau pour accueillir les chars du fichier
			int number = reader.read(chars);			//<= la méthode read retourne le nombre de chars lus
			System.out.println(number + " chars ont été lus\n");
			
			
			
			while (number != -1)						//<= Méthode read retourne -1 quand plus rien a lire	
			{
				sb.append(chars, 0, number);			//<= a chaque itération, mon SB va intégrer les nouveaux chars de chaque ligne
				number = reader.read(chars);
				System.out.println(number + " chars ont été lus");
			}
			
			System.out.println("CONTENU DU FICHIER :\n" + sb.toString());	//<= J'affiche mon SB
			
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
