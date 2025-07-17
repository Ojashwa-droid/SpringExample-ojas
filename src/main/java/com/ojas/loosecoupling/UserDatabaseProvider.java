package com.ojas.loosecoupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        // Directly access database
        return "User Details from Database";
    }
}
