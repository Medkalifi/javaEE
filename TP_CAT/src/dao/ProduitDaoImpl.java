package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitDaoImpl  implements IproduitDao{

	@Override
	public Produit save(Produit p) {
		Connection connection = SingletonConnection.getConnection();
	try {
		PreparedStatement ps = connection.prepareStatement
				("INSERT INTO PRODUIT ( DESIGNATION, PRIX, QUANTITE) VALUES(?,?,?)");
		ps.setString(1, p.getDesignation());
		ps.setDouble(2, p.getPrix());
		ps.setInt(3, p.getQuantite());
		ps.executeUpdate();
		
		/*PreparedStatement ps2 = connection.prepareStatement
				("select max_id as max_id  from produit" );
		ResultSet rs = ps2.executeQuery();
		if (rs.next()) {
			p.setId(rs.getLong("max_id"));
		}*/
		ps.close();

	}catch (Exception e) {
		e.printStackTrace();
	}
	return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		List<Produit> produits = new ArrayList<Produit>();
	
		Connection connection =SingletonConnection.getConnection();
		try {
		PreparedStatement ps;
		
			ps = connection.prepareStatement
					("select * from produit where designation like ?");
		
		
		ps.setString(1, mc);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produit p = new Produit();
			p.setId(rs.getLong("id"));
			p.setDesignation(rs.getString("designation"));
			p.setPrix(rs.getDouble("prix"));
			p.setQuantite(rs.getInt("quantite"));
			produits.add(p);
			
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		
	}
		return produits;
	}

	@Override
	public Produit getProdui(Long id) {
		Produit p = null;
		
		Connection connection =SingletonConnection.getConnection();
		try {
		PreparedStatement ps;
		ps = connection.prepareStatement
		("select * from produit where id=?");
			
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			p=new Produit();
			p.setId(rs.getLong("id"));
			p.setDesignation(rs.getString("designation"));
			p.setPrix(rs.getDouble("prix"));
			p.setQuantite(rs.getInt("quantite"));
		
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		
	}
		return p;
	}

	@Override
	public Produit update(Produit p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement
("UPDATE PRODUIT SET DESIGNATION=?, PRIX=?, QUANTITE=?  WHERE ID=?");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.setLong(4, p.getId());
			ps.executeUpdate();
		    ps.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		return p;
		
	}

	@Override
	public void deleteProduit(Long id) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement
					("DELETE FROM PRODUIT WHERE ID=?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public void init() {
	System.out.println("Initialisation ......");
}
}
