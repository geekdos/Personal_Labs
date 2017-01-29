package abstractFactory;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args){

        FabriqueFactory fabriqueFactoryA = new FabriqueFactoryA();
        FabriqueFactory fabriqueFactoryB = new FabriqueFactoryB();
        AbstractClass classA = fabriqueFactoryA.creatClass();
        AbstractClass classB = fabriqueFactoryB.creatClass();

        classA.affcher();
        classB.affcher();
    }
}
