package mesBeans;

import java.util.ArrayList;
public class Client {
	private String user;
	private String mdp;
	private ArrayList<Livre> livres;
	
		
	public Client() {
		user="inconnu";
		mdp="walo";
		livres= new ArrayList<Livre>();
			}

	public Client(String user, String mdp) {
		this();                                     //attention constructeur courant   Fait appel au contructeur par defaut
		//super() fait appel au constructeur par defaut de la classe mere et ici la classe mere et la class objet
		this.user = user;
		this.mdp = mdp;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public ArrayList<Livre> getLivres() {
		return livres;
	}

	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}
	
	public void ajoutLivre(Livre livre) {
			getLivres().add(livre);
	}
	
 public void ajoutLivre(String titre, String categorie) {
		Livre livre = new Livre(titre, categorie);
		getLivres().add(livre);
 }
	
 public String toString() {
	 return "client [nom="+ getUser()+", Livres="+getLivres()+"] \n";
 }
	
	
}
