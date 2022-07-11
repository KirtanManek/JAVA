/* 2. Write a program to replace all “word1” by “word2” from a file1,
	  and output is written to file2 file and display the no. of replacement. */

package java_classes;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f1 = new FileReader("D:\\JAVA Programs\\Lab_10_JAVA\\File1.txt");//Specify the file path.
            BufferedReader bf = new BufferedReader(f1);
            FileWriter f2 = new FileWriter("D:\\JAVA Programs\\Lab_10_JAVA\\File2.txt");//Specify the file path.
            String word1, word2;
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter word you want to replace: ");
            word1 = bf2.readLine();
            System.out.print("Enter word you want to replace with: ");
            word2 = bf2.readLine();
            String x;
            while ((x = bf.readLine()) != null) {
                x = x.replace(word1, word2);
                f2.write(x);
            }
            f2.close();
            f1.close();
            bf.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}