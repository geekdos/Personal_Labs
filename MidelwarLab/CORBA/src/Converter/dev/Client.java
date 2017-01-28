package Converter.dev;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 * Created by theXuser on 29/12/2016.
 */
public class Client {
    public static void main(String[] args) throws InvalidName, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound {
        ORB orb = ORB.init(args, null);
        //Utilisation du services de nomage
        NamingContextExt annaire  = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
        Euro euro = EuroHelper.narrow(annaire.resolve_str("Converter"));
        euro.Taux(10);
        euro.Devise("DH");
        System.out.println("Convert euro :"+euro.toEuro(10)+" "+euro.Devise());
    }
}
