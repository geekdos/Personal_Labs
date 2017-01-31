package com.geekdos.presenation.bootstrap;

import com.geekdos.presenation.model.User;

public abstract class Bootstraper {

    public User loadUser(){
        User user = User.getUser();
        user.setLastName("KHACHIAI");
        user.setFirstName("OUSSAMA");
        user.setEmail("oussama.khachiai@gmail.com");
        user.setUsername("admin");
        user.setPassword("admin");

        return user;
    }

    public abstract User boot();
}
