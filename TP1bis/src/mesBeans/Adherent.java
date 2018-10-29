package mesBeans;

import java.io.Serializable;

public class Adherent  implements Serializable{
	private String nom; 
	private String prenom;
	private String ville;
	private String email;
	public Adherent(String nom, String prenom, String ville, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.email = email;
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
