package DATE_TIME;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ZonedDateTimeClass {

	public static void main(String[] args) {
		
		ZonedDateTime currentDayZ = ZonedDateTime.parse(ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT));
		
		ZonedDateTime test = ZonedDateTime.parse("2023-11-06T03:01:00.538047+01:00[Europe/Paris]");
		ZonedDateTime test2 = test.plusHours(1);
		
		ZonedDateTime dateToday = ZonedDateTime.now();
		ZonedDateTime modify = dateToday.withHour(20);
		
		Duration gap = Duration.between(test, test2);
		System.out.println(gap.toHours());

	}

}
