package geekdos;

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
        GestionNotesInterface notesManager = GestionNotesInterfaceHelper.narrow(annaire.resolve_str("NotesManager"));

        Etudiant student1 = new Etudiant();
        Etudiant student2 = new Etudiant();
        student1.nom = "oussama";
        student1.prenom = "KHACHIAI";
        student1.cne = "1128764379";
        student1.note1 = 15;
        student1.note2 = 17;
        student2.nom = "Fatima Zohra";
        student2.prenom = "Bounif";
        student2.cne = "1129812888";
        student2.note1 = 16;
        student2.note2 = 18;

        notesManager.ajouterEtudiant(student1);
        notesManager.ajouterEtudiant(student2);

        float note = notesManager.getNote("1129812820");

        System.out.println("La note de l'etudiant : 1129812820 est : " + note);
        System.out.println("Le majoran est : " + notesManager.getMajorant().nom);

        System.out.println("La liste des Etudiants trie");
        for (Etudiant etudiant: notesManager.getEtudiantsTries()) {
            System.out.println(etudiant.nom+" "+etudiant.prenom);
        }
    }
}
