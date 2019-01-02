package si_project.Article;

public class Article {
	private String ref;
	private String desg;
	private double prixHt;
	
	private String uniteMesure;
	private double tva;
	private String img;
	private int qteStock;
	private double maxApprov;
	private String categorie;
	
	public Article() {
		super();
	}
	
	
	public Article(String ref, String desg, double prixHt, String uniteMesure, double tva, String img, int qteStock,
			double maxApprov, String categorie) {
		super();
		this.ref = ref;
		this.desg = desg;
		this.prixHt = prixHt;
		this.uniteMesure = uniteMesure;
		this.tva = tva;
		this.img = img;
		this.qteStock = qteStock;
		this.maxApprov = maxApprov;
		this.categorie = categorie;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getPrixHt() {
		return prixHt;
	}
	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
	}
	public String getUniteMesure() {
		return uniteMesure;
	}
	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public double getMaxApprov() {
		return maxApprov;
	}
	public void setMaxApprov(double maxApprov) {
		this.maxApprov = maxApprov;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}
