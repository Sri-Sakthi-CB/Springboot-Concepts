package org.example.LooseCoupling;

public class UserManager {
    private UserDataProvider userProvider;

    public UserManager(UserDataProvider userProvider)
    {
        this.userProvider = userProvider;

    }

    public String UserInfo()
    {
        return userProvider.UserDetails();
    }
}
