package si_project.Article;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping(method=RequestMethod.PUT , value="/articles/{ref}")
	public void updateArticle(@RequestBody Article article , @PathVariable String ref) {
		articleService.updateArticle(article, ref);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/articles")
	public void addArticle(@RequestBody Article article) {
		articleService.addArticle(article);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/articles/{ref}")
	public void deleteArticle(@PathVariable String ref) {
		articleService.deleteArticle(ref);
	}
	
	@RequestMapping("/articles/{ref}")
	public Optional<Article> getArticle(@PathVariable String ref) {
		return articleService.getArticle(ref);
	}
	
	@RequestMapping("/articles")
	public List<Article> getAllArticles(){
		return articleService.getAllArticles();
	}
	
	/*@RequestMapping("/articles/{categ}")
	public List<Article> getByCategory(@PathVariable String categ){
		return articleService.getByCategory(categ);
	}*/
}
