package si_project.Menu;

import java.util.Date;

public class Menu {
	private int id;
	private Date date;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int id, Date date) {
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
