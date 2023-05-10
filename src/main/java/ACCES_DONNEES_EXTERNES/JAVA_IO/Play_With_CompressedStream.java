package ACCES_DONNEES_EXTERNES.JAVA_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.zip.GZIPOutputStream;

public class Play_With_CompressedStream {

	public static void main(String[] args) {
		
		try (	OutputStream fos = new FileOutputStream("files/numbers.txt.gz");
				GZIPOutputStream gzos = new GZIPOutputStream(fos);
				OutputStreamWriter osw = new OutputStreamWriter(gzos))			//<= DECORATION DU GZIP
		{
			
			osw.write("Bonjour");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("DONE");

	}

}
