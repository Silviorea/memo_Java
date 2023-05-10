package DATE_TIME;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


// Timestamp est une class du package SQL

public class LocalDateTime_Timestamp_class {

	public static void main(String[] args) {
		
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		
		
		// Créer un LocalDateTime avec LocalDate et LovalTime
		LocalDate date = LocalDate.of(1986, 9, 26);
		LocalTime time = LocalTime.of(15, 30);
		LocalDateTime createLocalDateTime = LocalDateTime.of(date, time);
		
	
		
		// Timestamp
		// Date et Heure actuelle 
		Timestamp now = new Timestamp(System.currentTimeMillis());
		
		long getTime = now.getTime();
		
		
		// Créer un Timestamp
		//le format "yyyy-mm-dd hh:mm:ss.fffffffff"
		Timestamp myTimeStamp = Timestamp.valueOf("2022-03-16 14:30:00.000000000");
		
		
		System.out.println("TIMESTAMP: "
				+ "\nNow = " + now
				+ "\ngetTime = " + getTime
				+ "\nTimestamp crée : " + myTimeStamp
				+"\n\nLOCALDATETIME : "
				+"\nNow = " + localDateTime
				+"\nCreate LocalDateTime : " + createLocalDateTime);

	}

}
