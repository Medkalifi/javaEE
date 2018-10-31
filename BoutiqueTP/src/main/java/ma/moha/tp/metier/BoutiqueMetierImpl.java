package ma.moha.tp.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ma.moha.tp.dao.IBoutiqueDao;
import ma.moha.tp.entities.*;

@Transactional
public class BoutiqueMetierImpl implements IAdminCategorieMetier {

	private IBoutiqueDao dao;
	
	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduit(Long idP) {
		dao.supprimerProduit(idP);
		
	}

	@Override
	public void modifierProduit(Produit p) {
		dao.modifierProduit(p);
		
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.getCategorie(idCat);
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return dao.listProduits();
	}

	@Override
	public List<Produit> listProduitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return dao.listProduitsParMotCle(mc);
	}

	@Override
	public List<Produit> listProduitsPaCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.listProduitsPaCategorie(idCat);
	}

	@Override
	public List<Produit> listProduitsSelectionnes() {
		// TODO Auto-generated method stub
		return dao.listProduitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return dao.getProduit(idP);
	}

	@Override
	public Commande enregisterCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return dao.enregisterCommande(p, c);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		dao.supprimerCategorie(idCat);
		
	}

	@Override
	public void modiferCategorie(Categorie c) {
		dao.modiferCategorie(c);
		
	}

	@Override
	public void ajouterUser(User u) {
		dao.ajouterUser(u);
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		dao.attribuerRole(r, userID);
		
	}


}