
public class ArticleTest {

	public static void main(String[] args) {
	Article art= new Article("Pack PC", 9500.99, 5);
	
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantit� :" +art.getQuantit�());
	
	art.setQuantit�(3);
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantit� :" +art.getQuantit�());

	art.stockerProduit("Kit");
	art.getProduis();

	}

	

}
