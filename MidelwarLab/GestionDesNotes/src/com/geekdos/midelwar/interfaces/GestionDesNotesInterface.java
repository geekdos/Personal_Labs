package com.geekdos.midelwar.interfaces;

import com.geekdos.model.Etudiant;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by theXuser on 11/12/2016.
 */
public interface GestionDesNotesInterface extends Remote {

    public List<Etudiant> ajouterEtudiant(Etudiant etudiant) throws RemoteException;
    public double getNote(String nom) throws RemoteException;
    public List<Etudiant> getvalidation() throws RemoteException;
    public List<Etudiant> getNonValidation() throws RemoteException;
    public List<Etudiant> getRat() throws RemoteException;
    public Etudiant getMajoran(List<Etudiant> les_etudiants) throws RemoteException;
    public void setLes_etudiants(List<Etudiant> les_etudiants) throws RemoteException;

}
