package composit;

/**
 * Created by theXuser on 1/29/2017.
 */
// On va créer l'arborescence :
// lComposite1
//      - lElement1
//      - lComposite2
//          - lComposite3
//              - lElement3
//              - lElement4
//          - lComposite4
//              - lComposite5
//                  - lElement5
//      - lElement2
public class Client {
    public static void main(String[] args) {
        Composit composit1 = new Composit("composit1");
        Composit composit2 = new Composit("composit2");
        Composit composit3 = new Composit("composit3");
        Composit composit4 = new Composit("composit4");
        Composit composit5 = new Composit("composit5");

        LElement element1 = new LElement("element1");
        LElement element2 = new LElement("element2");
        LElement element3 = new LElement("element3");
        LElement element4 = new LElement("element4");
        LElement element5 = new LElement("element5");


    }
}
