package com.geekdos.presenation.model;

import com.geekdos.presenation.view.ProfileFacebook;
import com.geekdos.presenation.view.ProfileGooglePlus;
import com.geekdos.presenation.view.ProfileTwitter;
import com.geekdos.presenation.view.View;

public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private static User user = null;

    private User(){

    }

    public static User getUser() {
        if (user == null)
            user = new User();
        return user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean login() {
        if (username.equals("admin") && password.equals("admin"))
            return true;
        else
            return false;
    }

}
