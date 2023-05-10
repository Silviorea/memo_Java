package WEB.servlet.tp_Servlet_Jdbc.avec_list;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import WEB.servlet.tp_Servlet_Jdbc.Article;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="ServletPanier", displayName = "ServletPanier", urlPatterns = "/servletPanier", loadOnStartup = 1)
public class ServletPanier extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServletPanier.class);

	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		
		LOGGER.info("Début Servlet PANIER");
		
		response.setContentType("text/html");
        response.setBufferSize(8192);
        
        
        try (PrintWriter out = response.getWriter();)
		{
			out.println("<html><head><title>Page des articles</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">");

			
			List<Article> panier = (List<Article>) request.getSession().getAttribute("panier");
			
			
		
		
			out.println("</body></html>");
			LOGGER.info("Fin de la servlet PANIER");
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}


}
