package Exercice1;

/**
 * Created by root on 10/11/16.
 */
public class Un extends Base {

    int c;
    public Un ( int y) {
        super(y) ; b = y -1 ; c = y/2 ;
    }

    public int valeur () {
        return c ;
    }

    public void afficher (){
        System.out.println(" Un " +b + " " + valeur());
    }
}
