package com.geekdos.app;

import com.geekdos.midelwar.interfaces.GestionDesNotesInterface;
import com.geekdos.model.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by theXuser on 11/12/2016.
 */
public class App {
    public static void main(String[] args){
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenue dans l'application Gestion des Notes Client");
        System.out.println("-----------------------------------------------------");

        Etudiant oussama = new Etudiant();
        Etudiant dina = new Etudiant();
        Etudiant ouail = new Etudiant();
        Etudiant ayoub = new Etudiant();
        Etudiant yassin = new Etudiant();
        Etudiant halima = new Etudiant();

        oussama.setNom("KHACHIAI");oussama.setPrenom("Oussama");oussama.setCne("1128764379");oussama.setAge(25);
        dina.setNom("BEN HALIMA");dina.setPrenom("Dina");dina.setCne("1228764379");dina.setAge(21);
        ouail.setNom("KERDAD");ouail.setPrenom("Ouail");ouail.setCne("1028764379");ouail.setAge(25);
        ayoub.setNom("BOUCHAREB");ayoub.setPrenom("Ayoub");ayoub.setCne("1228764380");ayoub.setAge(25);
        yassin.setNom("AKESBI");yassin.setPrenom("Yassin");yassin.setCne("1228764385");yassin.setAge(23);
        halima.setNom("BOUJRA");halima.setPrenom("Halima");halima.setCne("1228764386");halima.setAge(23);

        Note note1 = new Note();Note note2 = new Note();
        Note note3 = new Note();Note note4 = new Note();
        Note note5 = new Note();Note note6 = new Note();
        Note note7 = new Note();Note note8 = new Note();
        Note note9 = new Note();Note note10 = new Note();
        Note note11 = new Note();Note note12 = new Note();
        Note note13 = new Note();Note note14 = new Note();

        note1.setName("M1");note2.setName("M2");
        note3.setName("M3");note4.setName("M4");
        note5.setName("M5");note6.setName("M6");
        note7.setName("M7");note8.setName("M8");
        note9.setName("M9");note10.setName("M10");
        note11.setName("M11");note12.setName("M12");
        note13.setName("M13");note14.setName("M14");

        note1.setValue(18);note2.setValue(18);
        note3.setValue(17);note4.setValue(17);
        note5.setValue(15);note6.setValue(15);
        note7.setValue(15);note8.setValue(10);
        note9.setValue(10);note10.setValue(10);
        note11.setValue(8);note12.setValue(5);
        note13.setValue(12);note14.setValue(7);

        List<Note> oussamaNotes = new ArrayList<Note>();
        List<Note> dinaNotes = new ArrayList<Note>();
        List<Note> ouailNotes = new ArrayList<Note>();
        List<Note> ayoubNotes = new ArrayList<Note>();
        oussamaNotes.add(note1);
        oussamaNotes.add(note2);
        dinaNotes.add(note3);
        dinaNotes.add(note4);
        ouailNotes.add(note5);
        ouailNotes.add(note6);
        ayoubNotes.add(note7);
        ayoubNotes.add(note8);

        oussama.setNotes(oussamaNotes);
        dina.setNotes(dinaNotes);
        ouail.setNotes(ouailNotes);
        ayoub.setNotes(ayoubNotes);
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(oussama);
        etudiants.add(dina);
        etudiants.add(ouail);
        etudiants.add(ayoub);
        try {
            Remote gestionDesNotes = Naming.lookup("rmi://169.254.12.27/GestionDesNotes");

            ((GestionDesNotesInterface) gestionDesNotes).setLes_etudiants(etudiants);

            String messsageOussama = "La moyenne des note de : "+ oussama.getNom() +" "+ oussama.getPrenom();
            messsageOussama += " Qui porte le CNE "+oussama.getCne();
            messsageOussama += " est : "+ ((GestionDesNotesInterface) gestionDesNotes).getNote("KHACHIAI");

            String messsageOuail = "La moyenne des note de : "+ ouail.getNom() +" "+ ouail.getPrenom();
            messsageOuail += " Qui porte le CNE "+ouail.getCne();
            messsageOuail += " est : "+ ((GestionDesNotesInterface) gestionDesNotes).getNote("KERDAD");

            String messsageDina = "La moyenne des note de : "+ dina.getNom() +" "+ dina.getPrenom();
            messsageDina += " Qui porte le CNE "+dina.getCne();
            messsageDina += " est : "+ ((GestionDesNotesInterface) gestionDesNotes).getNote("BEN HALIMA");

            String messsageAyoub = "La moyenne des note de : "+ ayoub.getNom() +" "+ ayoub.getPrenom();
            messsageAyoub += " Qui porte le CNE "+ayoub.getCne();
            messsageAyoub += " est : "+ ((GestionDesNotesInterface) gestionDesNotes).getNote("BOUCHAREB");

            /**
             * Pour affichier la liste des étudiants qui sont enregistrer avec leur note du moyenne
             */
            System.out.println("-----------------------------------------------------");
            System.out.println("La liste des étudiants enregistrer");
            System.out.println("-----------------------------------------------------");
            System.out.println(messsageOussama);
            System.out.println(messsageDina);
            System.out.println(messsageOuail);
            System.out.println(messsageAyoub);

            System.out.println("-----------------------------------------------------");
            System.out.println("L'etudiant magoron est:");
            System.out.println("-----------------------------------------------------");
            String nomMagoron = ((GestionDesNotesInterface) gestionDesNotes).getMajoran(etudiants).getNom();
            System.out.println("L'etudiant Majoran est : "+nomMagoron);
            /**-------------------------------
             * Pour affichier la liste des étudiants qu'en validé les module avec un moyenne sup a 12
             */
            System.out.println("-----------------------------------------------------");
            System.out.println("La liste des étudiant qu'en valider les modules");
            System.out.println("-----------------------------------------------------");

            for (Etudiant etudiant: ((GestionDesNotesInterface) gestionDesNotes).getvalidation()) {

                String message = "L'étudiant : "+etudiant.getNom();
                message += " à validé les modules ";
                for (int i = 0; i < etudiant.getNotes().size() ;i++) {
                    message += "<<" + etudiant.getNotes().get(i).getName();
                    message += ", " + etudiant.getNotes().get(i).getValue()+">> ";
                }
                System.out.println(message);
                System.out.println("-----------------------------------------------------");
            }

            /**
             * Pour affichier la liste des étudiants qu'en un ratrapage dans des module avec un 12 < moyenne >= 7
             */

            System.out.println("-----------------------------------------------------");
            System.out.println("La liste des étudiant qu'en ratrapage");
            System.out.println("-----------------------------------------------------");

            for (Etudiant etudiant: ((GestionDesNotesInterface) gestionDesNotes).getRat()) {

                String message = "L'étudiant : "+etudiant.getNom();
                message += " à un ratrapage dans les modules ";
                for (int i = 0; i < etudiant.getNotes().size() ;i++) {
                    message += "<<" + etudiant.getNotes().get(i).getName();
                    message += ", " + etudiant.getNotes().get(i).getValue()+">> ";
                }
                System.out.println(message);
                System.out.println("-----------------------------------------------------");
            }

            /**
             * Pour affichier la liste des étudiants qu'en un non validé dans des module avec un moyenne < 7
             */

            System.out.println("-----------------------------------------------------");
            System.out.println("La liste des étudiant qu'en non validé");
            System.out.println("-----------------------------------------------------");

            for (Etudiant etudiant: ((GestionDesNotesInterface) gestionDesNotes).getNonValidation()) {

                String message = "L'étudiant : "+etudiant.getNom();
                message += " à eu une    non validé dans les modules ";
                for (int i = 0; i < etudiant.getNotes().size() ;i++) {
                    message += "<<" + etudiant.getNotes().get(i).getName();
                    message += ", " + etudiant.getNotes().get(i).getValue()+">> ";
                }
                System.out.println(message);
                System.out.println("-----------------------------------------------------");
            }

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
