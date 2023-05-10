package STREAM.C_OPERATIONS_TERMINALES.COLLECTION;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect_Collectors_ToList_ToSet {

	public static void main(String[] args) {
		
		Stream<String> myStream = Stream.of("one", "two", "three");

		
		List<String> list = myStream.collect(Collectors.toList());
		
		
		Set<String> set = myStream.collect(Collectors.toSet());
		
		
		
	}

}
