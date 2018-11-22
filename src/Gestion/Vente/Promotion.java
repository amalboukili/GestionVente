package Gestion.Vente;

public enum Promotion {
	ETE(0.9,"ETE"),
	PRINTEMPS(0.7," PRINTEMPS "),
	AUTOMNE(0.95, " AUTOMNE "),
	HIVER(0.8, " HIVER "),
	NOMAL(1.0, "");
	
	private String suffixe;
	private double price;
	
	
	Promotion(double price, String suffixe) {
		this.price=price;
		this.suffixe=suffixe;	
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getSuffixe() {
		return suffixe;
	}
	public void setPrice(String suffixe) {
		this.suffixe=suffixe;	
	}
	


}
