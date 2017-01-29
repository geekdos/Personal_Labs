package prototype;

/**
 * Created by theXuser on 1/29/2017.
 */
public class ConctretPrototypeA extends Prototype {

    public ConctretPrototypeA(String text) {
        super(text);
    }

    @Override
    public void afficher() {
        System.out.println("ConcretePrototypeA avec texte : " + text);
    }
}
