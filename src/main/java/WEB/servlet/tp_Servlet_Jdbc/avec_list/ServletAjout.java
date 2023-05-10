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

@WebServlet(name="ServletAjout", displayName = "ServletAjout", urlPatterns = "/servletAjout", loadOnStartup = 1)
public class ServletAjout extends HttpServlet{

	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ServletAjout.class);
	List<Article>panier = new ArrayList<>();;
	ArticleDao articleDao = new ArticleDao();
	Article article;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		LOGGER.info("Début de la servlet AJOUT");
		
		
		LOGGER.info("je récupère le paramètre ID");
		
		// Je récupère l'ID de l'article sur lequel j'ai cliqué
		Integer articleDeLaSessionID = Integer.valueOf(request.getParameter("id"));
		

		
		LOGGER.info("je remplis mon panier");
		
		// Pour chaque Article, si son ID correspond a celui sur lequel j'ai cliqué, je l'ajoute dans le panier
		articleDao.getAllArticles().forEach(articleIteration -> {
			
			if (articleIteration.getId() == articleDeLaSessionID)
			{
				panier.add(articleIteration);
				article=articleIteration;
			}
			
		});
		
		
		
		
		if (request.getSession().getAttribute("panier") == null)
		{
			request.getSession().setAttribute("panier", panier);
		}
		
		
		

		
		
		try (PrintWriter out = response.getWriter();)
		{
			out.println("<html><head><title>Page des articles</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">");
		
			
			LOGGER.info("J'ajoute un article au panier");
		
			out.println ("vous avez cliqué sur l'article : " + request.getParameter("id"));
			out.println ("Nombre d'éléments au panier : " + panier.size());
			
			
			
			
			out.println("</table>");
			out.println("</body></html>");
		
		
			
			LOGGER.info("Fin de la servlet AJOUT");
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
