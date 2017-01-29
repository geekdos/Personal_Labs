package bridge;

/**
 * Created by theXuser on 1/29/2017.
 */
public abstract class Abstraction {
    Implimentation implimentation;

    public Abstraction(Implimentation implimentation) {
        this.implimentation = implimentation;
    }

    public abstract void operation();
}
