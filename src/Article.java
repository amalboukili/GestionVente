public class Article{
	private String titre;
	private double prix;
	private int quantité;
	
	
	//Constructeurs
	public Article(String titre, double prix, int quantité) {
	
		this.titre=titre;
		this.prix= prix;
		this.quantité=quantité;
		
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
	
	
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité=quantité;
	}
	
	
	
	
	
	
	
}