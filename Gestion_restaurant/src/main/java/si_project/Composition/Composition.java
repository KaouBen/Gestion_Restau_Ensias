package si_project.Composition;

public class Composition {
	
	private int id_menu;
	private int id_repas;
	
	public Composition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Composition(int id_menu, int id_repas) {
		super();
		this.id_menu = id_menu;
		this.id_repas = id_repas;
	}

	public int getId_menu() {
		return id_menu;
	}

	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}

	public int getId_repas() {
		return id_repas;
	}

	public void setId_repas(int id_repas) {
		this.id_repas = id_repas;
	}
	
}
