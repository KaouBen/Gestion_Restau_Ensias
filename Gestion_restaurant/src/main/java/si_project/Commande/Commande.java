package si_project.Commande;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import si_project.Article.Article;
import si_project.Fournisseur.Fournisseur;

@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private Date date;
	@ManyToMany
	List<Article> articles = new ArrayList<>();
	@OneToMany
	Fournisseur fournisseur;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Commande(String id, Date date, Fournisseur fournisseur, List<Article> articles) {
		super();
		this.id = id;
		this.date = date;
		this.articles = articles;
		this.fournisseur = fournisseur;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public List<Article> getArticles() {
		if(articles == null) articles = new ArrayList<>();
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Fournisseur getFournisseur() {
		if(fournisseur == null) fournisseur = new Fournisseur();
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
}
