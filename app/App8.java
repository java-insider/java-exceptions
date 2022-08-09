package app;

import account.Account3;
import account.InsufficientFundsException;

public class App8 {

    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(-600);
            System.out.println(account);

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
