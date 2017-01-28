/**
 * Created by theXuser on 1/14/2017.
 */
public class UniteDistincteException extends Exception {
    private SommeArgent somme1, somme2;

    public UniteDistincteException(SommeArgent sa1, SommeArgent sa2) {
        somme1 = sa1;
        somme2 = sa2;
    }

    public String toString() {
        return "The unite of  : " + somme1.getUnite() + " is != " + somme2.getUnite();
    }

}
