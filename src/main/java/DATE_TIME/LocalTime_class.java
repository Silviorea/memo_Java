package DATE_TIME;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import jakarta.ejb.Local;

public class LocalTime_class {

	public static void main(String[] args) {
		
		// Afficher l'heure du moment
		LocalTime now = LocalTime.now();
		
		
		// Format personnalisé 
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatTime = now.format(myFormat);
		
	
		
		// Créer une heure spécifique
		LocalTime createHours = LocalTime.of(14, 30);
		
		
		// Créer une heure à partir d'une STRING
		LocalTime createByString = LocalTime.parse("16:30");
		
		
		
		// Extraire une durée
		int getHour = now.getHour();
		int getMinute = now.getMinute();
		
		
		// Ajouter une durée
		Duration addTime = Duration.ofHours(2);
		LocalTime add2Hours = now.plus(addTime);
		
		LocalTime add3Hours = now.plusHours(3);
		
		
		//Soustraire une durée
		Duration removeTime = Duration.ofMinutes(30);
		LocalTime remove30Minutes = now.minus(removeTime);
		
		LocalTime remove20Minutes = now.minusMinutes(20);
		
		
		// Vérification d'une heure : 
		boolean isBefore = now.isAfter(createHours);
		
		
		
		
		
		System.out.println(
				"Now = " + now 
				+"\nFormat Now = " + formatTime
				+"\nCreateHour = " + createHours
				+"\nGetHours = " + getHour
				+"\nAdd 2 hours = " + add2Hours
				+"\nRemove 30 min = " + remove30Minutes);

	}

}
