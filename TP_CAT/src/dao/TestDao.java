package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {
public static void main(String[] args) {
	ProduitDaoImpl dao = new ProduitDaoImpl();
	Produit p1= dao.save(new Produit("machin", 1245.01, 40));
	Produit p2= dao.save(new Produit( "truc", 4701.10, 50));
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());

	
	List<Produit> prods = dao.produitsParMC("%tr%");
	
	for (Produit p : prods) {
		System.out.println(p.toString());
	}
}

}
