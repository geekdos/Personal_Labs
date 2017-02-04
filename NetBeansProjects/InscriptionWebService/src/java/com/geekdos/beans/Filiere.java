/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekdos.beans;

import java.util.Objects;

/**
 *
 * @author theXuser
 */
public class Filiere {
    private String Titre;

    public Filiere(String Titre) {
        this.Titre = Titre;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Titre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filiere other = (Filiere) obj;
        if (!Objects.equals(this.Titre, other.Titre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filiere{" + "Titre=" + Titre + '}';
    }
   
}
