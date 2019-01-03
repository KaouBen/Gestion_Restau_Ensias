package si_project.Composition;

import java.util.ArrayList;
import java.util.List;


public class CompositionService {
	
	List<Composition> composition = new ArrayList<Composition>();
	
	public void addComposition(int id_menu,int id_repas) {
		composition.add(new Composition(id_menu, id_repas));
	}
	
	public void updateComposition(Composition c ,int id_menu , int id_repas) {
		for(int i=0;i<composition.size();i++) {
			Composition t = composition.get(i);
			if(t.getId_menu()==id_menu && t.getId_repas()==id_repas) {
				composition.set(i, c);
			}
		}
	}
	
	public void deleteComposition(int id_menu , int id_repas) {
		for(Composition c:composition) {
			if(c.getId_menu()==id_menu && c.getId_repas()==id_repas)
				composition.remove(c);
		}
	}
	
	public Composition getComposition(int id_menu , int id_repas) {
		for(Composition c:composition) {
			if(c.getId_menu()==id_menu && c.getId_repas()==id_repas)
				return c;
		}
		return null;
	}
	
	public List<Composition> getAllCompositions(){
		return this.composition;
	}
}
