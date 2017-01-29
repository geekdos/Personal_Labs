package bridge;

public class ImplimentationA extends Implimentation {
    @Override
    public void doOperation1(String a) {
        System.out.println("La taille de cette chaine est : "+a.length());
    }

    @Override
    public void doOperation2(int a, int b) {
        System.out.println("Le resulta de la multiplication est :"+ a*b);
    }
}
