package org.example.LooseCoupling;

public class LooseCoupling {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerDB = new UserManager(databaseProvider);
        System.out.println(userManagerDB.UserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWS.UserInfo());

        UserDataProvider cloudDataProvider = new CloudDatabaseProvider();
        UserManager userManagerCloud = new UserManager(cloudDataProvider);
        System.out.println(userManagerCloud.UserInfo());


    }
}