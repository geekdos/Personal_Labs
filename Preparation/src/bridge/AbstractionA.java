package bridge;

/**
 * Created by theXuser on 1/29/2017.
 */

public class AbstractionA extends Abstraction {

    public AbstractionA(Implimentation implimentation) {
        super(implimentation);
    }

    @Override
    public void operation() {
        this.implimentation.doOperation1("A");
        this.implimentation.doOperation2(2, 5);
        this.implimentation.doOperation1("CBC");
    }
}
