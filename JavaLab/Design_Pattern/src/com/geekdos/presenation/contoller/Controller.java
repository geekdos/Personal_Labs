package com.geekdos.presenation.contoller;

import com.geekdos.presenation.view.ProfileFacebook;
import com.geekdos.presenation.view.ProfileGooglePlus;
import com.geekdos.presenation.view.ProfileTwitter;
import com.geekdos.presenation.view.View;

/**
 * Created by theXuser on 1/9/2017.
 */
public abstract class Controller {


    View view = null;

    public View showProfile(String profile) {
        if (profile.equals("facebook")){
            view =  new ProfileFacebook();
        }else if (profile.equals("twitter")){
            view = new ProfileTwitter();
        }else if (profile.equals("googlePlus")){
            view = new ProfileGooglePlus();
        }

        return view;
    }
}
