package project;

import java.util.HashMap;
import java.util.Set;

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

	public void ajouteSomme(SommeArgent sa) {
		String laMonnaieDe_sa = sa.getUnite();
		Integer quantiteDansLaMonnaie = contenu.get(laMonnaieDe_sa);
		if (quantiteDansLaMonnaie == null) {
			contenu.put(laMonnaieDe_sa, sa.getQuantite());
		} else {
			Integer quantiteDejaDansLePorteMonnaie = contenu.get(laMonnaieDe_sa);
			Integer somme = quantiteDejaDansLePorteMonnaie + sa.getQuantite();
			contenu.put(laMonnaieDe_sa, somme);
		}
	}

	public String toString() {
		Set<String> lesCles = contenu.keySet();
		StringBuffer aAfficher = new StringBuffer("Contenu du porte monnaie :\n");
		for (String uneCle : lesCles) {
			aAfficher.append(contenu.get(uneCle) + " " + uneCle);
		}
		return aAfficher.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PorteMonnaie other = (PorteMonnaie) obj;
		if (contenu == null) {
			if (other.contenu != null)
				return false;
		} else if (!contenu.equals(other.contenu))
			return false;
		return true;
	}

}
