/* 7. Demonstrate the use of Final Keyword. */

package java_classes;
import java.util.Scanner;

class Final {
	final int a = 5;

	public void setValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Final value of 'a' is 5");
		System.out.print("Enter a = ");
		int a = sc.nextInt(); /* If I write only 'a' IDE says no so 'Int a' */
	}
}
class FinalMain {
	public static void main(String[] args){
		Final obj = new Final();
		obj.setValue();
		System.out.println("Value of 'a': " + obj.a);
	}
}