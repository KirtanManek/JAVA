/* 4. Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance,
   Also create methods getAccountDetails() and displayAccountDetails(). */

package java_classes;
import java.util.Scanner;

class BankAccount {
    long accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    public BankAccount(long accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    String getAccountDetails() {
        return accountNo + " - " + userName + " - " + accountType + " - " + accountBalance;
    }

    void displayAccountDetails() {
        System.out.println(accountNo + " - " + userName + " - " + accountType + " - " + accountBalance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "abc", "abc@gmail.com", "Savings", 5000);
        b1.displayAccountDetails();
        System.out.println(b1.getAccountDetails());
    }
}