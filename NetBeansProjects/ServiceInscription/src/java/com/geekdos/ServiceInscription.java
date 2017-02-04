/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekdos;

import com.geekdos.beans.Etudiant;
import com.geekdos.beans.Filiere;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.jws.Oneway;

/**
 *
 * @author theXuser
 */
@WebService(serviceName = "ServiceInscription")
@Stateless()
public class ServiceInscription {

    /**
     * Web service operation
     * @param etudiant
     * @param filiere
     * @return 
     */
    @WebMethod(operationName = "ajouter")
    public int ajouter(@WebParam(name = "etudiant") Etudiant etudiant, @WebParam(name = "filiere") Filiere filiere) {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     * @param cne
     * @return 
     */
    @WebMethod(operationName = "supprimer")
    public boolean supprimer(@WebParam(name = "cne") String cne) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     * @param cne
     * @return 
     */
    @WebMethod(operationName = "MettreAJour")
    public boolean MettreAJour(@WebParam(name = "cne") String cne) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "afficher")
    @Oneway
    public void afficher() {
    }


}
