package STREAM.C_OPERATIONS_TERMINALES.SUR_PRIMITIFS;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Min_Max_Average_Sum {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(1, 2, 3, 4);
		
		
		OptionalInt min = intStream.min();
		
		OptionalInt max = intStream.max();
		
		int sum = intStream.sum();
		
		OptionalDouble average = intStream.average();
	}

}
