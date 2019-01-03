package si_project.Menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping
public class MenuController {
	
	@Autowired
	private MenuController menuService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/menus/{id}")
	public void updateMenu(@RequestBody Menu menu , @PathVariable String id) {
		menuService.updateMenu(menu, id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/menus")
	public void addMenu(@RequestBody Menu menu) {
		menuService.addMenu(menu);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/menus/{id}")
	public void deleteMenu(@PathVariable String id) {
		menuService.deleteMenu(id);
	}
	
	@RequestMapping("/menus/{id}")
	public Menu getMenu(@PathVariable String id) {
		return menuService.getMenu(id);
	}
	
	@RequestMapping("/menus")
	public List<Menu> getAllMenus(){
		return menuService.getAllMenus();
	}
	
}
