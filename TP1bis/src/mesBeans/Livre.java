package mesBeans;

import java.io.Serializable;


public class Livre  implements Serializable{
	private String titre;
	private String categorie;
	
	public Livre() {
		titre= "non";
		categorie= "nonren";
	}
	
	public String getTitre() {
		return titre;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setTitre( String newTitre) {
		titre = newTitre;
	}
	
	public void setCategorie (String newCategorie) {
		categorie = newCategorie;
	}
	
	public Livre(String titre, String categorie) {
		titre = titre;
		categorie = categorie;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
	if (obj instanceof Livre )
	
	 {
		Livre autreLivre =(Livre)obj;
	if (this.getTitre().equals(autreLivre.getCategorie()))
			return true;
	}
	return false;
}

	@Override
	public String toString() {
		return "Livre [ titre= " +getTitre()+", catégorie =" +getCategorie()+"]";
	}

}
