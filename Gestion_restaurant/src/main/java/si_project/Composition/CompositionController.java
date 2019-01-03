package si_project.Composition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
public class CompositionController {
	
	@Autowired
	private CompositionService compositionService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/compositions/{id_menu}&{id_repas}")
	public void updateComposition(@RequestBody Composition c , @PathVariable int id_menu , @PathVariable int id_repas) {
		compositionService.updateComposition(c, id_menu, id_repas);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/compositions")
	public void addComposition(@RequestBody Composition c) {
		compositionService.addComposition(c.getId_menu(), c.getId_repas());
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/compositions/{id_menu}&{id_repas}")
	public void deleteComposition(@PathVariable int id_menu,@PathVariable int id_repas) {
		compositionService.deleteComposition(id_menu, id_repas);
	}
	
	@RequestMapping("/compositions/{id_menu}&{id_repas}")
	public Composition getComposition(@PathVariable int id_menu,@PathVariable int id_repas) {
		return compositionService.getComposition(id_menu, id_repas);
	}
	
	@RequestMapping("/compositions")
	public List<Composition> getAllCompositions(){
		return compositionService.getAllCompositions();
	}
}
