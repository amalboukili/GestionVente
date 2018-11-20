package Entrées_Sorties;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class InteractionFiles  {

	public static void main(String[] args) {
	
		//Lecture des paramètres d'un fichier
		PropertyResourceBundle p =  (PropertyResourceBundle) ResourceBundle.getBundle("Entrées_Sorties\\paramConf");//nom du package et le nom du fichier
		System.out.println(p.getString("file_lecture"));
		System.out.println(p.getString("file_ecriture"));
				
	
	}
}
