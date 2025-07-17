package com.ojas.loosecoupling;

public class LooseCouplingDemo {
    public static void main(String[] args) {
        UserDataProvider dataBaseProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataBaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider newDataBaseProvider = new NewDatabaseProvider();
        UserManager userManagerNewDb = new UserManager(newDataBaseProvider);
        System.out.println(userManagerNewDb.getUserInfo());
    }
}
