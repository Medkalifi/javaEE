package tp3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FormLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream  sortie = response.getOutputStream();
		sortie.println("<html><head><title>Login</title>");	
		sortie.println("</head><body> <h1>Enregistrement</h1>");
		sortie.println("<form method='post' action='Controleur?page=1'>");
		sortie.println("<p> Quel est votre nom ? </p>");
		sortie.println("<input name=nom type=text size=25/>");
		sortie.println("<p> Votre mot de passe ? </p>");
		sortie.println("<input name=mdp type=text size=25/>");
		sortie.println("<input type=submit name='Valider'/>");
		sortie.println("</form></body></html>");
		sortie.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletOutputStream  sortie = response.getOutputStream();
		sortie.println("<html><head><title>Login</title>");	
		sortie.println("</head><body> <h1>Enregistrement</h1>");
		sortie.println("<form method='post' action='Controleur?page=1'>");
		sortie.println("<p> Quel est votre nom ? </p>");
		sortie.println("<input name=nom type=text size=25/>");
		sortie.println("<p> Votre mot de passe ? </p>");
		sortie.println("<input name=mdp type=text size=25/>");
		sortie.println("<input type=submit name='Valider'/>");
		sortie.println("</form></body></html>");
		sortie.close();
	
	
	
	}

}
