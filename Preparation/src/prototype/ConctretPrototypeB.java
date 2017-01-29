package prototype;

/**
 * Created by theXuser on 1/29/2017.
 */
public class ConctretPrototypeB extends Prototype {

    public ConctretPrototypeB(String text) {
        super(text);
    }

    @Override
    public void afficher() {
        System.out.println("ConcretePrototypeB avec texte : " + text);
    }
}
