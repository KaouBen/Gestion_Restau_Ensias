package si_project.Contenu;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class ContenuService {

	List<Contenu> contenus = new ArrayList<Contenu>();
	
	public void addContenu(Contenu contenu) {
		contenus.add(contenu);
	}
	
	public void updateContenu(Contenu contenu , String refart, int idrepas) {
		for(int i=0;i<contenus.size();i++) {
			Contenu t = contenus.get(i);
			if(t.getArticle().getRef().equals(refart) && t.getRepas().getId()==idrepas) {
				contenus.set(i, contenu);
			}
		}
	}
	
	public void deleteContenu(String ref,int idrepas) {
		
		for(Contenu t : contenus) {
			if((t.getRepas().getId()==idrepas) && (t.getArticle().getRef().equals(ref))){
				contenus.remove(t);
			}
		}
	}
	
	public Contenu getContenu(String ref, int id) {
		
		for(Contenu t : contenus) {
			if((t.getRepas().getId()==id) && (t.getArticle().getRef().equals(ref))){
				return t;
			}
		}
		return null;
	}
	
	public List<Contenu> getAllContenus(){
		return this.contenus;
	}
	
}
