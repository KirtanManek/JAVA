/* 1. The marks obtained by a student in 5 different subjects are input through the keyboard.
      The student gets a division as per the following rules:
        a. Percentage above or equals to 60-first division
        b. Percentage between 50 to 59-second division
        c. Percentage between 40 and 49-Third division
        d. Percentage less than 40-fail
      Write a program to calculate the division obtained by the student. */

package java_classes;
import java.util.Scanner;

class Percentage {

    double subject1;
    double subject2;
    double subject3;
    double subject4;
    double subject5;
    double percentage;
    double total;
    Scanner input = new Scanner(System.in);

    void insertSubjectMarks() {
        System.out.println("==============================Enter all subjects' marks==============================");

        System.out.print("Enter marks of subject 1(out of 100) : ");
        subject1 = input.nextDouble();

        System.out.print("Enter marks of subject 2(out of 100) : ");
        subject2 = input.nextDouble();

        System.out.print("Enter marks of subject 3(out of 100) : ");
        subject3 = input.nextDouble();

        System.out.print("Enter marks of subject 4(out of 100) : ");
        subject4 = input.nextDouble();

        System.out.print("Enter marks of subject 5(out of 100) : ");
        subject5 = input.nextDouble();

        this.total = subject1 + subject2 + subject3 + subject4 + subject5;

        System.out.println("======================================================================================");
    }

    void findGrade(double percentage) {
        this.percentage = percentage;
        if (percentage >= 60) {
            System.out.println("You got \"First Division\"");
        }

        else if (percentage >= 50 && percentage <= 59) {
            System.out.println("You got \"Second Division\"");
        }

        else if (percentage >= 40 && percentage <=49) {
            System.out.println("You got \"Third Division\"");
        }

        else {
            System.out.println("You are Fail");
        }
    }
}

public class PercentageMain {
    public static void main(String[] args) {
        Percentage p1 = new Percentage();
        p1.insertSubjectMarks();
        p1.percentage = (100 * p1.total) / 100;
        p1.findGrade(p1.percentage);
    }
}