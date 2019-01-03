package si_project.Article;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;
	List<Article> articles = new ArrayList<Article>();
	
	public void addArticle(Article article) {
		articleRepository.save(article);
	}
	
	public void updateArticle(Article article , String ref) {
		articleRepository.save(article);
	}
	
	public void deleteArticle(String ref) {
		articleRepository.deleteById(ref);
		return;
	}
	
	public Optional<Article> getArticle(String ref) {
		return articleRepository.findById(ref);
	}
	
	public List<Article> getAllArticles(){
		List<Article> articles = new ArrayList<Article>();
		articleRepository.findAll().forEach(articles::add);
		return articles;
	}
	
	/*public List<Article> getByCategory(String categ){
		List<Article> nvListe = new ArrayList<>();
		for(Article article : this.articles) {
			if(article.getCategorie().equals(categ)) {
				nvListe.add(article);
			}
		}
		return nvListe;
	}*/
}
