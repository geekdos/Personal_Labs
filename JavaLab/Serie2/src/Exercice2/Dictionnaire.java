package Exercice2;

/**
 * Created by root on 10/11/16.
 */
public class Dictionnaire extends Document {

    private int nbrDifinition;

    public Dictionnaire(int reference, String titre, int nbrDifinition) {
        super(reference, titre);
        this.nbrDifinition = nbrDifinition;
    }

    public int getNbrDifinition() {
        return nbrDifinition;
    }

    public void setNbrDifinition(int nbrDifinition) {
        this.nbrDifinition = nbrDifinition;
    }
}
