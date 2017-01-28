/**
 * Created by theXuser on 02/12/2016.
 */
package com.geekdos.app;

import com.geekdos.client.*;

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

        oussama.getNotes().add(note1);
        oussama.getNotes().add(note2);
        dina.getNotes().add(note3);
        dina.getNotes().add(note4);
        ouail.getNotes().add(note5);
        ouail.getNotes().add(note6);
        ayoub.getNotes().add(note7);
        ayoub.getNotes().add(note8);

        GestionDesNotesService gestionDesNotesService = new GestionDesNotesService();
        gestionDesNotesService.getGestionDesNotesPort().ajouterEtudiant(oussama);
        gestionDesNotesService.getGestionDesNotesPort().ajouterEtudiant(dina);
        gestionDesNotesService.getGestionDesNotesPort().ajouterEtudiant(ouail);
        gestionDesNotesService.getGestionDesNotesPort().ajouterEtudiant(ayoub);

        String messsageOussama = "La moyenne des note de : "+ oussama.getNom() +" "+ oussama.getPrenom();
        messsageOussama += " Qui porte le CNE "+oussama.getCne();
        messsageOussama += " est : "+ gestionDesNotesService.getGestionDesNotesPort().getNote("KHACHIAI");

        String messsageOuail = "La moyenne des note de : "+ ouail.getNom() +" "+ ouail.getPrenom();
        messsageOuail += " Qui porte le CNE "+ouail.getCne();
        messsageOuail += " est : "+ gestionDesNotesService.getGestionDesNotesPort().getNote("KERDAD");

        String messsageDina = "La moyenne des note de : "+ dina.getNom() +" "+ dina.getPrenom();
        messsageDina += " Qui porte le CNE "+dina.getCne();
        messsageDina += " est : "+ gestionDesNotesService.getGestionDesNotesPort().getNote("BEN HALIMA");

        String messsageAyoub = "La moyenne des note de : "+ ayoub.getNom() +" "+ ayoub.getPrenom();
        messsageAyoub += " Qui porte le CNE "+ayoub.getCne();
        messsageAyoub += " est : "+ gestionDesNotesService.getGestionDesNotesPort().getNote("BOUCHAREB");

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

        gestionDesNotesService.getGestionDesNotesPort().saveEtudiants();

        /**
         * Pour affichier la liste des étudiants qu'en validé les module avec un moyenne sup a 12
         */

        System.out.println("-----------------------------------------------------");
        System.out.println("La liste des étudiant qu'en valider les modules");
        System.out.println("-----------------------------------------------------");

        for (Etudiant etudiant: gestionDesNotesService.getGestionDesNotesPort().getvalidation()) {

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

        for (Etudiant etudiant: gestionDesNotesService.getGestionDesNotesPort().getRat()) {

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

        for (Etudiant etudiant: gestionDesNotesService.getGestionDesNotesPort().getNonValidation()) {

            String message = "L'étudiant : "+etudiant.getNom();
            message += " à un non validé dans les modules ";
            for (int i = 0; i < etudiant.getNotes().size() ;i++) {
                message += "<<" + etudiant.getNotes().get(i).getName();
                message += ", " + etudiant.getNotes().get(i).getValue()+">> ";
            }
            System.out.println(message);
            System.out.println("-----------------------------------------------------");
        }

    }
}
