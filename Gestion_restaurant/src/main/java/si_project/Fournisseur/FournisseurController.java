package si_project.Fournisseur;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
public class FournisseurController {
	@Autowired
	private FournisseurService fournisseurService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/fournisseurs/{id}")
	public void updateFournisseur(@RequestBody Fournisseur fournisseur , @PathVariable String id) {
		fournisseurService.updateFournisseur(fournisseur, id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/fournisseurs")
	public void addFournisseur(@RequestBody Fournisseur fournisseur) {
		fournisseurService.addFournisseur(fournisseur);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/fournisseurs/{id}")
	public void deleteFournisseur(@PathVariable String id) {
		fournisseurService.deleteFournisseur(id);
	}
	
	@RequestMapping("/fournisseurs/{id}")
	public Optional<Fournisseur> getFournisseur(@PathVariable String id) {
		return fournisseurService.getFournisseur(id);
	}
	
	@RequestMapping("/fournisseurs")
	public List<Fournisseur> getAllFournisseur(){
		return fournisseurService.getAllFournisseurs();
	}
	
}
