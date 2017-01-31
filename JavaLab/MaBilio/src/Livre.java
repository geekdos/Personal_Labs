
public class Livre {
	
	private String nom;
	private boolean emprunter = false;
	
	public Livre(String nom){
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isEmprunter() {
		return emprunter;
	}

	public void setEmprunter(boolean emprunter) {
		this.emprunter = emprunter;
	}
	
	public void emprunter(){
		this.emprunter = true;
	}
	
	public void rendre(){
		this.emprunter = false;
	}

}
