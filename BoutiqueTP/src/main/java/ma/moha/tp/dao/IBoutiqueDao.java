package ma.moha.tp.dao;

import java.util.List;

import ma.moha.tp.entities.*;

public interface IBoutiqueDao {
	
public Long ajouterCategorie(Categorie c);
public List<Categorie> listCategories();
public Categorie getCategorie(Long idCat);
public void supprimerCategorie(Long idCat);
public void modiferCategorie(Categorie c);

public Long ajouterProduit(Produit p, Long idCat);
public List<Produit> listProduits();
public List<Produit> listProduitsParMotCle(String mc);
public List<Produit> listProduitsPaCategorie(Long idCat);
public List<Produit> listProduitsSelectionnes();
public Produit getProduit( Long idP);
public void supprimerProduit( Long idP);
public void modifierProduit(Produit p);

public void ajouterUser(User u);
public void attribuerRole(Role r, Long userID);
public Commande enregisterCommande(Panier p, Client c);


}
