package si_project.LigneCommande;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
public class LigneCommandeController {
	@Autowired
	private LigneCommandeService lignecommandeService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/lignescommande/{id1}&{id2}")
	public void updateCommande(@RequestBody LigneCommande lignecommande ,@PathVariable String idart,@PathVariable int idcom) {
		lignecommandeService.updateLigneCommande(lignecommande, idart, idcom);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/lignescommande")
	public void addLigneCommande(@RequestBody LigneCommande lignecommande) {
		lignecommandeService.addLigneCommande(lignecommande);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/lignescommande/{id1}&{id2}")
	public void deleteLigneCommande(@PathVariable int id,@PathVariable String ref) {
		lignecommandeService.deleteLigneCommande(id, ref);
	}
	
	@RequestMapping("/lignescommande/{id1}&{id2}")
	public LigneCommande getLigneCommande(@PathVariable String ref,@PathVariable int id) {
		return lignecommandeService.getLigneCommande(ref, id);
	}
	
	@RequestMapping("/lignescommande")
	public List<LigneCommande> getAllCommandes(){
		return lignecommandeService.getAllLigneCommandes();
	}
	
}
