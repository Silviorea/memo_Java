package ENUM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Journée j = Journée.MIDI;
		
		System.out.println("c'est " + j.toString() 
				+ " il est " + j.getHour() + " h. "
				+ j.getToSay());
		
		System.out.println(j.ordinal());
		

	}
}
