package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.OUTPUTSTREAM.tp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Play_with_DataOutputStream {

	
	// DECORATION de la classe OutPutSTREAM
	
	// Permet d'écrire directement des entier ou Long dans le OutputStream
	
	
	public static void main(String[] args) {
		
		
		
		
		// DECORATION DU BYTEARRAY
		
		
		
		byte [] bytes = null;
		
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
			 DataOutputStream dos = new DataOutputStream(bos);	
			 OutputStream os = new FileOutputStream("files/binary_file.txt");)
		{
			
			int i = 12;				//<= Encodé sur 4 octets
			long l = 314L;			//<= Encodé sur 8 octets
			
			
			dos.writeInt(i);
			dos.flush();
			bos.flush();
			bytes = bos.toByteArray();
			
			System.out.println("Nombre de bytes dans le BOS après writeInt= " + bytes.length);
			
			
			
			dos.writeLong(l);
			dos.flush();
			bos.flush();
			bytes = bos.toByteArray();
			
			System.out.println("Nombre de bytes dans le BOS après writeInt + writeLong= " + bytes.length);
			
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		// DECORATION DU FILEOUTPUTSTREAM
		
		
		try (OutputStream fos = new FileOutputStream("files/binary_file.txt");
			 DataOutputStream dos = new DataOutputStream(fos);	)
			{
				
				int i = 9;				//<= Encodé sur 4 octets
				long l = 15;			//<= Encodé sur 8 octets
				
				
				dos.writeLong(l);

				// Verifier la taille en nombre de bytes du fichier "binary_file.txt"
				
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
		

	}

}
