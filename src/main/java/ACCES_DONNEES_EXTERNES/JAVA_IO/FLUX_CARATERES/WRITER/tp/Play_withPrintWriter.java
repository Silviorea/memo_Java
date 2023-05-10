package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_CARATERES.WRITER.tp;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.PrintWriter;

public class Play_withPrintWriter {

	public static void main(String[] args) {
		
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
