package gestion_garderie;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;


public class Garderie {
	
	
	//les aattributs:
	
	static final int id=7528;
	static String Nom,Adresse;
	static Vector<Animateur>  listeAnimateurs= new Vector<Animateur> ();
	static Vector<Activite>  listeActivites = new Vector<Activite>();
	static Vector<Classe> listeClasses = new Vector<Classe>();
	static Vector<Eleve> listeEleves = new Vector<Eleve>();
	static Directeur directeur;
	
	//les constructeurs:
	
	
	//les getteurs et les setteurs:
	public static String getNom() {
		return Nom;
	}

	public static void setNom(String nom) {
		Nom = nom;
	}

	public static String getAdresse() {
		return Adresse;
	}

	public static void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public static Vector<Animateur> getListeAnimateurs() {
		return listeAnimateurs;
	}

	public static void setListeAnimateurs(Vector<Animateur> listeAnimateurs) {
		Garderie.listeAnimateurs = listeAnimateurs;
	}

	public static Vector<Activite> getListeActivites() {
		return listeActivites;
	}

	public static void setListeActivites(Vector<Activite> listeActivites) {
		Garderie.listeActivites = listeActivites;
	}

	public static Vector<Classe> getListeClasses() {
		return listeClasses;
	}

	public static void setListeClasses(Vector<Classe> listeClasses) {
		Garderie.listeClasses = listeClasses;
	}

	public static Vector<Eleve> getListeEleves() {
		return listeEleves;
	}

	public static void setListeEleves(Vector<Eleve> listeEleves) {
		Garderie.listeEleves = listeEleves;
	}

	public static Directeur getDirecteur() {
		return directeur;
	}

	public static void setDirecteur(Directeur directeur) {
		Garderie.directeur = directeur;
	}

	public static int getId() {
		return id;
	}



	Scanner sc = new Scanner(System.in);
	
	
	/*  **************MENU****************  */
	public void menu()
	{
		int choix=0;
		do {
			System.out.println("*************BIENVENUE AU MENU PRINCIPALE*****************\n");
			System.out.println("\n\t 0 - Quitter L'application");
			System.out.println("\n\t 1 - Gestion Animateurs");
			System.out.println("\n\t 2 - Gestion Eleves");
			System.out.println("\n\t 3 - Gestion Classes");
			System.out.println("\n\t 4 - Gestion Activites/Cours");
			System.out.println("\n\t 5 - Calcul Payement");
			
			System.out.println("Tapez le numero correspondant à votre choix :");
			choix=sc.nextInt();
			switch (choix) {
			case 0:
				System.out.println("FERMETURE de l'application ...");
				System.exit(0);
				break;
			case 1:
				GestionAnimateurs(); break;
			case 2:
				GestionEleves(); break;
			case 3:
				GestionClasses(); break;
			case 4:
				GestionActivite(); break;
			case 5:
				FixerMontant(); break;
			default:
				System.out.println("CHOIX INVALIDE!");
				break;
			}
		
		}while(choix!=0);
		
	}
	
	/* ***************METHODES GESTIONS ******************   */
	
	public void FixerMontant(){
		System.out.println("********Calcul Montant********\n");
		ListerEleve();
		System.out.println("Choisir un eleve de la liste \n");
		int i=sc.nextInt();
		Eleve E1=listeEleves.get(i);
		System.out.println("Liste des cours suivi par cet eleve:" +E1.getListeCoursS());
		float S=0;
		for(int j=0;j<E1.getListeCoursS().size();j++)
		{
			S=S+E1.getListeCoursS().get(j).getFraisInscription();
	//	if(listeAnimateurs.get(i).getCin() == cin2)
		}
		 System.out.println("Montant à payer :"+S+"dt");
	}
	
	//Gestion Animateurs 
	public void GestionAnimateurs()
	{
	
		int choixAnimateur=0;
		
		do {
			System.out.println("********GESTION ANIMATEURS********\n");
			System.out.println("\n\t 0 - Retour au menu");
			System.out.println("\n\t 1 - Ajouter Animateur");
			System.out.println("\n\t 2 - Mettre à jour Animateur");
			System.out.println("\n\t 3 - Supprimer Animateur");
			System.out.println("\n\t 4 - Lister Animateur");
			System.out.println("\n\t 5 - Rechercher Animateur");
			
			System.out.println("Tapez le numero correspondant à votre choix :");
			choixAnimateur=sc.nextInt();
			switch (choixAnimateur) {
			case 0: menu(); break; 
			case 1: AjouterAnimateur(); break; 
			case 2: Animateur A1 = new Animateur ();
				ModifierAnimateur(A1.getCin()); break; 
			case 3: Animateur A2 = new Animateur ();
				SupprimerAnimateur(A2.getCin()); break; 
			case 4: ListerAnimateur(); break; 
			case 5: Animateur A3 = new Animateur ();
				RechercherAnimateur(A3.getCin()); break; 
				
			default:System.out.println("CHOIX INVALIDE!"); break;	
			}
		}while(choixAnimateur!=0);
	}
	
	   //Gestion Eleves 
	public void GestionEleves() {
		
int choixEleve=0;
		
		do {
			System.out.println("********GESTION ELEVES********\n");
			System.out.println("\n\t 0 - Retour au menu");
			System.out.println("\n\t 1 - Ajouter Eleve");
			System.out.println("\n\t 2 - Mettre à jour Eleve");
			System.out.println("\n\t 3 - Supprimer Eleve");
			System.out.println("\n\t 4 - Lister Eleve");
			System.out.println("\n\t 5 - Rechercher Eleve");
			
			System.out.println("Tapez le numero correspondant à votre choix :");
			choixEleve=sc.nextInt();
			switch (choixEleve) {
			case 0: menu(); break; 
			case 1: AjouterEleve(); break; 
			case 2: Eleve A1 = new Eleve ();
			ModifierEleve(A1.getCin()); break; 
			case 3:Eleve A2 = new Eleve ();
			SupprimerEleve(A2.getCin()); break; 
			case 4: ListerEleve(); break; 
			case 5: Eleve A3 = new Eleve ();
			RechercherEleve(A3.getCin()); break; 
				
			default:System.out.println("CHOIX INVALIDE!"); break;	
			}
		}while(choixEleve!=0);
		
	}
	 //Gestion Classes
	public void GestionClasses() {
		
int choixClasse=0;
		
		do {
			System.out.println("********GESTION CLASSES********\n");
			System.out.println("\n\t 0 - Retour au menu");
			System.out.println("\n\t 1 - Ajouter Classe");
			System.out.println("\n\t 2 - Mettre à jour Classe");
			System.out.println("\n\t 3 - Supprimer Classe");
			System.out.println("\n\t 4 - Lister Classe");
			System.out.println("\n\t 5 - Rechercher Classe");
			
			System.out.println("Tapez le numero correspondant à votre choix :");
			choixClasse=sc.nextInt();
			switch (choixClasse) {
			case 0: menu(); break; 
			case 1: AjouterClasse(); break; 
			case 2: ModifierClasse(); break; 
			case 3:SupprimerClasse(); break;
			case 4: ListerClasse(); break; 
			case 5: Classe C = new Classe ();
			RechercherClasse(C.getNomC()); break; 
				
			default:System.out.println("CHOIX INVALIDE!"); break;	
			}
		}while(choixClasse!=0);
		
	}
	
	//Gestion Activite
	public void GestionActivite() {
		
		
int choixActivite=0;
		
		do {
			System.out.println("********GESTION ACTIVITE********\n");
			System.out.println("\n\t 0 - Retour au menu");
			System.out.println("\n\t 1 - Ajouter Activite");
			System.out.println("\n\t 2 - Mettre à jour Activite");
			System.out.println("\n\t 3 - Supprimer Activite");
			System.out.println("\n\t 4 - Lister Activite");
			System.out.println("\n\t 5 - Rechercher Activite");
			
			System.out.println("Tapez le numero correspondant à votre choix :");
			choixActivite=sc.nextInt();
			switch (choixActivite) {
			case 0: menu(); break; 
			case 1: AjouterActivite(); break; 
			case 2: ModifierActivite(); break; 
			case 3: SupprimerActivite(); break; 
			case 4: ListerActivite(); break; 
			case 5: Activite Ac = new Activite ();
			RechercherActivite(Ac.getCode()); break;
				
			default:System.out.println("CHOIX INVALIDE!"); break;	
			}
		}while(choixActivite!=0);
		
	}
	/* ****************************************TRAITEMENT**************************************** */
	
	
	    /*  *******Animateur******* */
	//***********************************************Ajout 
	
	 /* public static boolean isString(String text) {
	        if (text.matches("^[a-zA-Z]+$")) {
	            return true;} 
	            return false;}*/
	  
	  
	  public int compterOccurrencesCin(int cin)
	  {
	  int nb=0 ,i = 0;
	  while( i < listeAnimateurs.size())
	  {
	  if(listeAnimateurs.get(i).getCin() == cin)
	  nb++;

	  i++;
	  }
	  return nb;
	  }
	  
	  
	  
	  
	  
/*	  System.out.println("Date de naissance: ");
      
      System.out.println("--Jour : ");
     
      int jour1=sc.nextInt();
      System.out.println("--Mois : ");
      int mois1=sc.nextInt();   
      System.out.println("--Année : ");
      int an1=sc.nextInt();
      DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
      Date date_Naiss=null;
     
     
       //Date Date_Naiss=listeAnimateur.get(i).setDate_Naiss(ate_Naiss);
      try {
          date_Naiss=df1.parse(jour1+"-"+mois1+"-"+an1);
      } catch (ParseException e){
        e.getCause();
      }
  
      listeEleve.get(i).setDate_Naiss(date_Naiss);*/
	
	public void AjouterAnimateur() {
		
		System.out.println("Veuillez saisir les info d'un nouveau Animateur : \n");
		int cin;
		do {
		System.out.println("numero de CIN :");
		 cin = sc.nextInt();
		}while(compterOccurrencesCin(cin)!=0);
		
		
		System.out.println("nom :");
		String nom = sc.next();
		//if   (getNom().matches("^[a-zA-Z]+$")) {}
		System.out.println("prenom :");
		String prenom = sc.next();
		
		System.out.println("prenom de père :");
		String prenomP = sc.next();
		
		System.out.println("date de naissance :");
		 System.out.println("--Jour : ");
	     
	      int jour1=sc.nextInt();
	      System.out.println("--Mois : ");
	      int mois1=sc.nextInt();   
	      System.out.println("--Année : ");
	      int an1=sc.nextInt();
	      DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
	      Date dateN=null;
	     
	     
	       //Date Date_Naiss=listeAnimateur.get(i).setDate_Naiss(ate_Naiss);
	      try {
	    	  dateN=df1.parse(jour1+"-"+mois1+"-"+an1);
	      } catch (ParseException e){
	        e.getCause();
	      }
	      //listeEleves.get(i).setDateN();
		
		String dateNs = sc.next(); 
		
		System.out.println("numero de Rue :");
		int numRue = sc.nextInt();
		
		System.out.println("designation Rue :");
		String designationRue = sc.next();
		
		System.out.println("ville :");
		String ville = sc.next();
		
		System.out.println("code Postal :");
		int codePostal = sc.nextInt();
		
		System.out.println("gouvernorat :");
		String gouvernorat = sc.next();
		
		System.out.println("numero de telephone :");
		int tel = sc.nextInt();
	
		//Création d'une instance de type Animateur
		Animateur A = new Animateur(cin,nom,prenom,prenomP,dateNs,numRue, designationRue,
				ville,codePostal, gouvernorat,tel);
		//ajout de cette instance dans la collection (tableau) 
		this.listeAnimateurs.add(A);
		System.out.println("Animateur est ajouté avec succès ...");		
	}
	//***************************************Modifier 
	public void ModifierAnimateur(int cin) {
		
		System.out.println("mettre à jour Animateur de numero de CIN =");
		int cin1  = sc.nextInt();
		for(int i=0;i<listeAnimateurs.size();i++)
		{

		if(listeAnimateurs.get(i).getCin() == cin1)

		{String attribut="";
		do {
			
			System.out.println("Veuillez saisir l'attribut à modifier:" );
			 attribut = sc.next();
			 
		}while((!(attribut.equals("cin"))) && (!(attribut.equals("nom"))) && (!(attribut.equals("prenom"))) && (!(attribut.equals("prenomP")))
				&& (!(attribut.equals("dateN"))) && (!(attribut.equals("numRue"))) && (!(attribut.equals("designationRue")))
				&& (!(attribut.equals("ville"))) && (!(attribut.equals("codePostal"))) && (!(attribut.equals("gouvernorat"))) 
				&& (!(attribut.equals("tel"))));
		
		switch (attribut) {
		case "cin":{
			System.out.print("CIN actuel :");
			System.out.println(rechercheA(cin1).getCin());
			System.out.println("Modifier CIN :");
			int cin2 = sc.nextInt();
		listeAnimateurs.get(i).setCin(cin2); 
		System.out.println("Animateur Apres Modification: "+rechercheA(cin2));
		break; }
		
		case "nom":{System.out.print("nom actuel:");
		System.out.println(rechercheA(cin1).getNom());
			System.out.println("Modifier Nom :");
			listeAnimateurs.get(i).setNom(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "prenom":{System.out.print("prenom actuel:");
		System.out.println(rechercheA(cin1).getPrenom());
			System.out.println("Modifier Prenom :");
			listeAnimateurs.get(i).setPrenom(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "prenomP":{System.out.print("prenom de Père actuel:");
		System.out.println(rechercheA(cin1).getPrenomP());
			System.out.println("Modifier Prenom de Père :");
			listeAnimateurs.get(i).setPrenomP(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "dateN()":{System.out.print("Date de Naissance:");
		System.out.println(rechercheA(cin1).getDateN());
			System.out.println("Modifier Date de Naissance:");
			listeAnimateurs.get(i).setDateN(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "NumRue()":{System.out.print("Num Rue:");
		System.out.println(rechercheA(cin1).getNumRue());
			System.out.println("Modifier Num Rue:");
			listeAnimateurs.get(i).setNumRue(sc.nextInt());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "DesignationRue()":{System.out.print("DesignationRue:");
		System.out.println(rechercheA(cin1).getDesignationRue());
			System.out.println("Modifier DesignationRue:");
			listeAnimateurs.get(i).setDesignationRue(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "ville":{System.out.print("ville:");
		System.out.println(rechercheA(cin1).getVille());
			System.out.println("Modifier ville:");
			listeAnimateurs.get(i).setVille(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "codePostal":{System.out.print("code Postal:");
		System.out.println(rechercheA(cin1).getCodePostal());
			System.out.println("Modifier code Postal:");
			listeAnimateurs.get(i).setCodePostal(sc.nextInt());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "gouvernorat":{System.out.print("gouvernorat:");
		System.out.println(rechercheA(cin1).getGouvernorat());
			System.out.println("Modifier gouvernorat:");
			listeAnimateurs.get(i).setGouvernorat(sc.next());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		case "tel":{System.out.print("Numero telephone:");
		System.out.println(rechercheA(cin1).getTel());
			System.out.println("Modifier Numero telephone:");
			listeAnimateurs.get(i).setTel(sc.nextInt());
			System.out.println("Animateur Apres Modification: "+rechercheA(cin1));
			break; }
		
		default:System.out.println("CHOIX INVALIDE!"); break;	
		}}}}
		
	//supprimer 
	public boolean SupprimerAnimateur(int cin) {
	
		System.out.println("numero de CIN :");
		int cin1  = sc.nextInt();
		for(int i=0;i<listeAnimateurs.size();i++)
		{

		if(listeAnimateurs.get(i).getCin() == cin1)

		{listeAnimateurs.remove(i); 
		System.out.println("Animateur est supprimé avec succès");
		System.out.println("Liste Animateur Apres suppression");
		ListerAnimateur();
		return true;}
		}
		System.out.println("Animateur introuvable!");
		return false;
		}
	
	
	//RechercherA
	public Animateur rechercheA(int cin)
	{Animateur A = new Animateur();
	int i=0;
		//for(int i=0;i<listeAnimateurs.size();i++)
			while(i<listeAnimateurs.size())
			{if(listeAnimateurs.get(i).getCin() == cin)
			 A=((Animateur)listeAnimateurs.get(i));
			
			i++;}
		return A;
	}
		
	
	//Lister 
	public void ListerAnimateur() {
		
		System.out.println("Liste des Animateurs : \n");
		if(listeAnimateurs.size()!=0) {
		for(int i=0;i<listeAnimateurs.size();i++) //size donne le nombre d'elemnts 
		{	System.out.print("Animateur "+(i+1)+":");
		System.out.println((Animateur)listeAnimateurs.get(i));  // get return object et la liste return animateur donc il faut faire un caste (Animateur)
		}}else
		System.out.println("Il n'existe pas encore des Animateurs!\n");
	}
	
	
	//Rechercher 
	public boolean RechercherAnimateur(int cin) {
	
		System.out.println("Rechercher Animateur de numero de CIN =");
		int cin2  = sc.nextInt();
		for(int i=0;i<listeAnimateurs.size();i++)
		{

		if(listeAnimateurs.get(i).getCin() == cin2)

		{  System.out.println("Animateur de numero de CIN : "+cin2 +"  ");
			System.out.println((Animateur)listeAnimateurs.get(i));
		
		return true;}
		}
		System.out.println("Animateur introuvable!");
		return false;
		

		}
	/*-------------------------------------------------------------------------------*/
    /*  *******Eleve******* */
	//Ajout 
	public void AjouterEleve() {
		
		System.out.println("Veuillez saisir les info d'un nouveau Eleve : \n");
		
		System.out.println("nom :");
		String nom = sc.next();
		
		System.out.println("prenom :");
		String prenom = sc.next();
		
		System.out.println("prenom de père :");
		String prenomP = sc.next();
		
		System.out.println("prenom de grand père :");
		String prenomGP = sc.next();
		
		System.out.println("nom de mère :");
		String nomM = sc.next();
		
		System.out.println("prenom de mère :");
		String prenomM = sc.next();
		
		System.out.println("numero de CIN de père :");
		int cin = sc.nextInt();
		
		System.out.println("numero de telephone de père :");
		int tel = sc.nextInt();
		
		System.out.println("date de naissance :");
		String dateN = sc.next(); 
		
		System.out.println("numero de Rue :");
		int numRue = sc.nextInt();
		
		System.out.println("designation Rue :");
		String designationRue = sc.next();
		
		System.out.println("ville :");
		String ville = sc.next();
		
		System.out.println("code Postal :");
		int codePostal = sc.nextInt();
		
		System.out.println("gouvernorat :");
		String gouvernorat = sc.next();
		
		//System.out.println("Niveau Scolaire :");
		//String niveauS = sc.next();

		int niveauSc=0;
		do {
		System.out.println("Tapez le numero correspondant à votre Niveau Scolaire :");
		System.out.println("\n\t 1 - Niveau 1");
		System.out.println("\n\t 2 - Niveau 2");
		System.out.println("\n\t 3 - Niveau 3");
		 niveauSc = sc.nextInt();
		} while(niveauSc!=1 && niveauSc!=2 && niveauSc!=3);
		/*switch(niveauSc) {
		 * 
		case 1 :niveau(1);  break;
		case 2 :niveau(2);  break;
		case 3 : niveau(3);  break;
		default: System.out.println("Choix invalide"); break;
		}
		}*/
		
		//Création d'une instance de type Eleve
		Eleve e = new Eleve(cin, nom, prenom, prenomP,dateN,  numRue,  designationRue, ville, codePostal, gouvernorat,  tel,
		prenomGP,  nomM,  prenomM, niveauSc,niveau(niveauSc));
		//ajout de cette instance dans la collection (tableau) 
		this.listeEleves.add(e);
		System.out.println("Eleve est ajouté avec succès ...");}
	
	
	//Activite Nineau
        public void ActiviteNiveau(int nv) {
        	
        System.out.println("Liste Activite de niveau : "+nv);
		for(int i=0;i<listeActivites.size();i++)
		{
		if(listeActivites.get(i).getNiveau() == nv)

		{ // System.out.println("Activite "+i);
			System.out.println((Activite)listeActivites.get(i));
		}
		}
		
		}
        
	//methode niveau
	Vector<Activite> niveau(int nv) {
		String code;
		int v;
		Vector<Activite> listeCours = new Vector<Activite>() ;
		System.out.println("Liste des cours proposer  :");
		do {
		ActiviteNiveau(nv);
		System.out.println("Tapez l'un des codes correspondants à vos cours :");
		code = sc.next();
		listeCours.add(rechercheAc(code));
		System.out.println("Voulez vous ajouter une autre Activite 1/0 » (1 pour Oui, O pour Non):"); 
		v = sc.nextInt();
		}while(v!=0);
		return listeCours;
	}
	
	//Modifier 
	
	public void ModifierEleve(int cin) {
	System.out.println("mettre à jour Eleve de numero de CIN de père=");
	int cin1  = sc.nextInt();
	for(int i=0;i<listeEleves.size();i++)
	{

	if(listeEleves.get(i).getCin() == cin1)

	{String attribut="";
	do {
		
		System.out.println("Veuillez saisir l'attribut à modifier:" );
		 attribut = sc.next();
		 
	}while((!(attribut.equals("cinP"))) && (!(attribut.equals("nom"))) && (!(attribut.equals("prenom"))) && (!(attribut.equals("prenomP")))
			&& (!(attribut.equals("prenomGP"))) && (!(attribut.equals("nomM"))) && (!(attribut.equals("prenomM"))) &&
			(!(attribut.equals("tel"))) &&(!(attribut.equals("DateN"))) &&(!(attribut.equals("numRue"))) && (!(attribut.equals("designationRue")))
			&& (!(attribut.equals("ville"))) && (!(attribut.equals("codePostal"))) && (!(attribut.equals("gouvernorat"))) 
			&& (!(attribut.equals("niveauS"))));
	
	switch (attribut) {
	case "cinP":{
		System.out.print("CIN de pere actuel :");
		System.out.println(rechercheE(cin1).getCin());
		System.out.println("Modifier CIN :");
		int cin2 = sc.nextInt();
	listeEleves.get(i).setCin(cin2); 
	System.out.println("Eleve Apres Modification: "+rechercheE(cin2));
	break; }
	
	case "nom":{System.out.print("nom actuel:");
	System.out.println(rechercheE(cin1).getNom());
		System.out.println("Modifier Nom :");
		listeEleves.get(i).setNom(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "prenom":{System.out.print("prenom actuel:");
	System.out.println(rechercheE(cin1).getPrenom());
		System.out.println("Modifier Prenom :");
		listeEleves.get(i).setPrenom(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "prenomP":{System.out.print("prenom de Père actuel:");
	System.out.println(rechercheE(cin1).getPrenomP());
		System.out.println("Modifier Prenom de Père :");
		listeEleves.get(i).setPrenomP(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "prenomGP":{System.out.print("prenom de Grand Père actuel:");
	System.out.println(rechercheE(cin1).getPrenomP());
		System.out.println("Modifier Prenom de Grand Père :");
		listeEleves.get(i).setPrenomGP(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "nomM":{System.out.print("Nom de mere actuel:");
	System.out.println(rechercheE(cin1).getPrenomP());
		System.out.println("Modifier Nom de mere :");
		listeEleves.get(i).setNomM(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "prenomM":{System.out.print("prenom mere actuel:");
	System.out.println(rechercheE(cin1).getPrenomP());
		System.out.println("Modifier Prenom de Père :");
		listeEleves.get(i).setPrenomM(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "dateN()":{System.out.print("Date de Naissance:");
	System.out.println(rechercheE(cin1).getDateN());
		System.out.println("Modifier Date de Naissance:");
		listeEleves.get(i).setDateN(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "NumRue()":{System.out.print("Num Rue:");
	System.out.println(rechercheE(cin1).getNumRue());
		System.out.println("Modifier Num Rue:");
		listeEleves.get(i).setNumRue(sc.nextInt());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "DesignationRue()":{System.out.print("DesignationRue:");
	System.out.println(rechercheE(cin1).getDesignationRue());
		System.out.println("Modifier DesignationRue:");
		listeEleves.get(i).setDesignationRue(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "ville":{System.out.print("ville:");
	System.out.println(rechercheE(cin1).getVille());
		System.out.println("Modifier ville:");
		listeEleves.get(i).setVille(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "codePostal":{System.out.print("code Postal:");
	System.out.println(rechercheE(cin1).getCodePostal());
		System.out.println("Modifier code Postal:");
		listeEleves.get(i).setCodePostal(sc.nextInt());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "gouvernorat":{System.out.print("gouvernorat:");
	System.out.println(rechercheE(cin1).getGouvernorat());
		System.out.println("Modifier gouvernorat:");
		listeEleves.get(i).setGouvernorat(sc.next());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	case "tel":{System.out.print("Numero telephone:");
	System.out.println(rechercheE(cin1).getTel());
		System.out.println("Modifier Numero telephone:");
		listeEleves.get(i).setTel(sc.nextInt());
		System.out.println("Eleve Apres Modification: "+rechercheE(cin1));
		break; }
	
	default:System.out.println("CHOIX INVALIDE!"); break;	
	}}}}
	//supprimer 


	
	public boolean SupprimerEleve(int cin) {
		
		System.out.println("numero de CIN de père  :");
		int cin1  = sc.nextInt();
		for(int i=0;i<listeEleves.size();i++)
		{

		if(listeAnimateurs.get(i).getCin() == cin1)

		{listeEleves.remove(i); 
		System.out.println("Eleve est supprimé avec succès");
		System.out.println("Liste Eleves Apres suppression");
		ListerEleve();
		return true;}
		}
		System.out.println("Eleve introuvable!");
		return false;
		}


//Lister 
public void ListerEleve() {
	
	System.out.println("Liste des Eleves : \n");
	if(listeEleves.size()!=0) {
	for(int i=0;i<listeEleves.size();i++) //size donne le nombre d'elemnts 
	{	System.out.print("Eleve "+(i+1)+":");
	System.out.println((Eleve)listeEleves.get(i));  // get return object et la liste return animateur donc il faut faire un caste (Animateur)
	}}else
	System.out.println("Il n'existe pas encore des Eleves!\n");
}




	
	
	//RechercherE
		public Eleve rechercheE(int cin)
		{Eleve E = new Eleve();
		int i=0;
			//for(int i=0;i<listeAnimateurs.size();i++)
				while(i<listeEleves.size())
				{if(listeEleves.get(i).getCin() == cin)
				 E=((Eleve)listeEleves.get(i));
				
				i++;}
			return E;
		}
	//Rechercher 
	
		public boolean RechercherEleve(int cin) {
			
			System.out.println("Rechercher Eleve de numero de CIN =");
			int cin2  = sc.nextInt();
			for(int i=0;i<listeEleves.size();i++)
			{

			if(listeEleves.get(i).getCin() == cin2)

			{  System.out.println("Animateur de numero de CIN : "+cin2 +"  ");
				System.out.println((Eleve)listeEleves.get(i));
			
			return true;}
			}
			System.out.println("Eleve introuvable!");
			return false;
			
	}
		

	
	/*-------------------------------------------------------------------*/
    /*  *******Classe******* */
	//Ajout 
	public void AjouterClasse() {
		
		System.out.println("Veuillez saisir les info d'un nouveau Classe : \n");
		System.out.println("Nom: ");
		String nomC=sc.next();
		
		ListerEleve();
		int v;
		do {
		System.out.println("Choisir l'indice de l'eleve a ajouter");
	    int i=sc.nextInt();
		Eleve E1=listeEleves.get(i-1);
		System.out.println("Voulez vous ajouter un autre Eleve 1/0 » (1 pour Oui, O pour Non):"); 
		v = sc.nextInt();
		}while(v!=0);
		
		
		ListerAnimateur();
		int w;
		do {
		System.out.println("Choisir l'indice de l'animateur a ajouter");
	    int j=sc.nextInt();
	    Animateur A1=listeAnimateurs.get(j-1);
	    System.out.println("Voulez vous ajouter un autre Animateur 1/0 » (1 pour Oui, O pour Non):"); 
		w = sc.nextInt();
		}while(w!=0);
		
		ListerActivite();
		int x;
		do {
	    System.out.println("Choisir l'indice de cours a ajouter");
	    int k=sc.nextInt();
	    Activite Ac1=listeActivites.get(k-1);
	    System.out.println("Voulez vous ajouter un autre cours 1/0 » (1 pour Oui, O pour Non):"); 
		x = sc.nextInt();
		}while(x!=0);
	    
		//Création d'une instance de type Classe
		Classe C = new Classe(nomC,listeEleves,listeActivites,listeAnimateurs);
		//ajout de cette instance dans la collection (tableau) 
		this.listeClasses.add(C);
		System.out.println("Classe ajouté avec succès ...");
		}
	//*********************************************************************************Modifier classe*************************
	public void ModifierClasse() {
		
		
		System.out.println("mettre à jour Classe du Nom =");
		String nom1  = sc.next();
		for(int i=0;i<listeClasses.size();i++)
		{

		if(listeClasses.get(i).getNomC().equals(nom1))

		{String attribut="";
		int x;
		do {
		do {
			
			System.out.println("Veuillez saisir l'attribut à modifier:" );
			 attribut = sc.next();
			 
			
		}while((!(attribut.equalsIgnoreCase("nom"))) && (!(attribut.equalsIgnoreCase("listeE"))) && (!(attribut.equalsIgnoreCase("listeA"))) && (!(attribut.equalsIgnoreCase("listeAc"))));
		
		switch (attribut) {
		case "nom":{
			System.out.print("nom actuel :");
			System.out.println(rechercheC(nom1).getNomC());
			System.out.println("Modifier Nom du classe :");
			String nom2 = sc.next();
		listeClasses.get(i).setNomC(nom2); 
		System.out.println("Classe Apres Modification: "+rechercheC(nom2));
		break; }
		
		
		case "listeE":{//System.out.print("Liste des eleves actuelle:");
		//System.out.println(rechercheC(nom1).getListeEleves());
		System.out.println("Modifier Liste eleve :");
		System.out.println("Donner le CIN de pere d'un nouveau Eleve :");
		int Cin = sc.nextInt();
		Eleve E = new Eleve();
		E=rechercheE(Cin);
		Vector<Eleve> listeE = new Vector<Eleve>();
		listeE.add(E);
		listeClasses.get(i).setListeEleves(listeE);
		System.out.println("Classe Apres Modification: "+rechercheC(nom1));
		break; }
		
		case "listeA":{//System.out.print("Animateur actuel:");
		//System.out.println(rechercheC(nom1).getListeAnimateurs());
		System.out.println("Modifier Liste Animateur ");
		System.out.println("Donner le CIN d'un nouveau Animateur responsable :");
		int Cin = sc.nextInt();
		Animateur A = new Animateur();
		A=rechercheA(Cin);
		Vector<Animateur> listeA = new Vector<Animateur>();
		listeA.add(A);
		listeClasses.get(i).setListeAnimateurs(listeAnimateurs);
		System.out.println("Classe Apres Modification: "+rechercheC(nom1));
		break; }
		
		case "listeAc":{//System.out.print("Activite actuel:");
	//	System.out.println(rechercheC(nom1).getListeActivites());
		System.out.println("Modifier Liste Activite ");
		System.out.println("Donner le Code d'une nouvelle Activite :");
		String Code = sc.next();
		Activite Ac = new Activite();
		Ac=rechercheAc(Code);
		Vector<Activite> listeAc = new Vector<Activite>();
		listeAc.add(Ac);
		listeClasses.get(i).setListeActivites(listeActivites) ;
		System.out.println("Classe Apres Modification: "+rechercheC(nom1));
		break; }
		default:System.out.println("CHOIX INVALIDE!"); break;	
		}
		 System.out.println("\n\nVoulez vous modifier un autre attribut 1/0 » (1 pour Oui, O pour Non):"); 
			x = sc.nextInt();
		}while(x!=0);
		}}}
	
	//supprimer 
	
		public boolean SupprimerClasse() {
			System.out.println("Nom Classe :");
				String nom1  = sc.next();
				for(int i=0;i<listeClasses.size();i++)
				{

				if(listeClasses.get(i).getNomC() == nom1)

				{listeClasses.remove(i); 
				System.out.println("Classe est supprimé avec succès");
				return true;}
				}
				System.out.println("Classe introuvable!");
				return false;
				
			
	}
	
	
	

	//Lister 
public void ListerClasse() {
		
		System.out.println("Liste des Classes : \n");
		if(listeClasses.size()!=0) {
		for(int i=0;i<listeClasses.size();i++) //size donne le nombre d'elemnts 
		{	System.out.print("Classe "+(i+1)+":");
		System.out.println((Classe)listeClasses.get(i));  // get return object et la liste return animateur donc il faut faire un caste (Animateur)
		}}else
		System.out.println("Il n'existe pas encore des Classes!\n");
	
	}
	
	//RechercherC
	
	public Classe rechercheC(String nom)
	{Classe C = new Classe();
	int i=0;
			while(i<listeClasses.size())
			{	if(listeClasses.get(i).getNomC().equals(nom))
				 C=((Classe)listeClasses.get(i));
		
			i++;}
		return C ;
	}
	
	//Rechercher 
	public boolean RechercherClasse(String nomC) {
		
		System.out.println("Rechercher Classe nommée =");
		String nom  = sc.next();
		for(int i=0;i<listeClasses.size();i++)
		{

			if(listeClasses.get(i).getNomC().equals(nom))

		{  System.out.println("Classe nommée : "+nom +"  ");
			System.out.println((Classe)listeClasses.get(i));
		
		return true;}
		}
		System.out.println("Classe introuvable!");
		return false;
		
}
	
	/*-------------------------------------------------------------------*/
    /*  *******Activite******* */
	//Ajout 
	public void AjouterActivite() {		
System.out.println("Veuillez saisir les info d'un nouveau Cours : \n");
		
		System.out.println("code :");
		String code = sc.next();
		
		System.out.println("designationA :");
		String designationA = sc.next();
		
		System.out.println("Donner le CIN de l'animateur responsable :");
		int Cin = sc.nextInt();
		Animateur A = new Animateur();
		A=rechercheA(Cin);
		
		System.out.println("frais Inscription :");
		float fraisInscription = sc.nextInt();
		
		System.out.println("niveau :");
		int niveau = sc.nextInt();
		
	//Création d'une instance de type Animateur
		
		Activite Ac = new Activite(code,designationA,A,fraisInscription,niveau);
		//ajout de cette instance dans la collection (tableau) 
		this.listeActivites.add(Ac);
		System.out.println("Activite est ajouté avec succès ...");	
			}
			
	
	//Modifier 
	public void ModifierActivite() {
		
	
		System.out.println("mettre à jour Activite de code =");
		String code1  = sc.next();
		for(int i=0;i<listeActivites.size();i++)
		{

		if(listeActivites.get(i).getCode().equals(code1))

		{String attribut="";
		do {
			
			System.out.println("Veuillez saisir l'attribut à modifier:" );
			 attribut = sc.next();
			 
			
		}while((!(attribut.equalsIgnoreCase("code"))) && (!(attribut.equalsIgnoreCase("designationA"))) && (!(attribut.equalsIgnoreCase("animateur"))) && (!(attribut.equalsIgnoreCase("fraisInscription"))));
		
		switch (attribut) {
		case "code":{
			System.out.print("code actuel :");
			System.out.println(rechercheAc(code1).getCode());
			System.out.println("Modifier Code :");
			String code2 = sc.next();
		listeActivites.get(i).setCode(code2); 
		System.out.println("Activite Apres Modification: "+rechercheAc(code2));
		break; }
		
		case "designationA":{System.out.print("designationA actuel:");
		System.out.println(rechercheAc(code1).getDesignationA());
			System.out.println("Modifier designationA :");
			listeActivites.get(i).setDesignationA(sc.next());
			System.out.println("Activite Apres Modification: "+rechercheAc(code1));
			break; }
		
		case "fraisInscription":{System.out.print("fraisInscription actuel:");
		System.out.println(rechercheAc(code1).getFraisInscription());
		System.out.println("Modifier frais Inscription :");
		listeActivites.get(i).setFraisInscription(sc.nextInt());
		System.out.println("Activite Apres Modification: "+rechercheAc(code1));
		break; }
		
		case "animateur":{System.out.print("Animateur actuel:");
		System.out.println(rechercheAc(code1).getAnimateur());
		System.out.println("Modifier Animateur ");
		System.out.println("Donner le CIN d'un nouveau Animateur responsable :");
		int Cin = sc.nextInt();
		Animateur A = new Animateur();
		A=rechercheA(Cin);
		listeActivites.get(i).setAnimateur(A);
		System.out.println("Activite Apres Modification: "+rechercheAc(code1));
		break; }
		default:System.out.println("CHOIX INVALIDE!"); break;	
		}
		}}
		
	}
	//supprimer 
	public boolean SupprimerActivite() {
	System.out.println("Code d'activite :");
		String code1  = sc.next();
		for(int i=0;i<listeActivites.size();i++)
		{

		if(listeActivites.get(i).getCode() == code1)

		{listeActivites.remove(i); 
		System.out.println("Activite est supprimé avec succès");
		return true;}
		}
		System.out.println("Activite introuvable!");
		return false;
		
	}
	
	
	
	//Lister 
	public void ListerActivite() {
		
		System.out.println("Liste des Activites : \n");
		if(listeActivites.size()!=0) {
		for(int i=0;i<listeActivites.size();i++) //size donne le nombre d'elemnts 
		{	System.out.print("Activite "+(i+1)+":");
		System.out.println((Activite)listeActivites.get(i));  // get return object et la liste return animateur donc il faut faire un caste (Animateur)
		}}else
		System.out.println("Il n'existe pas encore des Activite!\n");
	
	}
	//Rechercher 
	
public boolean RechercherActivite(String code) {
			
			System.out.println("Rechercher Eleve de numero de CIN =");
			String code2  = sc.next();
			for(int i=0;i<listeActivites.size();i++)
			{

				if(listeActivites.get(i).getCode().equals(code2))

			{  System.out.println("Activite de code : "+code2 +"  ");
				System.out.println((Activite)listeActivites.get(i));
			
			return true;}
			}
			System.out.println("Activite introuvable!");
			return false;
			
	}


//RechercherAc

	public Activite rechercheAc(String code)
	{Activite Ac = new Activite();
	int i=0;
			while(i<listeActivites.size())
			{	if(listeActivites.get(i).getCode().equals(code))
				 Ac=((Activite)listeActivites.get(i));
		
			i++;}
		return Ac;
	}
	
	
	
	/**************PRINCIPALE******************/
	public static void main(String[] args) {
		Garderie G = new Garderie();
		
	      Animateur Animateur1=new Animateur(12844444,"Hassen","Chaker","Othmen","10/10/2010",103,"14Janvier","khzema",4050,"Sousse",73555482);
	      Animateur Animateur2=new Animateur(12855555,"Tasnim","Ammar","Sadok","15/07/2010",150,"14Janvier","kalaalebira",4060,"Sousse",73777711);
	      
	      Activite Activite1=new Activite("a0","farancais",Animateur1,250,1);
	      Activite Activite2=new Activite("a1","Anglais",Animateur2,150,3);
	      Activite Activite3=new Activite("a2","dance",Animateur1,100,2);
	      Activite Activite4=new Activite("a3","Dessin",Animateur2,120,1);
	      
	     
	      Eleve Eleve1=new Eleve(12222222,"Hamza","Dardour","Aymen","05/05/2019",120,"ibnrochd","kk",4040,"Monastir",99123123,"med","tt","aa",1,null);
	      Eleve Eleve2=new Eleve(13333333,"yahya","zaghdoudi","Fedi","12/07/1997",120,"krib","zouhour",4010,"Sousse",99888888,"medAli","bb","cc",2,null);
	      Eleve Eleve3=new Eleve(14444444,"asma","khlifir","hmidi","04/02/1996",120,"horria","hSousse",4040,"Monastir",99777777,"medsalah","cc","ww",3,null);
	     
	      Classe C1 = new Classe("A",null,null,null);
	     
	      listeAnimateurs.add(Animateur1);
	      listeAnimateurs.add(Animateur2);
	      
	      listeEleves.add(Eleve1);
	      listeEleves.add(Eleve2);
	      listeEleves.add(Eleve3);
	      listeActivites.add(Activite1);
	      listeActivites.add(Activite2);
	      listeActivites.add(Activite3);
	      listeActivites.add(Activite4);
	      
	      G.menu();
	}

	
	

}
