package org.example.TightCoupling;

//Tight Coupling - one class is tightly linked to another class, making the code difficult to modify or test separately.

public class TightCoupling {
    public static void main(String[] args) {

        UserManager userManage = new UserManager();
        System.out.println(userManage.userManagement());
    }
}
