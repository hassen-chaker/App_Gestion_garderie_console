package gestion_garderie;



public class Personne {

	
//les attributs:
	private int cin;
	private String nom;
	private String prenom;
	private String prenomP;
	private String dateN;
	private int numRue; 
	private String designationRue;
	private String ville;
	private int codePostal;
	private String gouvernorat ;
	private int tel;
	
//les constructeurs:
	public Personne() {
		
	}

    public Personne (int cin, String nom, String prenom, String prenomP, String dateN, int numRue, String designationRue, String ville,
		int codePostal,String gouvernorat, int tel) {
	this.cin = cin;
	this.nom = nom ;
	this.prenom = prenom;
	this.prenomP = prenomP;
	this.dateN = dateN;
	this.numRue = numRue;
	this.designationRue = designationRue;
	this.ville = ville;
	this.codePostal = codePostal;
	this.tel = tel;
	this.gouvernorat = gouvernorat;
    }

  //les getteurs et les setteurs:
    
	public  int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
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

	public String getPrenomP() {
		return prenomP;
	}

	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}

	public String getDateN() {
		return dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getDesignationRue() {
		return designationRue;
	}

	public void setDesignationRue(String designationRue) {
		this.designationRue = designationRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	//Les methode d'ordre general:
	


	
	public Personne ajout(){
		Personne P=new Personne();
		return P ;
	}
	
	
	
	


}
