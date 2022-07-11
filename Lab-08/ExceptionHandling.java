/* 2. Write a complete program to accept N integer numbers from the command line.
      Raise and handle exceptions for following cases :
        a. - when a number is –ve
        b. - when a number is evenly divisible by 10
        c. - when a number is greater than 1000 and less than 2000
        d. - when a number is greater than 7000
      Skip the number if an exception is raised for it, otherwise add it to find total sum. */

/* In this program you have to give input in command line. */

package java_classes;

class MyException extends Exception {
    String str;
    public MyException(String str) {
        this.str = str;
    }
    public void displayException() {
        System.out.println(str);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        String str;
        int flag;
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            str = "";
            flag = 0;

            try {
                if (n < 0) {
                    str = str + "Number is less than 0.";
                    flag = 1;
                }

                if (n % 10 == 0) {
                    str = str + "Number is divisible by 10.";
                    flag = 1;
                }

                if (n > 1000 && n < 2000) {
                    str = str + "Number is greater than 1000 and less than 2000.";
                    flag = 1;
                }

                if (n > 7000) {
                    str = str + "Number is greater than 7000.";
                    flag = 1;
                }

                if (flag == 1) {
                    throw new MyException(str);
                }

                else {
                    sum = sum + n;
                }
            }
            catch(MyException e) {
                System.out.println("Following Exceptions are thrown for : " + n);
                e.displayException();
                e.printStackTrace();
            }
        }

        System.out.println("Sum is : " + sum);
    }
}
