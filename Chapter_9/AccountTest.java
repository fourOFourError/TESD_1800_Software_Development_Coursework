// Brandon Brower
// Exercise 9-7


public class AccountTest {
    public static void main(String[] args) throws Exception {
        Account a1 = new Account(1122,20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        
        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyInterest());
        System.out.println(a1.getDateCreated());
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