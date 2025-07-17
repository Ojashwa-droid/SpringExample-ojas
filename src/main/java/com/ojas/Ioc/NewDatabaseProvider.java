package com.ojas.Ioc;

// We switched to mongo db - lets say PostgreSQL
public class NewDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "new db in action";
    }
}
