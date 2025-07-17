package com.ojas.loosecoupling;

public class UserManager {

    private UserDataProvider userDatabase;

    public UserManager(UserDataProvider userDatabase) {
        this.userDatabase = userDatabase;
    }

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
