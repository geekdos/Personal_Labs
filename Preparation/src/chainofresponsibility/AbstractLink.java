package chainofresponsibility;

/**
 * Created by theXuser on 1/29/2017.
 */
public abstract class AbstractLink {

    AbstractLink nextAbstractLink;

    public void setNextAbstractLink(AbstractLink nextAbstractLink) {
        this.nextAbstractLink = nextAbstractLink;
    }
    public abstract int operation(int a, int b, char op);
    public void respOperation(int a, int b, char op){
        if (operation(a, b, op) != 0)
            System.out.println("Operation is : "+a+" "+op+" "+b+" = "+operation(a, b, op));
    }
}
