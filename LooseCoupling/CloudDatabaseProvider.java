package org.example.LooseCoupling;

public class CloudDatabaseProvider implements UserDataProvider{

    @Override
    public String UserDetails() {
        return "User Details from Cloud Database";
    }
}
