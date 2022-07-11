/* 1. Write a program that counts number of characters, words, and lines in a file.
	  Use exceptions to check whether the file that is read exists or not. */

package java_classes;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileTester {
    public static void main(String[] args) {
        int charCount = 0, linecount = 0, wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA Programs\\Lab_10_JAVA\\try.txt"));//Specify the file path.
            String line = reader.readLine();
            while (line != null) {
                linecount++;
                String[] words = line.split("[!?.: ]+");
                wordCount = wordCount + words.length;
                for (String word : words) {
                    charCount = charCount + word.length();
                }
                line = reader.readLine();
				reader.close();
            }
            System.out.println("Total characters : " + charCount);
            System.out.println("Total words : " + wordCount);
            System.out.println("Total lines : " + linecount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}