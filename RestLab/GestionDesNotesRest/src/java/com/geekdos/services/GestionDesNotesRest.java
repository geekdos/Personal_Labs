/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekdos.services;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.geekdos.model.*;

/**
 * REST Web Service
 *
 * @author theXuser
 */
@Path("GestionDesNotesRest")
public class GestionDesNotesRest {
    public List<Etudiant> les_etudiants = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_non_valide = new ArrayList<Etudiant>();
    public List<Etudiant> les_etudiants_rat = new ArrayList<Etudiant>();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GestionDesNotesRest
     */
    public GestionDesNotesRest() {
    }

    @GET
    @Path("ajouter_etudiants")
    @Produces(MediaType.TEXT_PLAIN)
    public List ajouterEtudiant(@QueryParam("etudiant") Etudiant etudiant){
        les_etudiants.add(etudiant);
        return les_etudiants;
    }
    
    @GET
    @Path("note_par_nom")
    @Produces(MediaType.TEXT_PLAIN)
    public double getNote(@QueryParam("nom") String nom){
        double note = 0;
        for (Etudiant etudiant: les_etudiants) {
            if (nom.equals(etudiant.getNom())) {
                note = calculeMoyenne(etudiant);
            }
        }
        return note;
    }

    @GET
    @Path("les_etudiants_valide")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Etudiant> getValidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 12)
                les_etudiants_valide.add(etudiant);
        }
        return  les_etudiants_valide;
    }
    
    @GET
    @Path("les_etudiants_rat")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Etudiant> getRat(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) >= 7 && calculeMoyenne(etudiant) < 12)
                les_etudiants_rat.add(etudiant);
        }
        return  les_etudiants_rat;
    }
    
    @GET
    @Path("les_etudiants_non_valide")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Etudiant> getNonValidation(){
        for (Etudiant etudiant : les_etudiants) {
            if (calculeMoyenne(etudiant) < 7)
                les_etudiants_non_valide.add(etudiant);
        }
        return  les_etudiants_non_valide;
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
