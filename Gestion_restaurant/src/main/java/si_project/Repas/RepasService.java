package si_project.Repas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class RepasService {

	List<Repas> repas_s = new ArrayList<Repas>();
	
	public void addRepas(Repas repas) {
		repas_s.add(repas);
	}
	
	public void updateRepas(Repas repas , int id) {
		for(int i=0;i<repas_s.size();i++) {
			Repas t = repas_s.get(i);
			if(t.getId()==id) {
				repas_s.set(i, repas);
			}
		}
	}
	
	public void deleteRepas(int id) {
		repas_s.removeIf(t -> t.getId()==id);
		return;
	}
	
	public Repas getRepas(int id) {
		return repas_s.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public List<Repas> getAllRepas(){
		return this.repas_s;
	}
}
