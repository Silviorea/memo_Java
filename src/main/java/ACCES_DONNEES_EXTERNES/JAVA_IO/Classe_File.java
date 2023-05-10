package ACCES_DONNEES_EXTERNES.JAVA_IO;

import java.io.File;
import java.io.IOException;

public class Classe_File {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("files/Fichier.txt");
		
		
		System.out.println(
				f.isDirectory()
				);
		
		
		
		
		// ACCES AU FICHIER => retourne String
		
		f.getName(); 								//<= Nom du fichier en retirant le chemin
		f.getParent();								//<= Nom du dossier parent
		f.getPath();								//<= Nom du chemin d'accès
		f.getCanonicalPath();						//<= Obtenir le chemin absolue d'un chemin relatif	
		
		
		// VERIFIER le fichier => retourne Boolean
		
		f.exists();									// <= True si le fichier existe							
		
		f.isFile();									//<= True si le chemin est un fichier ou répertoire
		f.isDirectory();							
		
		f.canRead();								//<= True si je peux lire, écrire ou executer le fichier
		f.canWrite();								
		f.canExecute();
		
		
		// CREER / SUPPRIMER / RENOMMER Fichier ou Répertoire => retourne Boolean
		f.delete();									//<= Supprimer le fichier
		f.createNewFile();							//<= Créer un fichier qui correspond à ce chemin
		f.mkdir();									//<= Créer un repertoire qui correspond à ce chemin
		f.mkdirs();									//<= Créer toute la chaine de répertoire qui correspond au chemin absolue
		
		
		File fileRename = new File("files/Nouveau_Nom_Fichier.txt");
		f.renameTo(fileRename);						// <= Renommer le fichier
		
	
		
		
		
		
		
		
	}

}
