package java_classes;
import java.util.Scanner;

class Student {
    long id_no;
    int no_of_sub_registered;
    String[] sub_code;
    int[] sub_credit;
    String[] grade_obtain;
    int[] grade_point;
    double spi;
    int sum = 0, sum1 = 0;

    Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many subjects registered : ");
        this.no_of_sub_registered = input.nextInt();
        this.sub_code = new String[no_of_sub_registered];
        this.sub_credit = new int[no_of_sub_registered];
        this.grade_obtain = new String[no_of_sub_registered];
        this.grade_point = new int[no_of_sub_registered];

        for (int i = 0; i < no_of_sub_registered; i++) {
            int temp = i + 1;
            System.out.print("Enter subject code of subject " + temp + " : ");
            sub_code[i] = input.next();
            System.out.print("Enter credits of subject " + temp + " : ");
            sub_credit[i] = input.nextInt();
            System.out.println("");
        }
    }

    void calculate_spi() {
        for (int j = 0; j < no_of_sub_registered; j++) {
            if (grade_obtain[j].equals("A+"))
                grade_point[j] = 10;
            else if (grade_obtain[j].equals("A"))
                grade_point[j] = 9;
            else if (grade_obtain[j].equals("B+"))
                grade_point[j] = 8;
            else if (grade_obtain[j].equals("B"))
                grade_point[j] = 7;
            else if (grade_obtain[j].equals("C+"))
                grade_point[j] = 6;
            else if (grade_obtain[j].equals("C"))
                grade_point[j] = 5;
            else if (grade_obtain[j].equals("D+"))
                grade_point[j] = 4;
            else if (grade_obtain[j].equals("F"))
                grade_point[j] = 0;

            this.sum = sum + (sub_credit[j] * grade_point[j]);
            this.sum1 = sum1 + sub_credit[j];
        }
        spi = sum / sum1;
        System.out.println("Your spi is = " + spi);
        System.out.println("\n");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter how many students : ");
        int length = input1.nextInt();
        Student obj = new Student();

        for (int k = 0; k < length; k++) {
            System.out.print("Enter enrollment number of student : ");
            obj.id_no = input2.nextLong();
            System.out.println("");
            System.out.println("Enter details about grade obtain for each subject for student " + obj.id_no + " \n ");
            System.out.println("subject code \t\t subject credit \t\t obtain grade \n");
            System.out.println("-------------------------------------------------------------------------------------- \n");

            for (int i = 0; i < obj.no_of_sub_registered; i++) {
                System.out.print("" + obj.sub_code[i] + "\t\t\t\t\t" + obj.sub_credit[i] + "\t\t\t\t\t     ");
                String r = input1.next();
                obj.grade_obtain[i] = r;
            }
            obj.calculate_spi();
        }
    }
}