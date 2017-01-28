package Converter.dev;

import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 * Created by theXuser on 29/12/2016.
 */
public class Server {
    public static void main(String[] args){
        try{
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            EuroImp euroImp = new EuroImp();
            Object objectRef = rootpoa.servant_to_reference(euroImp);
            Euro euroref = EuroHelper.narrow(objectRef);

            //Utilisation du services de nomage
            Object refAnnaire = orb.resolve_initial_references("NameService");
            NamingContextExt annaireDist  = NamingContextExtHelper.narrow(refAnnaire);

            //stockage de l'objet dans l'annuaire
            String nom = "Converter";
            annaireDist.rebind(annaireDist.to_name(nom), euroref);
            System.out.println("Server is ready...");
            orb.run();

        }catch (Exception e){

        }
    }
}
