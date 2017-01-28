package app;

import msg.Messenger;
import msg.MessengerPOATie;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 * Created by theXuser on 1/12/2017.
 */
public class Server {
    public static void main(String[] args){
        try{
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            MessengerImpl messenger = new MessengerImpl();
            MessengerPOATie messengerPOATie = new MessengerPOATie(messenger, rootpoa);
            Messenger messengerRef = messengerPOATie._this(orb);
            //Utilisation du services de nomage
            NamingContextExt annaireDist  = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));

            //stockage de l'objet dans l'annuaire
            String nom = "Messenger";
            annaireDist.rebind(annaireDist.to_name(nom), messengerRef);
            System.out.println("app.Server is ready...");
            orb.run();

        }catch (Exception e){

        }
    }
}
