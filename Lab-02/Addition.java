/* 1) Write a program to get 2 numbers from the user and print the sum of two numbers
   using command line and Scanner class. */
package java_classes;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Sum of both numbers is : "+c);
    }
}
