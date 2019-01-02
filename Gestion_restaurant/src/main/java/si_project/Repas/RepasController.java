package si_project.Repas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
public class RepasController {
	@Autowired
	private RepasService repasService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/repas/{id}")
	public void updateRepas(@RequestBody Repas repas , @PathVariable int id) {
		repasService.updateRepas(repas, id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/repas")
	public void addRepas(@RequestBody Repas repas) {
		repasService.addRepas(repas);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/repas/{id}")
	public void deleteRepas(@PathVariable int id) {
		repasService.deleteRepas(id);
	}
	
	@RequestMapping("/repas/{id}")
	public Repas getRepas(@PathVariable int id) {
		return repasService.getRepas(id);
	}
	
	@RequestMapping("/repas")
	public List<Repas> getAllRepas(){
		return repasService.getAllRepas();
	}
}
