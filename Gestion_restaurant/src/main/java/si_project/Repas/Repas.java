package si_project.Repas;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Repas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String nom;
	private int effectif_prevu;
	private int effectif_reel;
	@ManyToMany
	List<Menu> menus = new ArrayList<>();
	
	public Repas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repas(String id, String nom, int effectif_prevu, int effectif_reel,List<Menu> menus) {
		super();
		this.id = id;
		this.nom = nom;
		this.effectif_prevu = effectif_prevu;
		this.effectif_reel = effectif_reel;
		this.menus = menus;
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

	public int getEffectif_prevu() {
		return effectif_prevu;
	}

	public void setEffectif_prevu(int effectif_prevu) {
		this.effectif_prevu = effectif_prevu;
	}

	public int getEffectif_reel() {
		return effectif_reel;
	}

	public void setEffectif_reel(int effectif_reel) {
		this.effectif_reel = effectif_reel;
	}

	public List<Menu> getMenus() {
		if(menus == null) menus = new ArrayList<>();
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
}
