package app;

import account.Account3;

public class App3 {

    public static void main(String[] args) throws Exception {

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(600);
        System.out.println(a);

        System.out.println("Success!");
    }
}
