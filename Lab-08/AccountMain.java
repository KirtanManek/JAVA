/* 3. WAP to create Account class, which is representing a bank account where we can deposit and withdraw money.
      If we want to withdraw money which exceed our bank balance?
      We will not be allowed, create InSufficientFundException to handle above situation and display proper error message. */

/* I have added two more Exceptions namely 'MinimumFundsException' and 'OwerflowedAccountBalanceException' */

package java_classes;
import java.util.Scanner;

class InSufficientFundException extends Exception {
    public void errorMessage() {
        System.out.println("InSufficientFundException");
    }
}

class MinimumFundsException extends Exception {
    public void errorMessage() {
        System.out.println("MinimumFundsException");
    }
}

class OwerflowedAccountBalanceException extends Exception {
    public void errorMessage() {
        System.out.println("OwerflowedAccountBalanceException");
    }
}

class Account {
    double accountBalance;
    double withdrawMoney;
    double depositMoney;

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double withdraw(double withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
        return (accountBalance - withdrawMoney);
    }

    public double deposit(double depositMoney) {
        this.depositMoney = depositMoney;
        return (accountBalance + depositMoney);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double finalBalance;

        System.out.print("Enter your account balance : ");
        finalBalance = input.nextDouble();

        Account a1 = new Account(finalBalance);

        System.out.print("Withdraw or Deposit ? : ");
        String str = input.next();
        str = str.toLowerCase();

        if (str.equals("withdraw")) {
            System.out.print("Enter ammount to withdraw : ");
            double temp1 = input.nextDouble();
            finalBalance = a1.withdraw(temp1);

            try {
                if (finalBalance < 0) {
                    throw new InSufficientFundException();
                }

                if (finalBalance >= 0 && finalBalance < 1000) {
                    throw new MinimumFundsException();
                }

                if (finalBalance > 10000) {
                    throw new OwerflowedAccountBalanceException();
                }

                else {
                    System.out.println("Your final balance is : " + finalBalance);
                }

            }
            catch (InSufficientFundException e1) {
                e1.printStackTrace();
                finalBalance = finalBalance + temp1;
                e1.errorMessage();
                System.out.println("Your final balance is : " + finalBalance);
            }
            catch (MinimumFundsException e2) {
                e2.printStackTrace();
                finalBalance = finalBalance + temp1;
                e2.errorMessage();
                System.out.println("Your final balance is : " + finalBalance);
            }
            catch (OwerflowedAccountBalanceException e3) {
                e3.printStackTrace();
                finalBalance = finalBalance - temp1;
                e3.errorMessage();
            }
        }

        else if (str.equals("deposit")) {
            System.out.print("Enter ammount to deposit : ");
            double temp1 = input.nextDouble();
            finalBalance = a1.deposit(temp1);

            try {
                if (finalBalance < 0) {
                    throw new InSufficientFundException();
                }

                if (finalBalance >= 0 && finalBalance < 1000) {
                    throw new MinimumFundsException();
                }

                if (finalBalance > 10000) {
                    throw new OwerflowedAccountBalanceException();
                }

                else {
                    System.out.println("Your final balance is : " + finalBalance);
                }
            }
            catch (InSufficientFundException e1) {
                e1.printStackTrace();
                finalBalance = finalBalance + temp1;
                e1.errorMessage();
                System.out.println("Your final balance is : " + finalBalance);
            }
            catch (MinimumFundsException e2) {
                e2.printStackTrace();
                finalBalance = finalBalance + temp1;
                e2.errorMessage();
                System.out.println("Your final balance is : " + finalBalance);
            }

            catch(OwerflowedAccountBalanceException e3) {
                e3.printStackTrace();
                finalBalance = finalBalance - temp1;
                e3.errorMessage();
            }
        }

        else {
            System.out.println("Please enter valid input.");
        }
    }
}