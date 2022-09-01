/* 4. Write a program to check that the given number is prime or not. */

package java_classes;
import java.util.Scanner;

class Prime {
    long number;

    boolean checkPrime() {
        if (number <= 1)
            return false;

        else if (number == 2)
            return true;

        else if (number % 2 == 0)
            return false;

        else {
            for (int i = 3 ; i <= Math.sqrt(number) ; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
}

public class PrimeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Prime p1 = new Prime();

        System.out.print("Enter any number : ");
        p1.number = input.nextLong();

        if (p1.checkPrime()) {
            System.out.println(p1.number + " is prime number.");
        }
        else {
            System.out.println(p1.number + " is not prime number.");
        }
    }
}
