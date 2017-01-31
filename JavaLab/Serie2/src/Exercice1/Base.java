package Exercice1;

/**
 * Created by root on 10/11/16.
 */
public class Base {

    int a;
    protected int b;


    public Base ( int x) {
        a =x ; b = 0 ;
    }

    int valeur () {

        return a;
    }

    void afficher () {
        System.out.println(" Base " + a );
    }
}
