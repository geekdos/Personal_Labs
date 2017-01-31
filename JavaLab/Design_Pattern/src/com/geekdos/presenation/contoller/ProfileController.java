package com.geekdos.presenation.contoller;

import com.geekdos.presenation.bootstrap.Bootstraper;
import com.geekdos.presenation.model.User;

public class ProfileController extends Controller {

    private User user = null;

    public ProfileController(Bootstraper bootstraper) {
        this.user = bootstraper.boot();
    }


    public String homeAction(String profileName) {
        String rendering;
        if (User.getUser().login() && this.showProfile(profileName) != null){
            rendering = "The user is Connected successfully\n";
            rendering += this.showProfile(profileName).render();
        }else
            rendering = "Ops !! You have a problem with your profile or your credentials";
        return rendering;
    }

}
