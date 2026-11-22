package src.service;

import src.model.Account;

public class BankingService {

    public void  deposit(Account account, double amount){

        if(amount > 0) {
            account.addBalance(amount);
            System.out.println("Deposite Successful!");
        }
        else{
            System.out.println("Invalid Deposite Amount!");
        }
    }

    public void withdraw(Account account, double amount){

        if(amount > 0 && amount <= account.getBalance()){
            account.deductBalance(amount);
            System.out.println("Withdraw Successful!");
        } else {
            System.out.println("Insufficient balance or invalid Amount!");
        }
    }

    public void checkBalance(Account account){
        System.out.println("Account balance: " + account.getBalance());
    }
}
