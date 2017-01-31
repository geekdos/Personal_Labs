
public class app {

	public static void main(String[] args) {
		
		Bibliotheque biblio = new Bibliotheque();
		int i = 1;
		
		biblio.ajouterLivre("Java POO");
		biblio.emprunterLivre("Java POO");
		
		biblio.ajouterLivre("Initialisation PHP7");
		
		System.out.println("Tous s'est bient passé");
				
		for (Livre livre : biblio.getLivres().values()) {
			System.out.println("Le nom du livre "+ i++ +" est : "+livre.getNom());
			System.out.print("Ce livre est : ");
			if(!livre.isEmprunter())
				System.out.println("Disponible");
			else
				System.out.println("Emprunter");	
			System.out.println("************************************");
		}

	}

}
