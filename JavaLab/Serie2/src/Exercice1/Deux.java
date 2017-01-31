package Exercice1;

/**
 * Created by root on 10/11/16.
 */
public class Deux extends Base {

    int d;

    public Deux(int z) {
        super(z);
        b = z + 1;
        d = z * 2;
    }

    public int valeur() {
        return d;
    }

    public void afficher() {
        System.out.println(" Deux " + b + " " + valeur());
    }
}
