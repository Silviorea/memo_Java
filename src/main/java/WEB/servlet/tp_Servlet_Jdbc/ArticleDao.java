package WEB.servlet.tp_Servlet_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mysql.cj.jdbc.Driver;



public class ArticleDao {

	/** Création d'un nouvel attribut statique qui nous sert à logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ArticleDao.class);

	public List<Article> getAllArticles() {
		
		LOGGER.info("Appel de getAllArticles.");

		// Création de la liste que je vais remplir avec les données de la BDD
		List<Article> articles = new ArrayList<>();
		
		
		// Connection a l'aide de Properties : Crée une relation clés/Valeur
		Properties connectionProps = new Properties();
		connectionProps.put("user", "root");
		connectionProps.put("password", "admin");


		
		// EQUIVALENT A CLASS.FORNAME de Jdbc
		
		try {
			DriverManager.registerDriver(new Driver());
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			LOGGER.error("Erreur lors de l'enregistrement du driver.", e);
			// Ici, il faudrait lancer une nouvelle Exception avec
			//throw new RuntimeException(e);
		}

		
		
		// Je reprends les clés/valeur de l'objet Properties pour me connecter
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",connectionProps); 
			 Statement stmt = connection.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT * FROM article")) {

			LOGGER.info("Exécution de la requête select");

			
			
			// Chaque élément du résultSet me permet d'ajouter un Article dans la liste.
			while (rs.next()) {
				LOGGER.debug("Un article a été trouvé en base");
				Article article = new Article();
				article.setId(rs.getInt("id"));
				article.setNumArticle(rs.getInt("numArticle"));
				article.setType(rs.getString("type"));
				article.setNom(rs.getString("nom"));
				article.setDescription(rs.getString("description"));
				articles.add(article);
			}
		} catch (Exception e) {
			LOGGER.error("Erreur lors de l'enregistrement du driver.", e);
		}
		return articles;
	}
	
	
	
	
	
	// Méthode bouchon, au cas où il n'y ai rien en BDD pour compléter la liste au cas où.
	// PAs utilisé dans le cadre de cet exercice. A utiliser dans les Tests si besoin.

//	public List<Article> getArticlesBouchon() {
//		List<Article> articles = new ArrayList<>();
//		Article article1 = new Article();
//		article1.setId(1);
//		article1.setNom("Bague");
//		article1.setCategorie("Objet de luxe");
//		Article article2 = new Article();
//		article2.setId(2);
//		article2.setNom("Bouteille");
//		article2.setCategorie("Boisson");
//		Article article3 = new Article();
//		article3.setId(3);
//		article3.setNom("Motoculteur");
//		article3.setCategorie("Objet de luxe");
//
//		articles.add(article1);
//		articles.add(article2);
//		articles.add(article3);
//
//		return articles;
//	}

}
