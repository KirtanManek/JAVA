/* 2. Write a program to find that given number or string is palindrome or not. */

package java_classes;
import java.util.Scanner;

class Palindrome {
    String content;
    String contentReverse = "";

    void checkPalindrome() {
        for (int i = content.length() - 1 ; i >= 0 ; i--) {
            contentReverse += content.charAt(i);
        }

        if (contentReverse.equals(content)) {
            System.out.println(content+ " is palindrome.");
        }

        else {
            System.out.println(content+ " is not palindrome.");
        }
    }
}

public class PalindromeMain {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number or word : ");
        p1.content = input.next();
        p1.checkPalindrome();
    }
}
