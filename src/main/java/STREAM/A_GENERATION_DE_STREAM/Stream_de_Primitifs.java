package STREAM.A_GENERATION_DE_STREAM;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Stream_de_Primitifs {

	public static void main(String[] args) {

		
	// STREAM DE NOMBRE //
		
		// Avec la classe INTSTREAM : 
		
		IntStream intStream = IntStream.of(5);
		
		
		
		// Avec la CLASSE RANDOM:
		
		Random r = new Random();
		
		IntStream myInt = r.ints();				// Génération d'une infinité de IntStreams
		IntStream myInt2 = r.ints(5);			// Génération de 5 IntStreams
		IntStream myInt3 = r.ints(0, 11);		// Génération d'une infinité de IntStreams entre 0 et 10
		IntStream myInt4 = r.ints(5, 0, 11);	// Génération de 5 IntStreams entre 0 et 10
		
		LongStream myLong = r.longs();
		DoubleStream Double = r.doubles();
		
		
		
		// Avec la Méthode RANGE() :
		
		 IntStream.range(1, 11);				// Va générer des stream de tous les INT entre 1 et 11 (donc 10)
		
		
		 
		 
		 
		 
		
	}

}
