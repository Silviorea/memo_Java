package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.INPUTSTREAM.tp;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Play_with_DataInputStream {

	public static void main(String[] args) {
		
		try (InputStream fis = new FileInputStream("files/binary_file.txt");
			 DataInputStream dis = new DataInputStream(fis);)
		{
			fis.read();
			int i = dis.readInt();
			fis.read();
			long l = dis.readLong();
			
			
			System.out.println("i = " + i);
			System.out.println("l = " + l);
			
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
