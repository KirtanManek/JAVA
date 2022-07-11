package java_classes;
import java.util.Scanner;

class AreaOfCircle {
	double radius;
	double circleArea() {
		this.radius = radius;
		return Math.PI * Math.pow(radius, 2);
	}
}

public class AreaOfCircleMain {
	public static void main(String[] args) {
		AreaOfCircle a1 = new AreaOfCircle();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		a1.radius = input.nextDouble();
		double area = a1.circleArea();
		System.out.println("Area of circle is : "+area);
	}
}