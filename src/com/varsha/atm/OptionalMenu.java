package com.varsha.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.varsha.atm.Account;

public class OptionalMenu extends Account {
    int selection;
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat(" '$' ###,##0.00");
    HashMap<Integer, Integer> data= new HashMap<Integer,Integer>();
    //validate customer information pin and account number
    public void getLogin()throws IOException {
        int x=1;
        do{
            try {
                data.put(123452,1234);
                data.put(126767,9234);
                data.put(123034,1034);
                System.out.println("Welcome to the com.varsha.atm.ATM Project!");
                System.out.println("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());
            }
            catch (Exception e) {
                System.out.println("\n" + "Invalis characters enter only numbers." + "\n");
                x = 2;
            }
            for(Map.Entry<Integer, Integer> entry: data.entrySet()){
                if(getCustomerNumber()== entry.getKey() && getPinNumber()== entry.getValue()){
                    getAccountType();
                }
                else{
                   System.out.println( "wrong customer number or pin number");
                }

            }

        }
        while(x==1);

    }
    public void getAccountType(){
        System.out.println("select the account type you want to access: ");
        System.out.println(" 1-checking account");
                System.out.println(" 2- saving account");
                        System.out.println("3-Exit");
                                System.out.println("Choice : ");
                               selection=menuInput.nextInt();
                switch (selection){
                                   case 1:
                                           getChecking();
                                           break;
                                 case 2:
                                           getSaving();
                                           break;
                                  case 3: System.out.println("thankyou for using atm..bye");
                                            break;


                                 default: System.out.println("invalid choice");
                                           getAccountType();
                               }

    }
    public void getChecking(){
        System.out.println(" 1- view balance");
        System.out.println(" 2- withdraw funds");
        System.out.println("3- deposit funds");
        System.out.println("4- exit");
        System.out.println("choice: ");
        selection=menuInput.nextInt();
        switch(selection){
            case 1:  System.out.println("account balance: "+ moneyFormat.format(getCheckingBalance()));
                     getAccountType();
            case 2: getCheckingWithdrawInput();
                    getAccountType();
            case 3: getCheckingDepositInput();
                getAccountType();
            case 4: System.out.println("Thankyou for using atm");
            default: System.out.println("invalid choice");
                getChecking();

        }
    }
    public void getSaving(){
        System.out.println(" 1- view balance");
        System.out.println(" 2- withdraw funds");
        System.out.println("3- deposit funds");
        System.out.println("4- exit");
        System.out.println("choice: ");
        selection=menuInput.nextInt();
        switch(selection){
            case 1:  System.out.println("account balance: "+ moneyFormat.format(getCheckingBalance()));
                getAccountType();
            case 2: getCheckingWithdrawInput();
                getAccountType();
            case 3: getCheckingDepositInput();
                getAccountType();
            case 4: System.out.println("Thankyou for using atm");
            default: System.out.println("invalid choice");
                getSaving();

        }
    }

}
