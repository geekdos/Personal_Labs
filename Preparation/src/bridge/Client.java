package bridge;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args) {

        Implimentation implimentationA = new ImplimentationA();
        Implimentation implimentationB = new ImplimentationB();

        Abstraction abstractionAA = new AbstractionA(implimentationA);
        Abstraction abstractionAB = new AbstractionA(implimentationB);
        Abstraction abstractionBA = new AbstractionB(implimentationA);
        Abstraction abstractionBB = new AbstractionB(implimentationB);

        //abstractionAA.operation();
        //abstractionAB.operation();
        //abstractionBA.operation();
        abstractionBB.operation();

    }
}
