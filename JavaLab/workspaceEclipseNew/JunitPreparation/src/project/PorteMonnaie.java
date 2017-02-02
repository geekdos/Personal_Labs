package project;

import java.util.HashMap;

public class PorteMonnaie {
	HashMap<String, Integer> contenu;

	
	
	public PorteMonnaie() {
		this.contenu = new HashMap<String, Integer>();
	}

	public HashMap<String, Integer> getContenu() {
		return contenu;
	}

	public void setContenu(HashMap<String, Integer> contenu) {
		this.contenu = contenu;
	}
	
	
}
