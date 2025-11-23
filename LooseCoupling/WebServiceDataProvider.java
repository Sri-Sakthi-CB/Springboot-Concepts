package org.example.LooseCoupling;

public class WebServiceDataProvider implements UserDataProvider{


    @Override
    public String UserDetails() {
        return "User Details from WebService";
    }
}
