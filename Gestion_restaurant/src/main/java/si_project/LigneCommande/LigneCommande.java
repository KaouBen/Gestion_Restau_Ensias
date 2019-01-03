package si_project.LigneCommande;

import si_project.Article.Article;
import si_project.Commande.Commande;

public class LigneCommande {
	
	Article article;
	Commande commande;
	int qteEntrante;
	
	
	public LigneCommande() {
		super();
		
	}
	public LigneCommande(Article article, Commande commande, int qteEntrante) {
		super();
		this.article = article;
		this.commande = commande;
		this.qteEntrante = qteEntrante;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public int getQteEntrante() {
		return qteEntrante;
	}
	public void setQteEntrante(int qteEntrante) {
		this.qteEntrante = qteEntrante;
	}
	
	
}
