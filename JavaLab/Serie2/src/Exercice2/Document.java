package Exercice2;

/**
 * Created by root on 10/11/16.
 */
public class Document {
    private int reference;
    private String titre;

    public Document(int reference, String titre) {
        this.reference = reference;
        this.titre = titre;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
