package si_project.Fournisseur;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import si_project.Commande.Commande;

@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String nom;
	@ManyToOne
	List<Commande> commandes = new ArrayList<>();
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
