package ma.moha.tp.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.moha.tp.entities.*;


public class BoutiqueDaoImpl  implements IBoutiqueDao{
 @PersistenceContext
	private EntityManager em;
 
	@Override
	public Long ajouterCategorie(Categorie c) {
		em.persist(c);
		return c.getIdcategorie();
	}

	@Override
	public List<Categorie> listCategories() {
		Query req=em.createQuery("select c from Categorie c ");
		return req.getResultList();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return em.find(Categorie.class, idCat);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		Categorie c = em.find(Categorie.class, idCat);
		em.remove(c);
		
	}

	@Override
	public void modiferCategorie(Categorie c) {
		em.merge(Categorie.class);
		em.merge(c);
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		Categorie c =getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		return p.getIdProduit();
	}

	@Override
	public List<Produit> listProduits() {
		Query req=em.createQuery("select p from Produit p ");
		return req.getResultList();
	}

	@Override
	public List<Produit> listProduitsParMotCle(String mc) {
		Query req=em.createQuery("select p from Produit p where p.designation like:x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public List<Produit> listProduitsPaCategorie(Long idCat) {
		Query req=em.createQuery("select p from Produit p where p.categorie.idcategorie=:x");
		req.setParameter("x", idCat);
		return req.getResultList();
	}

	@Override
	public List<Produit> listProduitsSelectionnes() {
		Query req=em.createQuery("select p from Produit p where p.selected=true");
		return req.getResultList();
	}

	@Override
	public Produit getProduit(Long idP) {
		return em.find(Produit.class, idP);
	}

	@Override
	public void supprimerProduit(Long idP) {
		Produit p = getProduit(idP);
		em.remove(p);
	}

	@Override
	public void modifierProduit(Produit p) {
			em.merge(p);
	}

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		User  u = em.find(User.class, userID);
		u.getRoles().add(r);
		em.persist(r);
	}

	@Override
	public Commande enregisterCommande(Panier p, Client c) {
		em.persist(c);
		Commande cmd = new Commande();
		cmd.setDateCommande(new Date());
		cmd.setItems(p.getItems());
		for (LigneCommande lc : p.getItems() ) {
			em.persist(lc);
		}
		em.persist(cmd);
		return cmd;
	}

}