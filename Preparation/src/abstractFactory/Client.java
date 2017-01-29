package abstractFactory;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args){

        AbstractFactory abstractFactoryA = new FabriqueFactoryA();
        AbstractFactory abstractFactoryB = new FabriqueFactoryB();
        AbstractClass classA = abstractFactoryA.creatClass();
        AbstractClass classB = abstractFactoryB.creatClass();

        classA.affcher();
        classB.affcher();
    }
}
