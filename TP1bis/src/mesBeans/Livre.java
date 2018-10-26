package mesBeans;

public class Livre {
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
	
	public void setTitre( String titre) {
		this.categorie = titre;
	}
	
	public void setCategorie (String categorie) {
		this.categorie = categorie;
	}
	
	public Livre(String titre, String categorie) {
		super();
		this.titre = titre;
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Livre [ titre= " +getTitre()+", catégorie =" +getCategorie()+"]";
	}

}
