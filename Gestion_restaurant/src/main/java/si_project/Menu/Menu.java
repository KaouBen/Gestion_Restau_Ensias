package si_project.Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import si_project.Repas.Repas;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private Date date;
	@ManyToMany
	List<Repas> repas = new ArrayList<>();
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String id, Date date, List<Repas> repas) {
		super();
		this.id = id;
		this.date = date;
		this.repas = repas;
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

	public List<Repas> getRepas() {
		if(repas == null) repas = new ArrayList<>();
		return repas;
	}

	public void setRepas(List<Repas> repas) {
		this.repas = repas;
	}
	
	
}
