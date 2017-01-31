package com.geekdos.controle.common;

import com.geekdos.controle.observer.Observateur;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

/**
 * Created by theXuser on 1/1/2017.
 */
public abstract class IntegerSet {
    public Vector<Integer> integersList = new Vector<Integer>();
    public abstract void addElement(int element);

    public void deleteElement(int element){
        integersList.remove(element);
        notifier();
    }

    public void showAll(){
        for (Object o : integersList) {
            System.out.println(o);
        }
    }

    // Liste des observateurs
    private List<Observateur> listeObservateurs = new LinkedList<Observateur>();
    /**
     * Ajouter un observateur de la liste
     * @param pObservateur
     */
    public void ajouterObs(Observateur pObservateur) {
        listeObservateurs.add(pObservateur);
    }
    /**
     * Supprimer un observateur de la liste
     * @param pObservateur
     */
    public void supprimerObs(Observateur pObservateur) {
        listeObservateurs.remove(pObservateur);
    }
    /**
     * Notifier à tous les observateurs de la liste
     * que l'objet à été mis à jour.
     */
    protected void notifier() {
        for(Observateur lObservateur : listeObservateurs) {
            lObservateur.update();
        }
    }
}
