package si_project.Commande;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import si_project.Fournisseur.Fournisseur;


@RequestMapping
public class CommandeController {
	
	@Autowired
	private CommandeService commandeService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/commandes/{id}")
	public void updateCommande(@RequestBody Commande commande , @PathVariable String id) {
		commandeService.updateCommande(commande, id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/commandes")
	public void addCommande(@RequestBody Commande commande) {
		commandeService.addCommande(commande);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/commandes/{commandeId}/fournisseur/{fournisseurId}")
	public void addCommande1(@RequestBody Commande commande,String id) {
		commande.setFournisseur(new Fournisseur(id,"nom"));
		commandeService.addCommande(commande);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/commandes/{id}")
	public void deleteCommande(@PathVariable String id) {
		commandeService.deleteCommande(id);
	}
	
	@RequestMapping("/commandes/{id}")
	public Optional<Commande> getCommande(@PathVariable String id) {
		return commandeService.getCommande(id);
	}
	
	@RequestMapping("/commandes")
	public List<Commande> getAllCommanndes(){
		return commandeService.getAllCommandes();
	}
	

}
