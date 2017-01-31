package com.geekdos.presenation.view;

import com.geekdos.presenation.model.User;

/**
 * Created by theXuser on 1/8/2017.
 */
public abstract class View  {

    public String decorate(String profile){
        String result;
        result  = "**************************************\n";
        result += "*   Welcome on the "+profile+" Profile  *\n";
        result += "**************************************\n";
        result += "==> First Name : "+User.getUser().getFirstName()+"\n";
        result += "==> Last Name  : "+User.getUser().getLastName()+"\n";
        result += "==> Email      : "+User.getUser().getEmail()+"\n";
        result += "==> Username   : "+User.getUser().getUsername()+"\n";
        result += "==> Password   : "+User.getUser().getPassword()+"\n";
        result += "**************************************\n";

        return result;
    }

    public abstract String render();
}
