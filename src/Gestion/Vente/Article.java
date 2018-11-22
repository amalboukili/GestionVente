package Gestion.Vente;
public class Article{
	private String titre;
	private double prix;
	private int quantit�;
	private Produit [] produits;
	private Promotion promo;
	
	
	
	//Constructeurs
	public Article(String titre, double prix, int quantit�) {
	
		this.titre=titre;
		this.prix= prix;
		this.quantit�=quantit�;
		this.produits= new Produit[100];
	}
	
	//Constructeurs avec argument promo
	public Article(String titre, double prix, int quantit�, Promotion promo) {
		
		this.titre=titre;
		this.prix= prix;
		this.quantit�=quantit�;
		this.produits= new Produit[100];
		this.promo=promo;
	}
	
	//strocker les produits
	//avant le stockage on cherche dans le tableau Produit l'index d'�lement vide
	public int getIndexProduits() {
		int index = 0;
		for(int i=0; i<this.produits.length; i++){
			
			if(this.produits[i] == null) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void stockerProduit(String titre) {
		int index = this.getIndexProduits();
		this.produits[index] = new Produit(titre);
		}
	
	
	//Obtenir les produits
	public void getProduis() {
		System.out.println("Artcile Courant : " + this.titre);
		for(int i=0; i<this.produits.length; i++){
			if(this.produits[i] != null) {
				System.out.println(this.produits[i].getTitre());
			}
		}
    }
	
	
	//Ajouter des produits
	public void AjouterProduits(String [] titre) {
		int index = this.getIndexProduits();
		for(int i=0; i<titre.length; i++) {
			produits[index] = new Produit(titre[i]);
			index ++;			
		}
		
		
		
	}

	
		
	//Les accesseurs
	public String getTitre() {
		String promoTitre= this.titre;
		if(this.promo == Promotion.ETE) {
			promoTitre = this.titre + "_" + this.promo.ETE.getSuffixe();
		}else if (this.promo == Promotion.PRINTEMPS) {
			promoTitre = this.titre + "_" + this.promo.PRINTEMPS.getSuffixe();
		} else if (this.promo == Promotion.AUTOMNE) {
			promoTitre = this.titre + "_" + this.promo.AUTOMNE.getSuffixe();
		}else if (this.promo == Promotion.HIVER) {
			promoTitre = this.titre + "_" + this.promo.HIVER.getSuffixe();
		}else if (this.promo == Promotion.NOMAL){
			promoTitre = this.titre;
		}
		
		return promoTitre;
	}
		
		
	public void setTitre(String titre) {
		this.titre=titre;
	}
	
	 
	
	public double getPrix() {
		double promoPrix= this.prix;
		if(this.promo == Promotion.ETE) {
			promoPrix = this.prix * this.promo.ETE.getPrice();
		}else if (this.promo == Promotion.PRINTEMPS) {
			promoPrix = this.prix * this.promo.PRINTEMPS.getPrice();
		} else if (this.promo == Promotion.AUTOMNE) {
			promoPrix = this.prix * this.promo.AUTOMNE.getPrice();
		}else if (this.promo == Promotion.HIVER) {
			promoPrix = this.prix * this.promo.HIVER.getPrice();
		}else if (this.promo == Promotion.NOMAL){
			promoPrix = this.prix;
		}
		
		return promoPrix;
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
	
	
	//Class interne produit
	class Produit{
		private String titre;
		
		public Produit(String titre) {
			this.titre=titre;
		}
		
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre=titre;
		}
	}
	
	
	
	
	
}