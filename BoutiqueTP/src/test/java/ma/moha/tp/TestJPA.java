package ma.moha.tp;

import static org.junit.Assert.*;

import java.util.List;

import javax.naming.Context;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.moha.tp.entities.Categorie;
import ma.moha.tp.entities.Produit;
import ma.moha.tp.metier.IAdminCategorieMetier;

public class TestJPA {

	@Test
	public void tes1t() {
		try {
			ClassPathXmlApplicationContext app = 
					new ClassPathXmlApplicationContext( new String [] {"applicationContext.xml"});
		IAdminCategorieMetier metier = (IAdminCategorieMetier) app.getBean("metier");
			List<Categorie>	 cts1= metier.listCategories();
			metier.ajouterCategorie(new Categorie("PCsaaaaaa", "ordinateursddddddd", null, "jpeg11a"));
			metier.ajouterCategorie(new Categorie("Imprimantes", "Impddddddddddddd", null, "photo147"));
			List<Categorie> cts2 = metier.listCategories();
			assertTrue(cts1.size()+2==cts2.size());
		
					}catch (Exception e) {
						assertTrue(e.getMessage(), false);
					}
	}
	
	@Test
	public void tes2t() {
		try {
			ClassPathXmlApplicationContext app = 
					new ClassPathXmlApplicationContext( new String [] {"applicationContext.xml"});
		IAdminCategorieMetier metier = (IAdminCategorieMetier) app.getBean("metier");
			List<Produit> prods = metier.listProduits();
			metier.ajouterProduit(new Produit("produit1sses", "description complte", 2014.21, true, "photo45.jpeg", 200), 1L);
			metier.ajouterProduit(new Produit("produit21sses", "description2complte", 25478.21, true, "photo5.jpeg", 541), 1L);
			List<Produit> prods2 = metier.listProduits();
			assertTrue(prods.size()+2 == prods2.size());
					}catch (Exception e) {
						assertTrue(e.getMessage(), false);
					}
	}

}
