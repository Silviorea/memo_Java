package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.WRITER;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

//Classe de Writer 


public class Classe_PrintWriter {

	public static void main(String[] args) throws IOException {
		
		File file = new File("files/Fichier.txt");
		PrintWriter pw = new PrintWriter(file);
		
		// Methode
		
				// print
				// println
				// printf

		
		
		
		
		
		// Expl avec un autre type de WRITER :
		
		
		CharArrayWriter writer = new CharArrayWriter();
		BufferedWriter buffWriter = new BufferedWriter(writer);
		PrintWriter printWriter = new PrintWriter(buffWriter);
		
		int number = 12;
		printWriter.println(number);
		
		
		
		printWriter.printf("number = %d\n", 42);
		
		
		
		
		
		printWriter.flush();
		writer.flush();
		
		
		System.out.println(writer.toString());
		

	}

}
