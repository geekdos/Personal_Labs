package com.geekdos.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by theXuser on 02/12/2016.
 */
public class Etudiant implements Serializable {
    private String nom;
    private String prenom;
    private String cne;
    private int age;
    private List<Note> notes;

    public Etudiant() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Le nom est : "+getNom()+" "+ getPrenom();
    }
}
