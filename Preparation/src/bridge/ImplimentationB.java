package bridge;

/**
 * Created by theXuser on 1/29/2017.
 */
public class ImplimentationB extends Implimentation {
    @Override
    public void doOperation1(String a) {
        System.out.println("La chaine est : "+a);
    }

    @Override
    public void doOperation2(int a, int b) {
        System.out.println("Le resulta de la somme est :"+ a+b);
    }
}
