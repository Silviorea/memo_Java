package ACCES_DONNEES_EXTERNES.JDBC;

import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;




public class JDBC_m2i {
    public static void main(String args[]) {
        String createDatabase = "CREATE DATABASE IF NOT EXISTS m2iTest CHARACTER SET utf8;";
        String useBDD = "use m2iTest";
        String createTable = "CREATE TABLE IF NOT EXISTS Utilisateurs ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "nom VARCHAR(50) NOT NULL, "
                    + "adresse VARCHAR(255))";
        String insertValue1 = "INSERT INTO Utilisateurs VALUES (DEFAULT, 'm2i', 'Tours')";
        String insertValue2 = "INSERT INTO Utilisateurs VALUES (DEFAULT, 'FI86', 'Poitiers')";
        String insertValue3 = "INSERT INTO Utilisateurs VALUES (DEFAULT, 'test', 'test')";
        String update = "UPDATE Utilisateurs SET nom = 'M2I Formation' WHERE nom = 'm2i'";
        String delete = "DELETE FROM Utilisateurs WHERE nom = 'test'";
        String select = "SELECT * FROM Utilisateurs";
        
        // Suppression du contenu d'une table complete
        // DELETE ne réinitialise pas l'auto incr�mentation s'il y en a une.
        // DELETE FROM nom_table
        // TRUNCATE permet de r�initialiser l'auto incr�menation s'il y en a une.
        // TRUNCATE TABLE nom_table
        String trucateTable = "TRUNCATE TABLE Utilisateurs";
        
        String str10 = "INSERT INTO Utilisateurs VALUES(DEFAULT, ?, ?)";
        String str11 = "DROP DATABASE test";
        
        
        

        
        try {
        	

        // Etape 1: charger la classe driver
        
        // Ancienne version
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Nouvelle version
         
			
         
            // Etape 2: cr�er l'objet de connexion
         
         Connection connect = DriverManager.getConnection(
        		 								"jdbc:mysql://localhost:3306/?useSSL=false"
        		 								, "root"
        		 								, "admin");
            
         
            // Etape 3: créer l'objet statement 
            
         Statement statement = connect.createStatement();
         
         
         
            // Etape 4: exécuter des requêtes
         
         
         	// Créer la base
         
       //"CREATE DATABASE IF NOT EXISTS m2iTest CHARACTER SET utf8;"
         System.out.println("Création de la BDD");
         statement.executeUpdate(createDatabase);
         
         statement.executeUpdate(useBDD);
         
         //"CREATE TABLE IF NOT EXISTS Utilisateurs (...)"
         System.out.println("Création de la table");
         statement.executeUpdate(createTable);
         
         System.out.println("Insérer valeur 1");
         statement.executeUpdate(insertValue1);
         
         System.out.println("Insérer valeur 2");
         statement.executeUpdate(insertValue2);
         
         System.out.println("Insérer valeur 3");
         statement.executeUpdate(insertValue3);
         
         System.out.println("update");
         statement.executeUpdate(update);
         
         System.out.println("delete");
         statement.executeUpdate(delete);
            
         
         
            // Pour la lecture on utlise la méthode executeQuery qui retourne un ResultSet
           
         System.out.println("Lecture des données");
         
         ResultSet resultSet = statement.executeQuery(select);
         
         
         
         
           // Informations sur la table � partir d'un ResultSet
         ResultSetMetaData resultSetMeta = resultSet.getMetaData();
         
         System.out.println("Nom de la table : " + resultSetMeta.getTableName(1) );
         System.out.println("Total des colonnes: " + resultSetMeta.getColumnCount() );
         System.out.println("Nom de la table : " + resultSetMeta.getTableName(1) );
         System.out.println("Nom de la 1ère colonne : " + resultSetMeta.getCatalogName(1) );
         System.out.println("Nom de la 1ère colonne : " + resultSetMeta.getColumnType(1) );
         
         
         

            // Parcours du ResultSet
         
         while(resultSet.next())
         {
        	 String nom = resultSet.getString("nom");
        	 String adresse = resultSet.getString("adresse");
        	 
        	 System.out.println("nom = " + nom);
        	 System.out.println("adresse = " + adresse);
        	 
        	 System.out.println("");
        	 
         }
         
         
         
         

 
         
         
         
         
         // PREPARED STATEMENT
         
         PreparedStatement preparedStat = connect.prepareStatement("INSERT INTO Utilisateurs VALUES(DEFAULT, ?, ?)");
         
         preparedStat.setString(1, "m2i");
         preparedStat.setString(2, "Lyon");
         
         
            // Il existe des méthodes tel que next, previuos, first, last ...
            
         
         
            //////////////////// ROWSET ////////////////////
            //Création et exécution de RowSet
        
            
         JdbcRowSet rowSet  = RowSetProvider.newFactory().createJdbcRowSet();
         rowSet.setUrl("jdbc:mysql://localhost:3306/m2iTest?useSSL=false");
         rowSet.setUsername("root");
         rowSet.setPassword("admin");
         
         rowSet.setCommand(select);				// Ma requete
         rowSet.execute();						// Son execution
         	
         System.out.println("Requete SELECT avec ROWSET : ");
         while(rowSet.next())					// Son résultat
         {
        	 System.out.println("Nom = " + rowSet.getString("nom"));
        	 System.out.println("Adresse = " + rowSet.getString("adresse"));
         }
         
         
         
         	///////////////// FIN ROWSET //////////////////
         
         
         
         
         	// Vider la table
         
         System.out.println("Réinitialisation des données de la table");
         statement.executeUpdate(trucateTable);
         
         
         
         
            // Suppression de la BDD


            
            // Etape 5: fermer l'objet de connexion
        	
         connect.close();
        
        
        }
        
        catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        
   
    }
}