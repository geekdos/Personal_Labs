package prototype;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototypeA = new ConctretPrototypeA("Text du A");
        Prototype prototypeB = new ConctretPrototypeB("Text du B");

        try {
            Prototype prototypeCloneA = prototypeA.clone();
            Prototype prototypeCloneB = prototypeB.clone();
            prototypeCloneA.afficher();
            prototypeCloneB.afficher();
            prototypeCloneA.setText("Le clone c fait");
            prototypeCloneB.setText("Le clone c fait");
            prototypeA.afficher();
            prototypeCloneA.afficher();
            prototypeB.afficher();
            prototypeCloneB.afficher();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
