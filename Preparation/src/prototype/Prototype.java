package prototype;

/**
 * Created by theXuser on 1/29/2017.
 */
public abstract class Prototype implements Cloneable {
    protected String text;
    public Prototype(String text){
        this.text = text;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public void setText(String text) {
        this.text = text;
    }
    public abstract void afficher();

}
