package src;

import src.model.Account;
import src.service.BankingService;


public class Main {

    public static void main(String[] args) {

        //Create Account Object
        Account account = new Account(101, "Amani", 5000);

        //Create bankingService Object
        BankingService service = new BankingService();

        //check Initial balance
        service.checkBalance(account);

        //Deposite Money
        service.deposit(account, 2000);

        //Withdraw Money
        service.withdraw(account, 1000);

        //check final balance
        service.checkBalance(account);
    }
}
