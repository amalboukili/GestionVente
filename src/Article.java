public class Article{
	private String titre;
	private double prix;
	private int quantit�;
	
	
	//Constructeurs
	public Article(String titre, double prix, int quantit�) {
	
		this.titre=titre;
		this.prix= prix;
		this.quantit�=quantit�;
		
	}
	

	//Les accesseurs
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre=titre;
	}
	
	
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix=prix;
	}
	
	
	public int getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(int quantit�) {
		this.quantit�=quantit�;
	}
	
	
	
	
	
	
	
}