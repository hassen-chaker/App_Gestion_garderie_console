package gestion_garderie;

import java.util.Vector;

public class Classe {
 
	//les attributs:
	private String nomC;
	private Vector<Eleve> listeEleves = new Vector<Eleve>() ;
	private Vector<Activite> listeActivites = new Vector<Activite>();
	private Vector<Animateur> listeAnimateurs = new Vector<Animateur>();
	
	
	//les constructeurs
	public Classe ()
	{
		
	}
	
	

	public Classe(String nomC, Vector<Eleve> listeEleves, Vector<Activite> listeActivites, Vector<Animateur> listeAnimateurs) {
		
		this.nomC = nomC;
		this.listeEleves = listeEleves;
		this.listeActivites = listeActivites;
		this.listeAnimateurs = listeAnimateurs;
	}

	//les methodes d'ordre general

	public String getNomC() {
		return nomC;
	}


	public void setNomC(String nomC) {
		this.nomC = nomC;
	}


	public Vector<Eleve> getListeEleves() {
		return listeEleves;
	}


	public void setListeEleves(Vector<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}


	public Vector<Activite> getListeActivites() {
		return listeActivites;
	}


	public void setListeActivites(Vector<Activite> listeActivites) {
		this.listeActivites = listeActivites;
	}


	public Vector<Animateur> getListeAnimateurs() {
		return listeAnimateurs;
	}


	public void setListeAnimateurs(Vector<Animateur> listeAnimateurs) {
		this.listeAnimateurs = listeAnimateurs;
	}


	
	
	@Override
	public String toString() {
		return "Classe : [" + nomC + ",\n " + listeEleves + ", \n=" + listeActivites
				+ ",\n" + listeAnimateurs + "]";
	}
	
	
	
	
}
