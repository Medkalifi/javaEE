package ma.moha.tp.metier;

import java.util.List;

import ma.moha.tp.entities.Categorie;
import ma.moha.tp.entities.Client;
import ma.moha.tp.entities.Commande;
import ma.moha.tp.entities.Panier;
import ma.moha.tp.entities.Produit;

public interface InternauteMetier {

	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listProduits();
	public List<Produit> listProduitsParMotCle(String mc);
	public List<Produit> listProduitsPaCategorie(Long idCat);
	public List<Produit> listProduitsSelectionnes();
	public Produit getProduit( Long idP);
	public Commande enregisterCommande(Panier p, Client c);
	
}
