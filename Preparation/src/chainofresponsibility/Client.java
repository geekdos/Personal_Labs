package chainofresponsibility;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args) {
        AbstractLink abstractLinkadd = new AdditionLink();
        AbstractLink abstractLinksub = new SubstrationLink();

        abstractLinkadd.setNextAbstractLink(abstractLinksub);
        abstractLinksub.setNextAbstractLink(null);

        abstractLinksub.respOperation(1, 2, '+');
    }
}
