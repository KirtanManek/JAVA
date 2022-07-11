/* 3. Write a program to find maximum no from given 3 numbers. */
/* This programm is done using ternery operator. */

package java_classes;
import java.util.Scanner;

public class MaximumFrom3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double num1 = input.nextDouble();

        System.out.print("Enter number 2 : ");
        double num2 = input.nextDouble();

        System.out.print("Enter number 3 : ");
        double num3 = input.nextDouble();

        double max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println(max + " is maximum.");
    }
}
