package classes;

public class Operations {
	public static long additionner(final long... pNombres) {
		long lRetour = 0;
		for (final long lNombre : pNombres) {
			lRetour += lNombre;
		}
		return lRetour;
	}

	// Cette méthode ne fonctionne pas correctement
	// Les tests vont le vérifier
	public static long multiplier(final long... pNombres) {
		long lRetour = 1;
		for (final long lNombre : pNombres) {
			lRetour *= lNombre;
		}
		return lRetour;
	}

	public static long diviser(final long... pNombres) {
		if (pNombres.length < 2) {
			throw new IllegalArgumentException("Il faut au moins deux nombres en entrée");
		}
		long lRetour = pNombres[0];
		for (int i = 1; i < pNombres.length; i++) {
			lRetour /= pNombres[i];
		}
		return lRetour;
	}
}
