package si_project.Menu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MenuService {

	List<Menu> menus = new ArrayList<Menu>();
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public void updateMenu(Menu menu , int id) {
		for(int i=0;i<menus.size();i++) {
			Menu t = menus.get(i);
			if(t.getId()==id) {
				menus.set(i, menu);
			}
		}
	}
	
	public void deleteMenu(int id) {
		menus.removeIf(t -> t.getId()==id);
		return;
	}
	
	public Menu getMenu(int id) {
		return menus.stream().filter(t->t.getId()==id).findFirst().get();
	}
	
	public List<Menu> getAllMenus(){
		return this.menus;
	}
}
