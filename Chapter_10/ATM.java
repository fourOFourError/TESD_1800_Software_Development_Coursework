// Brandon Brower
// Exercise 10-7

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws Exception {
        Account[] accounts = {new Account(0,100),new Account(1,100),new Account(2,100),new Account(3,100),new Account(4,100),new Account(5,100),new Account(6,100),new Account(7,100),new Account(8,100),new Account(9,100)};
        Scanner input = new Scanner(System.in);
        
        int id;
        boolean isvalid;

        while (true) {
            // title screen
            System.out.println("    Welcome to the");
            System.out.println("  /\\   ====== |\\    /|");
            System.out.println(" /--\\    ||   | \\  / |" );
            System.out.println("/    \\   ||   |  \\/  |");
            // input id
            System.out.print("Please input a valid ID: ");
            id = input.nextInt();
            System.out.println("------------------------");
            // check id
            isvalid = (id >= 0 && id <= 9);
            if (!isvalid) {
                System.out.print("That ID does not exist. Please try again.");
            }
            while (isvalid) {
                System.out.println("Hello user #"+id);
                System.out.println("You may:");
                System.out.println("1) Check Balance");
                System.out.println("2) Withdraw");
                System.out.println("3) Deposit");
                System.out.println("4) Exit");
                System.out.print("Please select an action: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1: System.out.println("You have $"+accounts[id].getBalance()+" in your account."); break;
                    case 2:
                        System.out.print("How much will you withdraw? ");
                        accounts[id].withdraw(input.nextInt());
                        break;
                    case 3:
                        System.out.print("How much will you deposit? ");
                        accounts[id].deposit(input.nextInt());
                        break;
                    case 4: isvalid = false; break;
                }
                System.out.println("------------------------");
            }
        }
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private java.util.Date dateCreated = new java.util.Date();

    Account() {
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    // get/set ID
    int getId() {
        return id;
    }
    void setId(int newId) {
        id = newId;
    }
    // get/set balance
    double getBalance() {
        return balance;
    }
    void setBalance(double newBalance) {
        balance = newBalance;
    }
    // change balance
    void withdraw(double withdrawal) {
        balance -= withdrawal;
    }
    void deposit(double deposit) {
        balance += deposit;
    }
    // get/set interest rate
    double getAnnualInterestRate() {
        return annualInterestRate;
    }
    double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }
    double getMonthlyInterest() {
        return (annualInterestRate/1200)*balance;
    }
    void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    // get date
    java.util.Date getDateCreated() {
        return dateCreated;
    }
}