package tp1Bis;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CtlLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CtlLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre;
		titre = request.getParameter("titre");
		String categorie;
		categorie = request.getParameter("categorie");
		String nomParam, valeurParam;
		
		Enumeration e = request.getParameterNames();
		
		ServletOutputStream sortie = response.getOutputStream();
		sortie.println("<html><head><title>Livre</title>");
		sortie.println("</head><body><h1>Ouvrage saisi</h1>");
		sortie.println("<p> Quel est son titre : </p>" + titre);
		sortie.println("<p> Quelle est sa catégorie : </p>" + categorie);
		sortie.println("<h3> les paramètres de la page </h3>");
	
		while(e.hasMoreElements()) {
			nomParam = (String) e.nextElement();
			valeurParam = request.getParameter(nomParam);
			
			sortie.println("nom du paramètre :"+ nomParam);
			sortie.println("valeur du paramètre :"+ valeurParam);

			
		}
		sortie.println("</body></html>");
		sortie.close();

	}

}
