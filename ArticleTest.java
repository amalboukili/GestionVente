package Gestion.Vente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArticleTest  {

	public static void main(String[] args) {
	Article art= new Article("Pack PC", 9500.99, 5);
	
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantité :" +art.getQuantité());
	
	art.setQuantité(3);
	System.out.println("Article : " +art.getTitre()+ "\t le prix est de : " +art.getPrix()+ "\t La quantité :" +art.getQuantité());

	art.stockerProduit("Kit");
	art.getProduis();

	Article a = new Article("Pack Pc", 9500.99, 1, Promotion.ETE);
	System.out.println("Nom d'article : " + a.getTitre());
	System.out.println("Prix d'article : " + a.getPrix());
	File f = new File("C:\\Users\\ahlam\\Desktop\\java\\GestionVente\\src\\Gestion\\Vente\\ArticlesVendus.CSV");

	  ArrayList<Article> ArticlesVendus= new ArrayList<Article>();
	ArticlesVendus.add(a);
	ArticlesVendus.add(art);
	
	//Exporter une liste des articles au format CSV
	try {
		
		FileWriter fw= new FileWriter(f, true);
		BufferedWriter bw= new BufferedWriter(fw);
		
		for(Article aVendus : ArticlesVendus)	{
		       	bw.newLine();
				bw.write(aVendus.getTitre() + ',' + String.valueOf(aVendus.getPrix())+ ',' +aVendus.getQuantité() );
				

		    }		
		bw.close();
		}	catch (IOException exception) {
		System.out.println("Erreur lors de l'écriture : "+exception.getMessage());
	
	
		}
	
	}

}
