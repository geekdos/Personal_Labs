package abstractFactory;

/**
 * Created by theXuser on 1/29/2017.
 */
public class FabriqueFactoryA extends FabriqueFactory{

    @Override
    public AbstractClass creatClass() {
        return new ClassA();
    }
}
