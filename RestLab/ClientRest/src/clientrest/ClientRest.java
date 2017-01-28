/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrest;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author theXuser
 */
public class ClientRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c = ClientBuilder.newClient();
        String link = "http://localhost:8080/ConverterRest/webresources";
        WebTarget webTarget = c.target(link);
        WebTarget web = webTarget.path("ConverterRest");
        WebTarget convetreToEuro = web.path("todh").queryParam("ero", 20000).queryParam("taux", 10);
        Response response = convetreToEuro.request(MediaType.TEXT_PLAIN).get();
        System.out.println(response.readEntity(String.class));
    }
    
}
