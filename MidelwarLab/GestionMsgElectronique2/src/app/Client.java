package app;

import msg.Date;
import msg.Message;
import msg.Messenger;
import msg.MessengerHelper;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 * Created by theXuser on 1/12/2017.
 */
public class Client {
    public static void main(String[] args) throws InvalidName, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, NotFound {
        ORB orb = ORB.init(args, null);
        //Utilisation du services de nomage
        NamingContextExt annaire  = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
        Messenger messenger = MessengerHelper.narrow(annaire.resolve_str("Messenger"));

        Date date = new Date(2017, 02, 12, 11, 12, 53);
        Message message = new Message("Hakima", "Reclamation", "JE recleme", date);

        messenger.signup();
        messenger.submit(1, message);
        System.out.print("Le message est : "+messenger.consult(1));

    }
}
