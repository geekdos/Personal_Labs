/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensaf.geekdos.beans;

import java.util.Objects;

/**
 *
 * @author theXuser
 */
public class Filiere {
    private int id;
    private String lebele;

    public Filiere(String lebele) {
        this.lebele = lebele;
    }

    public Filiere() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLebele() {
        return lebele;
    }

    public void setLebele(String lebele) {
        this.lebele = lebele;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.lebele);
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
        if (!Objects.equals(this.lebele, other.lebele)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filiere{" + "id=" + id + ", lebele=" + lebele + '}';
    }
  
}
