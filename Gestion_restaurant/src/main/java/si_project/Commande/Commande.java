package si_project.Commande;

import java.util.Date;

public class Commande {
	private int id;
	private Date date;
	private int id_fournisseur;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Commande(int id, Date date, int id_fournisseur) {
		super();
		this.id = id;
		this.date = date;
		this.id_fournisseur = id_fournisseur;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getId_fournisseur() {
		return id_fournisseur;
	}

	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	
}
