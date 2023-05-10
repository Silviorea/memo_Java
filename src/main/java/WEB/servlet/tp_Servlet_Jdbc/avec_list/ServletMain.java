package WEB.servlet.tp_Servlet_Jdbc.avec_list;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import WEB.servlet.tp_Servlet_Jdbc.Article;
import WEB.servlet.tp_Servlet_Jdbc.ArticleDao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="ServletMain", displayName = "ServletMain", urlPatterns = "/servletMain", loadOnStartup = 1)
public class ServletMain extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServletMain.class);

	private ArticleDao articleDao = new ArticleDao();
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		response.setContentType("text/html");
		response.setBufferSize(4096);
		
		LOGGER.info("Je crée ma liste d'article");
		
		List<Article> list = articleDao.getAllArticles();
		
		
		
		try (PrintWriter out = response.getWriter();)
		{
			out.println("<html><head><title>Page des articles</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">");
		
			
			LOGGER.info("J'affiche ma liste d'article");
		
			out.println("<p>Voici les articles trouvés : </p>");
			out.println("<table>");
			out.println("<tr>"
					+ "<th>Id</th>"  
					+ "<th>NumArticle</th>"
					+ "<th>Type</th>"
					+ "<th>Nom</th>"
					+ "<th>Description</th>"
					+ "</tr>");
			
			list.forEach(article -> {
				out.println("<tr>"
						+ "<td>"+ article.getId() +"</td>"
						+ "<td>"+ article.getNumArticle() +"</td>"
						+ "<td>"+ article.getType() +"</td>"
						+ "<td>"+ article.getNom() +"</td>"
						+ "<td>"+ article.getDescription() +"</td>"
						+ "<td>"
						+ "<a href=./servletAjout?id="+ article.getId()+"> Ajouter un article</a>"
						+ "</td>"
						+ "</tr>");
			});
					
			
					
			
			
			
			out.println("</table>");
			out.println("</body></html>");
		
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
