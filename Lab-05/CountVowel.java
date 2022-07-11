/* 3. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence.
      The program should continue till user enters a word “quit”.
      Display the total count of each vowel for all sentences. */

package java_classes;
import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vowel = 0;
        String temp;

        do {
            System.out.print("Enter String : ");

            temp = input.nextLine();
            temp = temp.toLowerCase();

            for(int i = 0 ; i < temp.length() ; i++) {
                if (temp.charAt(i) == 'a' || temp.charAt(i) == 'e' || temp.charAt(i) == 'i' || temp.charAt(i) == 'o' || temp.charAt(i) == 'u') {
                    vowel++;
                }
            }
        } while(!temp.equals("quit"));

        System.out.println("Vowels are "+(vowel-2));
    }
}
