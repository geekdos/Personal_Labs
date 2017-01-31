package com.geekdos.presenation;

import com.geekdos.presenation.bootstrap.DatadaseBoot;
import com.geekdos.presenation.bootstrap.FileBoot;
import com.geekdos.presenation.contoller.ProfileController;
import com.sun.corba.se.impl.orb.DataCollectorBase;

public class  App {
    public static void main(String[] args) {

        System.out.println("Welcome To my Solution Presentation");
        ProfileController profileController = new ProfileController(new DatadaseBoot());

        System.out.println(profileController.homeAction("twitter"));
    }
}