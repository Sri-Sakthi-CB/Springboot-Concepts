package org.example.LooseCoupling;

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String UserDetails() {
        return "Details of the User from the Database";
    }
}
