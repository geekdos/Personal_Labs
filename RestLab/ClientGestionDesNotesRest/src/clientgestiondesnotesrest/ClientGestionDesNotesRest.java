/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientgestiondesnotesrest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author theXuser
 */
public class ClientGestionDesNotesRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c = ClientBuilder.newClient();
        String link = "http://localhost:8080/GestionDesNotesRest/webresources";
        WebTarget webTarget = c.target(link);
        WebTarget web = webTarget.path("GestionDesNotesRest");
        
        WebTarget convetreToEuro = web.path("ajouter_etudiants").queryParam("etudiant", 12);
        Response response = convetreToEuro.request(MediaType.TEXT_PLAIN).get();
        System.out.println(response.readEntity(String.class));
    }
    
}
