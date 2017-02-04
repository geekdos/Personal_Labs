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
    private int id;
    private String titre;

    public Filiere(String titre) {
        this.titre = titre;
    }

    public int getId() {
        return id;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.titre);
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
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filiere{" + "id=" + id + ", titre=" + titre + '}';
    }
    
    
}
