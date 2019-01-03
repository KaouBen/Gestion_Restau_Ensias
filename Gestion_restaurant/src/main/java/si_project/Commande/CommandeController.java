package si_project.Commande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping
public class CommandeController {
	@Autowired
	private CommandeService commandeService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/commandes/{id}")
	public void updateCommande(@RequestBody Commande commande , @PathVariable int id) {
		commandeService.updateCommande(commande, id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/commandes")
	public void addCommande(@RequestBody Commande commande) {
		commandeService.addCommande(commande);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/commandes/{id}")
	public void deleteCommande(@PathVariable int id) {
		commandeService.deleteCommande(id);
	}
	
	@RequestMapping("/commandes/{id}")
	public Commande getCommande(@PathVariable int id) {
		return commandeService.getCommande(id);
	}
	
	@RequestMapping("/commandes")
	public List<Commande> getAllCommanndes(){
		return commandeService.getAllCommandes();
	}
	
	@RequestMapping("/commandes/fournisseur={id_fournisseur}")
	public List<Commande> getByFournisseur(@PathVariable int id_fournisseur){
		return commandeService.getByFournisseur(id_fournisseur);
	}
	
}
