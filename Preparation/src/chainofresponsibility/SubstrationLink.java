package chainofresponsibility;

/**
 * Created by theXuser on 1/29/2017.
 */
public class SubstrationLink extends AbstractLink {
    private int sub = 0;

    @Override
    public int operation(int a, int b, char op) {
        if (op == '-')
            sub = a - b;
        else
            this.nextAbstractLink.respOperation(a, b, op);
        return sub;
    }
}
