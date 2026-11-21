package src.service;

import src.model.Account;

public class BankingService {

    public void  deposit(Account account, double amount){

        if(amount > 0) {
            System.out.println("Deposite Successful!");
        }
        else{
            System.out.println("Invalid Deposite Amount!");
        }
    }
}
