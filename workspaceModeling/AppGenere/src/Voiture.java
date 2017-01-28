/**
* Encadré par : M. Youness LAKHRISSI
* Réalisé par : Oussama KHACHIAI
* Date : 12/02/2017
*/

public class Voiture{

		//La liste des attributes
		private String marque;
 		private String model;
 
	//Le constructeur
	public Voiture(){
		
		//Initialisation
		this.marque = "";
		this.model = "";

	}

	//Le constructeur
	public Voiture(String marque, String model){
		this.marque = marque;
		this.model = model;

	}

	//La liste des getters
	public String getMarque(){
		return this.marque;
	}
 	public String getModel(){
		return this.model;
	}
 
	//La liste des setters
	public void setMarque(String marque){
		 this.marque = marque;
	}
 	public void setModel(String model){
		 this.model = model;
	}
 
	//Les oprerations

	public String demarer(Integer prix){
		return "";
	}
	public String arreter(){
		return "";
	}IN!Voiture

} // Fin de la class Voiture