/**
 * Created by theXuser on 02/12/2016.
 */
package com.geekdos.midelwar;

import com.geekdos.midelwar.interfaces.GestionDesNotesInterface;
import com.geekdos.model.Etudiant;
import com.geekdos.model.Note;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class GestionDesNotes extends UnicastRemoteObject implements GestionDesNotesInterface {
    public List<Etudiant> les_etudiants = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_non_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_rat = new ArrayList<Etudiant>();

    public GestionDesNotes() throws RemoteException {

    }

    public void setLes_etudiants(List<Etudiant> les_etudiants) {
        this.les_etudiants = les_etudiants;
    }

    public List ajouterEtudiant(Etudiant etudiant){
        les_etudiants.add(etudiant);

        return les_etudiants;
    }

    public double getNote(String nom){
        double note = 0;

        for (Etudiant etudiant: les_etudiants) {
            if (nom.equals(etudiant.getNom())) {
                note = calculeMoyenne(etudiant);
            }
        }
        return note;
    }

    public Etudiant getMajoran(List<Etudiant> les_etudiants){
        double note = 0;double max = 0;
        Etudiant magoron = null;

        for (Etudiant etudiant: les_etudiants) {
            note = calculeMoyenne(etudiant);
            if (note > max){
                max = note;
                magoron = etudiant;
            }
        }
        return magoron;
    }

    public List<Etudiant> getvalidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 12)
                les_etudiants_valide.add(etudiant);
        }
        return  les_etudiants_valide;
    }

    public List<Etudiant> getNonValidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) < 7)
                les_etudiants_non_valide.add(etudiant);
        }
        return  les_etudiants_non_valide;
    }

    public List<Etudiant> getRat(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 7 && calculeMoyenne(etudiant) < 12)
                les_etudiants_rat.add(etudiant);
        }
        return  les_etudiants_rat;
    }


    private double calculeMoyenne(Etudiant etudiant){
        int nbrNotes = etudiant.getNotes().size();
        double sommeNotes = this.calculeSomme(etudiant.getNotes());

        return sommeNotes / nbrNotes;
    }

    private double calculeSomme(List<Note> notes){
        double somme = 0;
        for (Note note: notes) {
            somme += note.getValue();
        }
        return somme;
    }
}
