package abstractFactory;

/**
 * Created by theXuser on 1/29/2017.
 */
public class FabriqueFactoryB extends AbstractFactory {
    @Override
    public AbstractClass creatClass() {
        return new ClassB();
    }
}
