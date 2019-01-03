package si_project.LigneCommande;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class LigneCommandeService {
	
	List<LigneCommande> lignescommande = new ArrayList<LigneCommande>();
	
	public void addLigneCommande(LigneCommande lignecommande) {
		lignescommande.add(lignecommande);
	}
	
	public void updateLigneCommande(LigneCommande lignecommande , String idart, int idcom) {
		for(int i=0;i<lignescommande.size();i++) {
			LigneCommande t = lignescommande.get(i);
			if(t.getArticle().getRef().equals(idart) && t.getCommande().getId()==idcom) {
				lignescommande.set(i, lignecommande);
			}
		}
	}
	
	public void deleteLigneCommande(int id,String ref) {
		
		for(LigneCommande t : lignescommande) {
			if((t.getCommande().getId()==id) && (t.getArticle().getRef().equals(ref))){
				lignescommande.remove(t);
			}
		}
	}
	
	public LigneCommande getLigneCommande(String ref, int id) {
		
		for(LigneCommande t : lignescommande) {
			if((t.getCommande().getId()==id) && (t.getArticle().getRef().equals(ref))){
				return t;
			}
		}
		return null;
	}
	
	public List<LigneCommande> getAllLigneCommandes(){
		return this.lignescommande;
	}
	
}
