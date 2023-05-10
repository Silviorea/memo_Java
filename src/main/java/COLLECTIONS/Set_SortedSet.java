package COLLECTIONS;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// SET : 			COLLECTION QUI EVITE LES DOUBLONS
// SORTEDSET :		SET qui est AUTOMATIQUEMENT TRIEE


public class Set_SortedSet {

	public static void main(String[] args) {


		Set<String> mySet = new HashSet<>();
		
		SortedSet<String> mySortedSet = new TreeSet<>();
		mySortedSet.add("one");
		mySortedSet.add("two");
		mySortedSet.add("one");
		
		System.out.println(mySortedSet);
		

	}

}
