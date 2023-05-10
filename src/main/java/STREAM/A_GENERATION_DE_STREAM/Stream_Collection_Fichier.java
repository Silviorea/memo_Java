package STREAM.A_GENERATION_DE_STREAM;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Collection_Fichier {

	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<>();
		int[] array = new int[5];
		Path path = Paths.get("path de mon fichier");
		
		
		
		
		// A partir d'une liste
		list.stream();
		
		
		// A partir d'un tableau
		Arrays.stream(array);
		
		
		// Via la méthode .OF
		Stream.of("one","two","three");
		
		
		// Créer un stream VIDE
		Stream.empty();
		
		
		// Stream de FICHIER
		Files.lines(path);
		
		
		
		
		
	}

}
