package chainofresponsibility;

/**
 * Created by theXuser on 1/29/2017.
 */
public class AdditionLink extends AbstractLink {
    private int sum = 0;

    @Override
    public int operation(int a, int b, char op) {
        if (op == '+')
            sum = a + b;
        else if (this.nextAbstractLink != null)
            this.nextAbstractLink.respOperation(a, b, op);
        else
            System.out.println("this operation is not allowed only + and - ");
        return sum;
    }
}
