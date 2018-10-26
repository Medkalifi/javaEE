package tp3;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mesBeans.Client;


public class CtlLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CtlLivre() {
        super();  }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faire(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faire(request, response);
		

	}
	
	protected void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre = request.getParameter("titre");
		String categorie = request.getParameter("categorie");
		
		
		HttpSession session = request.getSession();
		
		Client client = (Client) session.getAttribute("user");
		client.ajoutLivre(titre, categorie);
		
		
		/*String nomParam, valeurParam;
		Enumeration e = request.getParameterNames();
		
		ServletOutputStream sortie = response.getOutputStream();
		sortie.println("<html><head><title>Livre</title>");
		sortie.println("</head><body><h1>Ouvrage saisi</h1>");
		sortie.println("<p>  son titre : </p>" + titre);
		sortie.println("<p>  sa catégorie : </p>" + categorie);
		sortie.println("<h3> les paramètres de la page </h3>");
	
		while(e.hasMoreElements()) {
			nomParam = (String) e.nextElement();
			valeurParam = request.getParameter(nomParam);
			
			sortie.println("nom du paramètre :"+ nomParam);
			sortie.println(" valeur du paramètre :"+ valeurParam);	
			sortie.println("<br>");
		
							}
		sortie.println("</body></html>");
		sortie.close();*/
	}
	
	
}
