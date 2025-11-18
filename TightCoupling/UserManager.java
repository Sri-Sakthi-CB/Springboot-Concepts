package org.example.TightCoupling;

public class UserManager {
    private UserDatabase userDB = new UserDatabase();

    public String userManagement(){
        return userDB.userDetails();
    }
}
