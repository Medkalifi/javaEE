package tp3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mesBeans.Client;


public class CtlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CtlLogin() {     super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//faire(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faire(request, response);
		
	}
	
	protected void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nom = request.getParameter("nom");
		String mdp = request.getParameter("mdp");
		
		Client user = new Client(nom, mdp);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("user", user);
		
	}

}
