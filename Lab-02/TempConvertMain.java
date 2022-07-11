package java_classes;
import java.util.Scanner;

class TempConvert {
    double farenheit;

    double convertFToC() {
        return farenheit - 32 * 5 / 9;
    }
}

public class TempConvertMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TempConvert t1 = new TempConvert();
        System.out.print("Enter temperature in farenheit : ");
        t1.farenheit = input.nextDouble();
        double celcius = t1.convertFToC();
        System.out.println("Temperature in celcius for entered value in farenheit is : "+celcius);
    }
}
