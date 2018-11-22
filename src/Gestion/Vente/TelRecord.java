package Gestion.Vente;

import java.util.ArrayList;

public class TelRecord {
	private String nom;
	private String prenom;
	private int numTel;
	
	ArrayList<Objet>Client=
	
	public TelRecord(String nom, String prenom, int numTel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	
	
	
	
	
	

}
