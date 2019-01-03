package si_project.Contenu;

import si_project.Article.Article;
import si_project.Repas.Repas;

public class Contenu {
	
	Repas repas;
	Article article;
	int qteSortante;
	
	public Contenu() {
		super();
		
	}
	
	public Contenu(Repas repas, Article article, int qteSortante) {
		super();
		this.repas = repas;
		this.article = article;
		this.qteSortante = qteSortante;
	}
	public Repas getRepas() {
		return repas;
	}
	public void setRepas(Repas repas) {
		this.repas = repas;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public int getQteSortante() {
		return qteSortante;
	}
	public void setQteSortante(int qteSortante) {
		this.qteSortante = qteSortante;
	}
	
	
}
