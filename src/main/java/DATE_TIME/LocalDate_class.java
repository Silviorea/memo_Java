package DATE_TIME;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate_class {

	public static void main(String[] args) {

		// Instanciation à la date du jour
		LocalDate dateDuJour = LocalDate.now();
		
		
		// Formatage de la date
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd / MM / yyyy");
		String formatDate = dateDuJour.format(myFormat);
		
		
		// Instanciation à la date souhaitée
		LocalDate createDate = LocalDate.of(1986, 9, 26);
		
		
		// Récupérer une valeur d'une date
		DayOfWeek dayOfWeek = dateDuJour.getDayOfWeek();
		Month getMonth = dateDuJour.getMonth();
		int getYear = dateDuJour.getYear();
		
		// Ajouter une valeur à une date
		LocalDate datePlusDays = dateDuJour.plusDays(10);
		LocalDate datePlusMonth = dateDuJour.plusMonths(3);
		
		
		// Vérification d'une date : 
		boolean isAfter = dateDuJour.isAfter(createDate);
		
		
		
		System.out.println(
				"Date du jour : " + dateDuJour
				+"\nDate du jour formatée : " + formatDate
				+ "\nCréation d'une date : " + createDate
				+ "\n\nRécupérer valeurs d'une date :"
				+ "\nGetDayOfWeek : " + dayOfWeek
				+ "\nGetMonth : " + getMonth
				+ "\nGetYear : " + getYear
				+ "\n\nAjout de valeur à une date : "
				+ "\nPlus10Days : " + datePlusDays
				+ "\nPlus3Month : " + datePlusMonth
				+ "\n\nDateDuJour > DateCrée ? : " + isAfter);
		
	}

}
