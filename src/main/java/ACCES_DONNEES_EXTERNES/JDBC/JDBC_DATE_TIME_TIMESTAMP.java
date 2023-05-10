package ACCES_DONNEES_EXTERNES.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JDBC_DATE_TIME_TIMESTAMP {

	public static void main(String[] args) throws SQLException {

		String connectionString = "jdbc:mysql://127.0.0.1:3306/dbName";
		Connection connect = DriverManager.getConnection(connectionString, "root", "admin");
		Statement stat = connect.createStatement();
		ResultSet result = stat.executeQuery("my QUERY");
		
		
		
		// ANCIENNE METHODE DE GESTION DES DATES
		
		Date date = result.getDate("Nom de colonne");			// Retourne un objet DATE de la colonne
		Time time = result.getTime("Nom de colonne");			// Retourne un objet TIME de la colonne
		Timestamp tstamp = result.getTimestamp("Nomcolonne");	// Retourne un objet Timestamp de la colonne (date + heure)
		
		
		
		/*
		 * DEPUIS JAVA 8, nouvelle API "DATE&TIME". Apporte de nouvelle fonctionnalités au JDK mais pas présente dans l'API JDBC
		 * Il existe des méthodes "pont" entre les 2 API
		 */
		
		// création via API Date&Time :
		LocalDate localDate = LocalDate.of(2001, 04, 21);
		LocalTime localTime = LocalTime.of(15, 31, 12);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		
		
		// Méthodes pont de l'API JDBC
		
			// dans un sens
		Date date2 = Date.valueOf(localDate);
		Time time2 = Time.valueOf(localTime);
		Timestamp tStamp2 = Timestamp.valueOf(localDateTime);
		
		
			// et dans l'autre
		LocalDate localDate2 = date2.toLocalDate();
		LocalTime localTime2 = time2.toLocalTime();
		LocalDateTime localDateTime2 = tStamp2.toLocalDateTime();
		
		
		
	}

}
