package si_project.Commande;

import java.util.Date;

public class Commande {
	private int id;
	private Date date;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
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
	
	
}
