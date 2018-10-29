package dao;

import java.util.List;

import metier.entities.Produit;

public interface IproduitDao {
	public Produit save(Produit p);
	public List<Produit> produitsParMC (String mc);
	public Produit getProdui(Long id);
	public Produit update( Produit p);
	public void deleteProduit(Long id);

}
