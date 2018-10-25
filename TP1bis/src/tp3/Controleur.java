package tp3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Controleur() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		RequestDispatcher dispatch = null;
		String page = null;
		
		page = request.getParameter("page");
		
		if (page == null) {
			dispatch = ctx.getRequestDispatcher("/FormLogin");
			dispatch.forward(request, response);
		}else {
			if("1".equals(page)) {
				dispatch = ctx.getRequestDispatcher("/CtlLogin");
				dispatch.include(request, response);
				dispatch = ctx.getRequestDispatcher("/FormLivre");
				dispatch.forward(request, response);
			}else {
				if("2".equals(page)) {
					dispatch = ctx.getRequestDispatcher("/CtlLivre");
					dispatch.include(request, response);
					dispatch = ctx.getRequestDispatcher("/FormLivre");
					dispatch.forward(request, response);
				}
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
