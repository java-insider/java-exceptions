package app;

import account.Account3;
import account.InsufficientFundsException;

public class App6 {

    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);

        } catch (InsufficientFundsException e) {
            System.out.println("Ops... pouco dinheiro. Só existe " + e.getCurrentBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("O valor não pode ser negativo");
        }

        System.out.println("THE END");
    }
}
