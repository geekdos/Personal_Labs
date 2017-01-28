/**
* Encadré par : M. Youness LAKHRISSI
* Réalisé par : Oussama KHACHIAI
* Date : 12/02/2017
*/

public class Personne{

		//La liste des attributes
		protected String nom;
 		protected String prenom;
 		protected int age;
 
	//Le constructeur
	public Personne(){
		
		//Initialisation
		this.nom = "";
		this.prenom = "";
		this.age = 0;

	}

	//Le constructeur
	public Personne(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;

	}

	//La liste des getters
	public String getNom(){
		return this.nom;
	}
 	public String getPrenom(){
		return this.prenom;
	}
 	public int getAge(){
		return this.age;
	}
 
	//La liste des setters
	public void setNom(String nom){
		 this.nom = nom;
	}
 	public void setPrenom(String prenom){
		 this.prenom = prenom;
	}
 	public void setAge(int age){
		 this.age = age;
	}
 
	//Les oprerations
IN!Personne

} // Fin de la class Personne