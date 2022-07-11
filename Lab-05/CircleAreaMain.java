/* 1. Write a program to create circle class with area function to find area of circle. */

package java_classes;
import java.util.Scanner;

class Circle {
    double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }
}

public class CircleAreaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        double Radius = input.nextDouble();

        Circle c1 = new Circle(Radius);

        System.out.println("Area of circle with radius " + Radius + " is : " + c1.getArea());
    }
}