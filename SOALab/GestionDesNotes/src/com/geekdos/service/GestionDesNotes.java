package com.geekdos.service;

import com.geekdos.model.DAO.EtudianDAO;
import com.geekdos.model.Etudiant;
import com.geekdos.model.Note;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by theXuser on 02/12/2016.
 */
@WebService
public class GestionDesNotes {

    public List<Etudiant> les_etudiants = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_non_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_rat = new ArrayList<Etudiant>();

    @WebMethod
    public List ajouterEtudiant(Etudiant etudiant){
        les_etudiants.add(etudiant);

        return les_etudiants;
    }

    @WebMethod
    public double getNote(String nom){
        double note = 0;

        for (Etudiant etudiant: les_etudiants) {
            if (nom.equals(etudiant.getNom())) {
                note = calculeMoyenne(etudiant);
            }
        }
        return note;
    }

    @WebMethod
    public List<Etudiant> getvalidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 12)
                les_etudiants_valide.add(etudiant);
        }
        return  les_etudiants_valide;
    }

    @WebMethod
    public List<Etudiant> getNonValidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) < 7)
                les_etudiants_non_valide.add(etudiant);
        }
        return  les_etudiants_non_valide;
    }

    @WebMethod
    public List<Etudiant> getRat(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 7 && calculeMoyenne(etudiant) < 12)
                les_etudiants_rat.add(etudiant);
        }
        return  les_etudiants_rat;
    }

    @WebMethod
    public void saveEtudiants(){
        EtudianDAO etudianDAO = new EtudianDAO();
        for (Etudiant etudiant: les_etudiants) {
            etudianDAO.save(etudiant);
        }
    }

    @WebMethod
    public void getAllEtudiants(){
        EtudianDAO etudianDAO = new EtudianDAO();
        for (Etudiant etudiant: les_etudiants) {
            etudianDAO.save(etudiant);
        }
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
