package mesBeans;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class BonjourTag  extends TagSupport{
	private String nom="";
	private String prenom;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int doStratTag() throws JspException{
		pageContext.setAttribute("prenom", prenom);
		pageContext.setAttribute("classeTage", this.getClass().getName());
		return EVAL_BODY_INCLUDE;
	}
	
	/*public int doEndTag() throws JspException{
		String dt = DateFormat.getInstance().format(new Date());
		try {
			pageContext.getOut().write("Bonjour <br>");
			pageContext.getOut().write("Nous sommes le " +dt+ "<br>");
		} catch (IOException e) {
			throw new JspException("Erreur balise");
			
		}
		return EVAL_PAGE;
	}*/

}
