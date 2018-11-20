package Entrées_Sorties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class InteractionFiles  {

	public static void main(String[] args) {
	
		//Lecture des paramètres d'un fichier
		PropertyResourceBundle p =  (PropertyResourceBundle) ResourceBundle.getBundle("Entrées_Sorties\\paramConf");//nom du package et le nom du fichier
		System.out.println(p.getString("file_lecture"));
		System.out.println(p.getString("file_ecriture"));
		
		//Lecture du contenu d'un fichier
		try {
			File f= new File("C:\\Users\\ahlam\\Desktop\\java\\GestionVente\\src\\Entrées_Sorties\\fichier1.txt");
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			try {
				String line= br.readLine();
				while(line!=null) {
					System.out.println(line);
					line=br.readLine();
					
				}
				br.close();
				
			}catch(IOException exception) {
				System.out.println("Erreur lors de la lecture " +exception.getMessage());
			}
			
			
			
		}catch(FileNotFoundException exception) {
			System.out.println("Le fichier n'a pas été trouvé : " +exception.getMessage());
		}
		
		
				
	
	}

}
