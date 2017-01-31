package Exercice2;

/**
 * Created by root on 10/11/16.
 */
public class Livre extends Document {
    private String auteur;
    private int nbrPages;

    public Livre(int reference, String titre, String auteur, int nbrPages) {
        super(reference, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }
}
