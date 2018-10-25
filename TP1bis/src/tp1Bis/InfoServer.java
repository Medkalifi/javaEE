package tp1Bis;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InfoServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InfoServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                ServletContext sc = getServletContext();
                String info = sc.getServerInfo();
                String real = sc.getRealPath("");
                
                String nomctx = sc.getServletContextName();
                sc.log("ecrire dans le log de "+ info);
                ServletOutputStream out = resp.getOutputStream();
                out.println("<HTML>");
                out.println("<HEAD><TITLE>Info Serveur</TITLE></HEAD>");
                out.println("<BODY> " +
                info + "<br>" +
                nomctx + "<br>" +
                real +
                "</BODY></HTML>");
                out.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
