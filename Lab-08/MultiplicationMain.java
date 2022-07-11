/* 1. Write a method for computing xy doing repetitive multiplication.
      X and y are of type integer and are to be given as command line arguments.
      Raise and handle exception(s) for invalid values of x and y. */

package java_classes;

public class MultiplicationMain {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int c = a * b;

            System.out.println("Ans is : " + c);
        }
        catch (Exception e) {
            System.out.println("Typing Mistake...");
            e.printStackTrace();
        }

        System.out.println("Success...");
    }
}
