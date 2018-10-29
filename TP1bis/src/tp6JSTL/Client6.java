package tp6JSTL;

public class Client6 {

	private String civilite;
	private String nom;
	private String prenom;
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
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
	public Client6(String civilite, String nom) {
		super();
		this.civilite = civilite;
		this.nom = nom;
	}
	
	public String toString() { return civilite + " " + nom; 
								}
	
	
}
