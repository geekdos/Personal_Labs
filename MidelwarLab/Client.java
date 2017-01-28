package com.geekdos.app.corba.dev;

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
        NotesManager notesManager = NotesManagerHelper.narrow(annaire.resolve_str("NotesManager"));

        Student student1 = new Student();
        Student student2 = new Student();
        student1.firstName = "oussama";
        student1.lastName = "KHACHIAI";
        student1.cne = "1128764379";
        student1.noteElement1 = 15;
        student1.noteElement2 = 17;
        student2.firstName = "Fatima Zohra";
        student2.lastName = "Bounif";
        student2.cne = "1129812820";
        student2.noteElement1 = 16;
        student2.noteElement2 = 18;

        notesManager.addStudent(student1);
        notesManager.addStudent(student2);

        float note = notesManager.getNote("1129812820");
    }
}
