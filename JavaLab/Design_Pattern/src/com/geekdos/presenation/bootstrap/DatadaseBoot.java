package com.geekdos.presenation.bootstrap;

import com.geekdos.presenation.model.User;

/**
 * Created by theXuser on 1/8/2017.
 */
public class DatadaseBoot extends Bootstraper {

    @Override
    public User boot() {
        System.out.println("We are booting from the database");
        return loadUser();
    }
}
