package com.varsha.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat(" '$' ###,##0.00");
    //set cutomer number
    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    //get customer number
    public int getCustomerNumber(){
        return customerNumber;
    }
    //set pin number
    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    //get pin number
    public int getPinNumber(){
        return pinNumber;
    }
    // get checking  account balance
    public double getCheckingBalance(){
        return checkingBalance;
    }
    // get saving  account balance
    public double getSavingBalance(){
        return savingBalance;
    }
    //calculating checking account withdrawal
    public double calcCheckingWithdraw(double amount){
        checkingBalance =(checkingBalance -amount);
        return checkingBalance;
    }
    //calculating saving account withdrawal
    public double calcSavingWithdraw(double amount){
        savingBalance =(savingBalance-amount);
        return savingBalance;
    }
    //calculating checking account deposits
    public double calcCheckingDeposits(double amount){
        checkingBalance =(checkingBalance + amount);
        return checkingBalance;
    }
    //calculating saving account deposits
    public double calcSavingDeposits(double amount){
        savingBalance =(savingBalance + amount);
        return savingBalance;
    }
    //customer checking account withdraw input
    public void getCheckingWithdrawInput(){
        System.out.println("checking com.varsha.atm.Account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("ammount you want to withdraw from checking com.varsha.atm.Account");
        double amount= menuInput.nextDouble();
        if( (checkingBalance - amount) >=0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance: "+ moneyFormat.format(checkingBalance));

        }
        else{
            System.out.println("Balance cannot be negative");
        }

    }
    //customer saving account withdraw input
    public void getSavingWithdrawInput(){
        System.out.println("checking com.varsha.atm.Account balance: "+moneyFormat.format(savingBalance));
        System.out.println("ammount you want to withdraw from saving com.varsha.atm.Account");
        double amount= menuInput.nextDouble();
        if( (savingBalance - amount) >=0){
            calcSavingWithdraw(amount);
            System.out.println("New checking account balance: "+ moneyFormat.format(savingBalance));

        }
        else{
            System.out.println("Balance cannot be negative");
        }

    }
    //customer checking account Deposit input
    public void getCheckingDepositInput(){
        System.out.println("checking com.varsha.atm.Account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("ammount you want to deposit from checking com.varsha.atm.Account");
        double amount= menuInput.nextDouble();
        if( (checkingBalance + amount) >=0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance: "+ moneyFormat.format(checkingBalance));

        }
        else{
            System.out.println("Balance cannot be negative");
        }

    }
    //customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("savinging com.varsha.atm.Account balance: "+moneyFormat.format(savingBalance));
        System.out.println("ammount you want to deposit from saving com.varsha.atm.Account");
        double amount= menuInput.nextDouble();
        if( (savingBalance + amount) >=0){
            calcSavingDeposits(amount);
            System.out.println("New saving account balance: "+ moneyFormat.format(savingBalance));

        }
        else{
            System.out.println("Balance cannot be negative");
        }

    }


}
