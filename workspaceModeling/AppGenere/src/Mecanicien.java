/**
* Encadré par : M. Youness LAKHRISSI
* Réalisé par : Oussama KHACHIAI
* Date : 12/02/2017
*/

public class Mecanicien{

		//La liste des attributes
		public Panne panne;
 		public PiecesDeRechange piecesDeRechange;
 
	//Le constructeur
	public Mecanicien(){
		
		//Initialisation

	}

	//Le constructeur
	public Mecanicien(Panne panne, PiecesDeRechange piecesDeRechange){
		this.panne = panne;
		this.piecesDeRechange = piecesDeRechange;

	}

	//La liste des getters
	public Panne getPanne(){
		return this.panne;
	}
 	public PiecesDeRechange getPiecesderechange(){
		return this.piecesDeRechange;
	}
 
	//La liste des setters
	public void setPanne(Panne panne){
		 this.panne = panne;
	}
 	public void setPiecesderechange(PiecesDeRechange piecesDeRechange){
		 this.piecesDeRechange = piecesDeRechange;
	}
 
	//Les oprerations
IN!Mecanicien

} // Fin de la class Mecanicien