package Client;

/**
 * Created by theXuser on 29/11/2016.
 */
public class Client {

    public static void main(String [] args){

        CalculeAproxPiService cp = new CalculeAproxPiService();

        double b = cp.getCalculeAproxPiPort().calculer(100);

        System.out.println("B"+b*4);

    }

}
