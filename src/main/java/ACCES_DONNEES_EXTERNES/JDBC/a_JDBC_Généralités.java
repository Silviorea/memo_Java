package ACCES_DONNEES_EXTERNES.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

public class a_JDBC_Généralités {

	public static void main(String[] args) throws SQLException {
		
		
		///////////////////////////////////////
		// CONNEXION AVEC OBJET "CONNECTION" //
		///////////////////////////////////////
		
		String connectionString = "jdbc:mysql://127.0.0.1:3306/dbName";
		Connection connect = DriverManager.getConnection(connectionString, "root", "admin");
		
		
		
		///////////////////////////////////////////////////////////
		// REQUETE AVEC OBJET "STATEMENT" ET "PREPAREDSTATEMENT" //
		///////////////////////////////////////////////////////////
		
		
		// Requête SQL via Statement (A éviter au maximum car sensible aux SQL INJECTION. Utilisé pour requêtes très simples)
		Statement stat = connect.createStatement();
		
		ResultSet statResult =  stat.executeQuery("select ID.name from User");
		int resultUpdate =  stat.executeUpdate("Requete SQL de MAJ");			// Retourne le nombre d'enregistrement affecté par la requête
		boolean select =  stat.execute("select ID.name from User");				// True : requete de type select / False : de type MAJ
			
			if(select)
			{
				ResultSet rs = stat.getResultSet();
			}
			else 
			{
				int update = stat.getUpdateCount();
			}
		
		
			
		// Requête SQL via PrepareStatement (A utiliser en priorité. Pour des requêtes avec paramètre)
		PreparedStatement prepareStat = connect.prepareStatement("Select ID.name from User");	//<= Conçu sur une requête PARAMETRABLE unique
		
		ResultSet prepareStatResult =  prepareStat.executeQuery("select ID.name from User");
		int prepareUpdateResult =  prepareStat.executeUpdate("Requete SQL de MAJ");				//<= Retourne le nombre d'enregistrement affecté par la requête
		boolean prepareSelect =  prepareStat.execute("select ID.name from User");				//<= True : requete de type select / False : de type MAJ
			if(select)
			{
				ResultSet rs = prepareStat.getResultSet();
			}
			else 
			{
				int update = prepareStat.getUpdateCount();
			}
			
			
			
			
			// => Requetes PrepareStatement paramétrée : 
			
			PreparedStatement paramPrepareStat = 
					connect.prepareStatement("Select ID.name from User where name = ?"); 		//<= "?" est un paramètre de la requete
			
			paramPrepareStat.setString(1, "Silvio");											//<= On peut le définir via setString (indexation commence à 1)
			ResultSet result1 = paramPrepareStat.executeQuery();
			paramPrepareStat.setString(1, "Delphine");											
			ResultSet result2 = paramPrepareStat.executeQuery();
			
			
			
			
		// Requetes BATCH (Groupement de requêtes pour gagner en perf). UTILISE POUR LES REQUETES DE MAJ (update, delete)
			
			// Avec statement 
		stat.addBatch("chaine de requête SQL");
			
			// Avec prepareStatement
		prepareStat.setString(1, "Silvio");
		prepareStat.addBatch();
		prepareStat.setString(1, "Delphine");
		prepareStat.addBatch();
			
	
		
			// peut importe le type, Appel de la méthode "executeBatch" en statement et preparStatement pour générer le résultat
		
		int [] resultStat = stat.executeBatch();
		int [] resultPrepareStat = prepareStat.executeBatch();
		
		
		
		
		///////////////////////////////////////////
		// RESULTAT AVEC L'INTERFACE "RESULTSET" //
		///////////////////////////////////////////
		
		
		Statement stat2 = connect.createStatement();
		ResultSet statResult2 =  stat.executeQuery("select ID.name from User");
		
		
		// Analyse du résultat avec .next() : retourne true si il reste des lignes à analyser
		while (statResult.next())
			{
				long id = statResult2.getLong("ID"); 						// retourne le num de la colonne en paramètre
				String name = statResult2.getString("Name"); 				// retourne la valeur du nom de la colonne en paramètre
				
				ResultSetMetaData metaData = statResult2.getMetaData();		// retourne une metaData si on se sait pas quel est le type du retour (par exemple avec requetes "select *")
				int columnCount = metaData.getColumnCount(); 				// retourne le nombre de colonne du résultat
				String columnName = metaData.getColumnName(0); 				// retourne le nom de la colonne indéxée en paramètre
				int columnType = metaData.getColumnType(0); 				// retourne un int qui correspond au "type SQL" de la colonne (CHAR, VARCHAR, INT,...)
			
			};
		
		
		
	
	}

}
