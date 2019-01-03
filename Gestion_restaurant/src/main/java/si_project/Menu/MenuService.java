package si_project.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si_project.Article.Article;
import si_project.Article.ArticleRepository;


@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepository;
	List<Menu> menus = new ArrayList<Menu>();
	
	public void addMenu(Menu menu) {
		menuRepository.save(menu);
	}
	
	public void updateMenu(Menu menu , String id) {
		menuRepository.save(menu);
	}
	
	public void deleteMenu(String id) {
		menuRepository.deleteById(id);
		return;
	}
	
	public Optional<Menu> getArticle(String id) {
		return menuRepository.findById(id);
	}
	
	public List<Menu> getAllMenus(){
		List<Menu> menus = new ArrayList<Menu>();
		menuRepository.findAll().forEach(menus::add);
		return menus;
	}
}
