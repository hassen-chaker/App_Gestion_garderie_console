package gestion_garderie;

public class Activite {

	//les attributs:
	private String code;
	private String designationA;
	private Animateur animateur; 
	private float fraisInscription ;
	private int niveau;
	//les constructeurs ;
	public Activite( ) {
		
	}

	public Activite(String code, String designationA, Animateur animateur, float fraisInscription,int niveau) {
		super();
		this.code = code;
		this.designationA = designationA;
		this.animateur = animateur;
		this.fraisInscription = fraisInscription;
		this.niveau = niveau;
	}
	//les getteurs et les setteurs
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignationA() {
		return designationA;
	}

	public void setDesignationA(String designationA) {
		this.designationA = designationA;
	}

	public Animateur getAnimateur() {
		return animateur;
	}

	public void setAnimateur(Animateur animateur) {
		this.animateur = animateur;
	}

	public float getFraisInscription() {
		return fraisInscription;
	}

	public void setFraisInscription(float fraisInscription) {
		this.fraisInscription = fraisInscription;
	}
	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	
	//les methodes d'ordre general
	@Override
	public String toString() {
		return " [" + code + "," + designationA + ", " + animateur
				+ "," + fraisInscription + ", niveau=" + niveau + "]";
	}

	

	  
	
	



}