package web;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.IproduitDao;
import dao.ProduitDaoImpl;
import metier.entities.Produit;


@WebServlet("/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IproduitDao metier;
 
    public ControleurServlet() {  super();
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	metier = new ProduitDaoImpl(); //sans spring 
    	// avec Spring 
    	/*ApplicationContext  springContext =
   WebApplicationContextUtils.getRequiredWebApplicationContext
   (this.getServletContext());
    	metier=springContext.getBean(IproduitDao.class);*/
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/index.do")){
			request.getRequestDispatcher("produits.jsp").forward(request, response);
		}
		
		else if (path.equals("/chercher.do")) {
			
			String motCle = request.getParameter("motCle");
			ProduitModel model = new ProduitModel();
			model.setMotCle(motCle);
			List<Produit> produits = metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);
			request.setAttribute("model", model);
			request.getRequestDispatcher("produits.jsp").forward(request, response);

		}else if (path.equals("/saisie.do")) {
			request.getRequestDispatcher("saisie.jsp").forward(request, response);
			
		} else if( path.equals("/saveProduit.do") && (request.getMethod().equals("POST"))) {
			String des = request.getParameter("designation");
			double prix = Double.parseDouble(request.getParameter("prix"));
			int quantite = Integer.parseInt(request.getParameter("quantite"));
			Produit p = metier.save(new Produit(des, prix, quantite));
	    		
			request.setAttribute("produit", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
		
			
		}else if (path.equals("/supprimer.do")) {
			Long id = Long.parseLong(request.getParameter("id"));
			metier.deleteProduit(id);
			//request.getRequestDispatcher("produits.jsp").forward(request, response);
			response.sendRedirect("chercher.do?motCle=");
			
		} else if (path.equals("/editer.do")) {
			Long id=Long.parseLong(request.getParameter("id"));
			Produit p = metier.getProdui(id);
			request.setAttribute("produit", p);
			request.getRequestDispatcher("EditProduit.jsp").forward(request, response);
		
		} else if( path.equals("/update.do") && (request.getMethod().equals("POST"))) {
			Long id = Long.parseLong(request.getParameter("id"));
			String des = request.getParameter("designation");
			double prix = Double.parseDouble(request.getParameter("prix"));
			int quantite = Integer.parseInt(request.getParameter("quantite"));
			Produit p = new Produit(des, prix, quantite);
			p.setId(id);
	    	metier.update(p);
			request.setAttribute("produit", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
		}
		}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	}
	

