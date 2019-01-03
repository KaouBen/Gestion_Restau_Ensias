package si_project.Commande;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si_project.Article.Article;
import si_project.Article.ArticleRepository;


@Service
public class CommandeService {
	

	@Autowired
	CommandeRepository commandeRepository;
	List<Commande> commandes = new ArrayList<Commande>();
	
	public void addCommande(Commande commande) {
		commandeRepository.save(commande);
	}
	
	public void updateCommande(Commande commande, String id) {
		commandeRepository.save(commande);
	}
	
	public void deleteCommande(String id) {
		commandeRepository.deleteById(id);
	}
	
	public Optional<Commande> getCommande(String id) {
		return commandeRepository.findById(id);
	}
	
	public List<Commande> getAllCommandes(){
		List<Commande> commandes = new ArrayList<Commande>();
		commandeRepository.findAll().forEach(commandes::add);
		return commandes;
	}
	
	
	
}
