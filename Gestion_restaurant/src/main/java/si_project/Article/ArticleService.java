package si_project.Article;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ArticleService {
	
	List<Article> articles = new ArrayList<Article>();
	
	public void addArticle(Article article) {
		articles.add(article);
	}
	
	public void updateArticle(Article article , String ref) {
		for(int i=0;i<articles.size();i++) {
			Article t = articles.get(i);
			if(t.getRef().equals(ref)) {
				articles.set(i, t);
			}
		}
	}
	
	public void deleteArticle(String ref) {
		articles.removeIf(t -> t.getRef().equals(ref));
		return;
	}
	
	public Article getArticle(String ref) {
		return articles.stream().filter(t->t.getRef().equals(ref)).findFirst().get();
	}
	
	public List<Article> getAllArticles(){
		return this.articles;
	}
	
	public List<Article> getByCategory(String categ){
		List<Article> nvListe = new ArrayList<>();
		for(Article article : this.articles) {
			if(article.getCategorie().equals(categ)) {
				nvListe.add(article);
			}
		}
		return nvListe;
	}
}
