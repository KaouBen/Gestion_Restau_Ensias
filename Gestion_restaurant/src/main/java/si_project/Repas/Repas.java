package si_project.Repas;

public class Repas {
	private int id;
	private String nom;
	private int effectif_prevu;
	private int effectif_reel;
	
	public Repas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repas(int id, String nom, int effectif_prevu, int effectif_reel) {
		super();
		this.id = id;
		this.nom = nom;
		this.effectif_prevu = effectif_prevu;
		this.effectif_reel = effectif_reel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	

}
