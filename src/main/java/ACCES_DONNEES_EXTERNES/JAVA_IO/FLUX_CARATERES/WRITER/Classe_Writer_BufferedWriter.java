package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.WRITER;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Permet d'écrire sur des fichiers
// Classe abstraite qui définit des opérations de base : ecrire un caract ou tableau de carac


public class Classe_Writer_BufferedWriter {

	public static void main(String[] args) {
		
		File file = new File("files/Fichier.txt");

		
		
		// METHODES
		
		// write (int)
		// write (char[])
		// write (sting)
		// append				=> pour écrire ou on souhaite sur le fichier
		// close				=> fermer le flux
		// flush				=> garantie que ce que j'ai écris dans le writer va etre transmis sur le disque
		// newLine				=> sauter la ligne
		
		
		
		
		
		try (Writer writer = new FileWriter(file); BufferedWriter bw = new BufferedWriter(writer))
		{
			// Code d'écriture
			bw.write("hello world");   // <= Flush obligatoire si je veux que mon fichier soit édité
			
			// le CLOSE et FLUSH se font automatiquement avec Try With Ressources
		} 
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
