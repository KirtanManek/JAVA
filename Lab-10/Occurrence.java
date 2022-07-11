/* 3. Write an application that reads a file and counts the number of occurrences of digit 5.
      Supply the file name as a command-line argument. */

// Compile command : javac -d . Occurrence.java
// Run command : java java_classes.Occurrence File1.txt

// Supply only relative file path through command line.

package java_classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        int occurrenceCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word whose occurrence you want to count : ");
        String str = input.next();
        try {
            File f = new File(args[0]);
            if(f.exists()){
                BufferedReader reader = new BufferedReader(new FileReader(f));//Specify the file path.
                System.out.println("File exists");
                String line = reader.readLine();
                while(line != null) {
                    String[] words = line.split("[!?.: ]+");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equals(str)) {
                            occurrenceCount++;
                        }
                    }
                    line = reader.readLine();
                }
                reader.close();
            }
            if (f.exists() == false) {
                System.out.println("File does not exists");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("\"" + str + "\"" + " occurs " + occurrenceCount + " times.");
    }
}
