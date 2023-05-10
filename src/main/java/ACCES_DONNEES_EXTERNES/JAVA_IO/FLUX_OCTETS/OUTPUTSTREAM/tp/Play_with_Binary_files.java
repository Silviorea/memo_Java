package ACCES_DONNEES_EXTERNES.JAVA_IO.FLUX_OCTETS.OUTPUTSTREAM.tp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Play_with_Binary_files {

	public static void main(String[] args) {
		
		File file = new File("files/binary_file.bin");
		
		
		/////////////////
		// OutputSTREAM /
		/////////////////
		
		
		try (OutputStream os = new FileOutputStream(file);)
		{
			byte b = (byte) 0xFF;
			os.write(b);
			
			os.write(0xAB);
			os.write(0x10);
			os.write(0x06);
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OK");
		
		
		
		///////////////////////////
		// ByteArrayOutputStream //
		///////////////////////////
		
		
		// BOS fonctionne comme le StringBuilder. Va augmenter la taille du tableau de Byte s'il sature
		
		byte [] bytes = null;
		
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
			 OutputStream os = new FileOutputStream(file);)
		{
			byte b = (byte) 0xFF;
			bos.write(b);
			bos.write(0xAB);
			bos.write(0x10);
			bos.write(0x06);
			
			bos.flush();
			
			bytes = bos.toByteArray();
			
			
			// Je peux ensuite copier mon tableau de byte dans un fichier
			
			os.write(bytes);
			
			
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Nombre de bytes dans le BOS = " + bytes.length);
		
		

	}

}
