package tp1Bis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormLivreAchnger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FormLivreAchnger() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream sortie = response.getOutputStream();
		sortie.println("<html><head><title>Livre</title>"); 
		sortie.println("</head><body> <h1>Ouvrage demandé</h1>");
		sortie.println("<form method='post' action='CtlLivre'>"); 
		sortie.println("<p> Quel est son titre ? </p>"); 
		sortie.println("<input name=titre type=text size=25/>"); 
		sortie.println("<p> Quelle est sa catégorie ? </p>"); 
		sortie.println(" <select name='categorie'>" + 
		" <option>Thriller</option>" +
		" <option>Roman</option> "+ " <option>Bande dessin&eacute;e</option>"+
		"<option>Histoire</option>" + "</select>" ); 
		sortie.println("<input type=submit name=Valider/>"); 
		sortie.println("</form></body></html>");
		sortie.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
