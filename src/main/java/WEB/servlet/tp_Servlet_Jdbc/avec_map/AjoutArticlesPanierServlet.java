package WEB.servlet.tp_Servlet_Jdbc.avec_map;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import WEB.servlet.tp_Servlet_Jdbc.ArticleDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Panier Articles", displayName = "La servlet du panier articles", urlPatterns = "/ajout-panier", loadOnStartup = 1)
public class AjoutArticlesPanierServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	Map<Integer, Integer> map;

	@Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setBufferSize(8192);
        
        
        
        ArticleDao article = new ArticleDao();
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>"
                    + "<head><title>Générée par une servlet</title></head>");
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<h2>C'est ici qu'on ajoute des articles</h2>");
            
            out.println ("vous avez cliqué sur l'article : " + request.getParameter("id"));
            
            
            if (request.getSession().getAttribute("panier") != null)
            {
            	map = (Map<Integer, Integer>) request.getSession().getAttribute("panier");
            }
            
            else
            {
            	map = new HashMap<>();
            	request.getSession().setAttribute("panier", map);
            }
            
            
            
            int key = Integer.valueOf(request.getParameter("id"));

            if (!map.containsKey(key))
        	map.put(key, 1);
            
            else
            {
            	map.replace(key, map.get(key) + 1);
            }
            
            
            out.println("<table>");
			out.println("<tr>"
					+ "<th>Id</th>"  
					+ "<th>Nombre</th>"
					+ "</tr>");
			
					
			for (Entry<Integer, Integer> mapLoop : map.entrySet()) 
			
			{
				out.println("<tr>"
					+ "<td>" + mapLoop.getKey() + "</td>"  
					+ "<td>"+ mapLoop.getValue() +"</td>"
					+ "</tr>");
			}
			
			
			out.println(" <a href ='./panier'> Votre panier </a> ");
					
					
			
			
			
//						+ "<td>"
//						+ " <a href ='./ajout-panier?id="+ article.getId() +" '  > Ajout article </a> "
//			            + "</td>"
//						+ "</tr>");
				
				// ./ajout-panier?id=X&numArticle=X&typ=X&nom=X&description=X
			
			
			
			
			
			out.println("</table>");
			out.println("</body></html>");
			}
			//Fermeture des balises
		
            
            
            
            // getSession renvoie une MAP
//            request.getSession().setAttribute("panier", map);
            

            

            
        }



	
//  String username = request.getParameter("username");
//  if (username != null && username.length() > 0) {
//      out.println("Vous êtes : "+ username);
//  }
	

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init terminé");
	}
    

}
