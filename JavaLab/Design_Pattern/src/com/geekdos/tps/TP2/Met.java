/**
 * Created by theXuser on 28/11/2016.
 */

package com.geekdos.tps.TP2;

public abstract class Met {

    private String nom;

    public abstract boolean estSucre();

    public abstract boolean estSale();

    public boolean estSucreSale(){
        return estSucre() && estSale();
    }

    public abstract int nomberDeCalories();

    public boolean estDietetique(){
        return nomberDeCalories() < 200;
    }

    @Override
    public String toString() {
        String message = "Met : "+ nom +"Sucre : "+ (estSucre() ? "oui" : "Non");
        message += "Sale: "+(estSale() ? "Oui" : "Non");
        message += "Sale et Suce: "+(estSucreSale() ? "Oui" : "Non");
        message += "Le nomber de Calorie:"+nomberDeCalories();
        message += "Est Dietetique: "+ (estDietetique() ? "Oui" : "Non");

        return message;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
