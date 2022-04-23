package gestion_garderie;

import java.util.Scanner;
import java.util.Vector;

public class Eleve extends Personne{
	//les attributs:
	private String prenomGP;
	private String nomM;
	private String prenomM;
	private int niveauS;
	private Vector<Activite> listeCoursS = new Vector<Activite>() ;
	
	//les constructeurs:
	
	public Eleve() {
		
	}

	public Eleve(int cin, String nom, String prenom, String prenomP, String dateN, int numRue, String designationRue,
			String ville, int codePostal,String gouvernorat, int tel,
			String prenomGP, String nomM, String prenomM, int niveauS,Vector<Activite> listeCoursS) {
		super(cin, nom, prenom, prenomP, dateN, numRue, designationRue, ville, codePostal, gouvernorat, tel);
		this.prenomGP = prenomGP;
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.niveauS = niveauS;
		this.listeCoursS = listeCoursS;
	}
	

	//les getteurs el les setteurs: 
	
	public String getPrenomGP() {
		return prenomGP;
	}

	public void setPrenomGP(String prenomGP) {
		this.prenomGP = prenomGP;
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public String getPrenomM() {
		return prenomM;
	}

	

	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}

	public int getNiveauS() {
		return niveauS;
	}

	public void setNiveauS(int niveauS) {
		this.niveauS = niveauS;
	}

	public Vector<Activite> getListeCoursS() {
		return listeCoursS;
	}

	public void setListeCoursS(Vector<Activite> listeCoursS) {
		this.listeCoursS = listeCoursS;
	}
	@Override
	public String toString() {
		return  "["+ getCin() + ","+ getNom() +","+ getPrenom() +","+ getPrenomP() +","+ getDateN() +","
				+ ""+ getNumRue() +","+ getDesignationRue() +","
				+ getVille() + ","+ getCodePostal() +","+ getGouvernorat()+","+ getTel() +","+ getPrenomGP() +","+getNomM()+","+ getPrenomM()+ ","+ getTel()+ ","+getListeCoursS()+"]";
	}

	//les méthodes d'ordre general:
	
	
	
	
	

	
	

}
