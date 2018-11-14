
public class ArticleTest {

	public static void main(String[] args) {
	Article art= new Article("Pack PC", 9500.99, 5);
	
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantité :" +art.getQuantité());
	
	art.setQuantité(3);
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantité :" +art.getQuantité());

	art.stockerProduit("Kit");
	art.getProduis();

	}

	

}
