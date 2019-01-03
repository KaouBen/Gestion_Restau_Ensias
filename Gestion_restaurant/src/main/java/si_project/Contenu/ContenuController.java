package si_project.Contenu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
public class ContenuController {
	@Autowired
	private ContenuService contenuService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/contenus/{id1}&{id2}")
	public void updateContenu(@RequestBody Contenu contenu ,@PathVariable String refart,@PathVariable int idrepas) {
		contenuService.updateContenu(contenu, refart, idrepas);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/contenus")
	public void addContenu(@RequestBody Contenu contenu) {
		contenuService.addContenu(contenu);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contenus/{id1}&{id2}")
	public void deleteContenu(@PathVariable int idrepas,@PathVariable String ref) {
		contenuService.deleteContenu(ref, idrepas);
	}
	
	@RequestMapping("/contenus/{id1}&{id2}")
	public Contenu getContenu(@PathVariable String ref,@PathVariable int id) {
		return contenuService.getContenu(ref, id);
	}
	
	@RequestMapping("/contenus")
	public List<Contenu> getAllContenus(){
		return contenuService.getAllContenus();
	}
	
}
