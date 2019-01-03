package si_project.Fournisseur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si_project.Article.Article;
import si_project.Article.ArticleRepository;

@Service
public class FournisseurService {
	
	@Autowired
	FournisseurRepository fournisseurRepository;
	List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
	
	public void addFournisseur(Fournisseur fournisseur) {
		fournisseurRepository.save(fournisseur);
	}
	
	public void updateFournisseur(Fournisseur fournisseur, String id) {
		fournisseurRepository.save(fournisseur);
	}
	
	public void deleteFournisseur(String id) {
		fournisseurRepository.deleteById(id);
		return;
	}
	
	public Optional<Fournisseur> getFournisseur(String id) {
		return fournisseurRepository.findById(id);
	}
	
	public List<Fournisseur> getAllFournisseurs(){
		List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
		fournisseurRepository.findAll().forEach(fournisseurs::add);
		return fournisseurs;
	}
}
