package si_project.Commande;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import si_project.Article.Article;


@Service
public class CommandeService {
	
	List<Commande> commandes = new ArrayList<Commande>();
	
	public void addCommande(Commande commande) {
		commandes.add(commande);
	}
	
	public void updateCommande(Commande commande , int id) {
		for(int i=0;i<commandes.size();i++) {
			Commande t = commandes.get(i);
			if(t.getId()==id) {
				commandes.set(i, commande);
			}
		}
	}
	
	public void deleteCommande(int id) {
		commandes.removeIf(t -> t.getId()==id);
		return;
	}
	
	public Commande getCommande(int id) {
		return commandes.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public List<Commande> getAllCommandes(){
		return this.commandes;
	}
	
	public List<Commande> getByFournisseur(int id_fournisseur){
		List<Commande> nvListe = new ArrayList<>();
		for(Commande c : this.commandes) {
			if(c.getId_fournisseur()==id_fournisseur) {
				nvListe.add(c);
			}
		}
		return nvListe;
	}
	
}
