package java_classes;
import java.util.Scanner;

class Calculator {
    double a;
    double b;

    public void inputCalc() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        this.a = input.nextDouble();
        System.out.print("Enter second number : ");
        this.b = input.nextDouble();
    }

    public void calc() {
        Scanner input = new Scanner(System.in);

        double c;
        char operator;

        System.out.print("Enter your choice (from +, -, *, /) : ");
        operator = input.next().charAt(0);

        switch(operator) {
            case '+' :
                c = a + b;
                System.out.println("Addition of both numbers is : "+(c));
                break;
            case '-' :
                c = a - b;
                System.out.println("Subtraction of both numbers is : "+(c));
                break;
            case '*' :
                c = a * b;
                System.out.println("Multiplication of both numbers is : "+(c));
                break;
            case '/' :
                c = a / b;
                System.out.println("Division of both numbers is : "+(c));
                break;
            default :
                System.out.println("Enter valid choice");
        }
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.inputCalc();
        c1.calc();
    }
}
