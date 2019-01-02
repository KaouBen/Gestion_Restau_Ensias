package si_project.Fournisseur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FournisseurService {

	List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
	
	public void addFournisseur(Fournisseur fournisseur) {
		fournisseurs.add(fournisseur);
	}
	
	public void updateFournisseur(Fournisseur fournisseur , int id) {
		for(int i=0;i<fournisseurs.size();i++) {
			Fournisseur t = fournisseurs.get(i);
			if(t.getId()==id) {
				fournisseurs.set(i, t);
			}
		}
	}
	
	public void deleteFournisseur(int id) {
		fournisseurs.removeIf(t -> t.getId()==id);
		return;
	}
	
	public Fournisseur getFournisseur(int id) {
		return fournisseurs.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public List<Fournisseur> getAllFournisseurs(){
		return this.fournisseurs;
	}
}
