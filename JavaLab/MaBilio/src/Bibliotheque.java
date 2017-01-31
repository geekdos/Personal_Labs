import java.util.HashMap;

public class Bibliotheque {


	private HashMap<String, Livre> livres;
	
	public Bibliotheque(){
		livres = new HashMap<String, Livre>();
	}

	public HashMap<String, Livre> getLivres() {
		return livres;
	}

	public void setLivres(HashMap<String, Livre> livres) {
		this.livres = livres;
	}
	
	public void ajouterLivre(String nom){
		Livre l = new Livre(nom);
		
		livres.put(nom, l);
	}
	
	public void emprunterLivre(String nom){
		Livre l = livres.get(nom);
		l.emprunter();
	}
	
	public void rendreLivre(String nom){
		Livre l = livres.get(nom);
		l.rendre();
	}


	
	
}
