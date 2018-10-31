package ma.moha.tp.metier;

import ma.moha.tp.entities.Categorie;
import ma.moha.tp.entities.Role;
import ma.moha.tp.entities.User;

public interface IAdminCategorieMetier extends IAdminProduitsMetier {
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategorie(Long idCat);
	public void modiferCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r, Long userID);
}
