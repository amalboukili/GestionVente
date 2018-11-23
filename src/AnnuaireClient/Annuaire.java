package AnnuaireClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Annuaire {
	public static ArrayList<TelRecord>clients = new ArrayList<>();
	
	//Ajouter des produits
			public void AjouterClient(TelRecord client) {
				
				clients.add(client);
							
			}
			
			
			//Retirer Client 
			public void RetirerClient(TelRecord client) {
				clients.remove(client);
		
		    }
			
			public void REmplirCsv() {
				File f= new File("C:\\Users\\ahlam\\Desktop\\java\\GestionVente\\src\\AnnuaireClient\\annuaire.CSV");
				try {
								FileWriter fw= new FileWriter(f,true);
								BufferedWriter bw= new BufferedWriter(fw);
								for(TelRecord ListClient : clients)	{
							       	
									bw.write(ListClient.getNom() + ',' + ListClient.getPrenom()+ ',' +ListClient.getNumTel() );
									bw.newLine();
									}		
							bw.close();
								

				}catch(IOException exception) {
					System.out.println("Erreur lors d'ajout d'un client :"+exception.getMessage());
				}
				
			}
			public ArrayList<TelRecord> ListerAnnuaire() {
			//System.out.println(client.getNom() +", "+ client.getPrenom() +", "+ client.getNumTel());
				ArrayList<TelRecord> list= new ArrayList<TelRecord>();
				
				File f= new File("C:\\Users\\ahlam\\Desktop\\java\\GestionVente\\src\\AnnuaireClient\\annuaire.CSV");
				
				
				try {
					FileReader fr=new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					
					String line;
					while((line = br.readLine()) != null) {
						String []splitArray = line.split(",");
						String nom= splitArray[0];
						String prenom = splitArray[1];
						int numTel = Integer.valueOf(splitArray[2]);
						TelRecord client = new TelRecord(nom, prenom, numTel);
						list.add(client);
						
														
					}
					
					br.close();
					fr.close();
					
				}catch (IOException exception) {
					System.out.println("Erreur lors de lister les clients : "+exception.getMessage());
				
				
					}
				
				return list;
				
			}



}
