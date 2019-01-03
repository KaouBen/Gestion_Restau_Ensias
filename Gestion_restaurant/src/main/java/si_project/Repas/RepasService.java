package si_project.Repas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si_project.Article.Article;
import si_project.Article.ArticleRepository;


@Service
public class RepasService {

	@Autowired
	RepasRepository repasRepository;
	List<Repas> repas_s = new ArrayList<Repas>();
	
	public void addRepas(Repas repas) {
		repasRepository.save(repas);
	}
	
	public void updateRepas(Repas repas , String id) {
		repasRepository.save(repas);
	}
	
	public void deleteRepas(String id) {
		repasRepository.deleteById(id);
		return;
	}
	
	public Optional<Repas> getRepas(String id) {
		return repasRepository.findById(id);
	}
	
	public List<Repas> getAllRepas(){
		List<Repas> repas_s = new ArrayList<Repas>();
		repasRepository.findAll().forEach(repas_s::add);
		return repas_s;
	}
}
