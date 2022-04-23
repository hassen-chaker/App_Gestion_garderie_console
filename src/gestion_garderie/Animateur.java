package gestion_garderie;

import java.util.Scanner;

public class Animateur extends Personne {
	
	//les aattributs:
	
	//les constructeurs:
	public Animateur()
	{
		
	}
	
	//les getteurs et les setteurs:
	
	
	
	public Animateur(int cin, String nom, String prenom, String prenomP, String dateN, int numRue,
			String designationRue, String ville, int codePostal, String gouvernorat, int tel) {
		super(cin, nom, prenom, prenomP, dateN, numRue, designationRue, ville, codePostal, gouvernorat, tel);
		// TODO Auto-generated constructor stub
	}



	//les methodes d'ordre general:
	 static Scanner sc = new Scanner(System.in);
		
	
	public String toString() {
		return "["+ getCin() + ","+ getNom() +","+ getPrenom() +","+ getPrenomP() +","+ getDateN() +","
				+ ""+ getNumRue() +","+ getDesignationRue() +","
				+ getVille() + ","+ getCodePostal() +","+ getGouvernorat()+","+getTel()+"]";
	}


	//Animateur A1 = new Animateur(1,"aa","aa","aa","aa",1,"aa","aa",1,"aa",1) ;
//	Animateur A2 = new Animateur(2,"bb","bb","bb","bb",1,"bb","bb",1,"bb",1) ;
		

}
