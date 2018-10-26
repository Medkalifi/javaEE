package tp3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mesBeans.Client;
import mesBeans.Livre;


public class FormLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public FormLivre() {    super();  }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//faire(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faire(request, response);
	}
	  
	protected void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Client client = (Client) session.getAttribute("user");
		String user = client.getUser();
		ArrayList<Livre> liste = client.getLivres();
		
		ServletOutputStream sortie = response.getOutputStream();
		sortie.println("<html><head><title>Livre</title>"); 
		sortie.println("</head><body> <h3> Bonjour :"+user+"</h3>"
				+ " <h1>Ouvrage demandé</h1>");
		sortie.println("<form method='post' action='Controleur?page=2'>"); 
		sortie.println("<p> Quel est son titre ? </p>"); 
		sortie.println("<input name=titre type=text size=25/>"); 
		sortie.println("<p> Quelle est sa catégorie ? </p>"); 
		sortie.println(" <select name='categorie'>" + 
		" <option>Thriller</option>" +
		" <option>Roman</option> "+ " <option>Bande dessin&eacute;e</option>"+
		"<option>Histoire</option>" + "</select>" ); 
		sortie.println("<input type=submit name=Valider/>"); 
		sortie.println("</form>");
		sortie.println("<p> vos réservations: </p>");
		for (Livre livre : liste) {
			sortie.println(livre.toString());
			
		}
		sortie.println("</body></html>");
		sortie.close();
		
	}
	
	

}
