package WEB.servlet.tp_Servlet_Jdbc.avec_map;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import WEB.servlet.tp_Servlet_Jdbc.ArticleDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "panier", displayName = "La servlet du panier", urlPatterns = "/panier", loadOnStartup = 1)
public class AfficherPanierServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Map<Integer, Integer> map = new HashMap<>();
	
	
	@Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setBufferSize(8192);
        
        ArticleDao articleDao = new ArticleDao();
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>"
                    + "<head><title>Générée par une servlet</title></head>");
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<h2>Voici le contenu de votre panier !!!</h2>");
            
           
            
            
            Map<Integer, Integer> attribute = (Map<Integer, Integer>)   request.getSession().getAttribute("panier");
            
            
            
            

            out.println("</body></html>");
        }
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
