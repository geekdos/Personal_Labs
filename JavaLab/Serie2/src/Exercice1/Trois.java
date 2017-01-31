package Exercice1;

/**
 * Created by root on 10/11/16.
 */
public class Trois extends Deux {

    public Trois(int w) {
        super(w);
        b = w;
    }

    public int valeur() {

        return 333;
    }

    public void afficher() {

        System.out.println(" trois " + b + " " + valeur());
    }
}
