package src.model;

public class Account {

 //Account Properties
private int accountNo;
private String accountHolderName;
private double balance;


//Cunstructer
public Account(int accountNo, String accountHolderName, double balance) {

    this.accountNo = accountNo;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
}

//Getters method
public int getAccountNo(){
    return accountNo;
}

public String getAccountHolderName(){
    return accountHolderName;
}

public double getBalance(){
    return balance;
}

public void addBalance(double amount){
    this.balance += amount;
}

public void deductBalance(double amount){
    this.balance -= amount;
}



}

