package com.geekdos.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Halima {

    @WebMethod
    public void sayChirira(){
        System.out.println("Hakima DAOUDI is chirira :p ");
    }
}
