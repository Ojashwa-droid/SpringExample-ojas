package com.ojas.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        UserDataProvider dataBaseProvider = new UserDatabaseProvider();
//        UserManager userManager = new UserManager(dataBaseProvider);
//        System.out.println(userManager.getUserInfo());
//
//        UserDataProvider newDataBaseProvider = new NewDatabaseProvider();
//        UserManager userManagerNewDb = new UserManager(newDataBaseProvider);
//        System.out.println(userManagerNewDb.getUserInfo());

        ApplicationContext context =
                new ClassPathXmlApplicationContext("iocUserManagement.xml");

        UserManager userManagerWithUserDataProvider =
                context.getBean("userManagerWithUserDataProvider", UserManager.class);
        System.out.println(userManagerWithUserDataProvider.getUserInfo());

        UserManager userManagerWithNewDataProvider =
                context.getBean("userManagerWithNewDataProvider", UserManager.class);
        System.out.println(userManagerWithNewDataProvider.getUserInfo());
    }
}
