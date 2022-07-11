/* 5. Define class for Complex number with real and imaginary as data members.
      Create its contructor, overload the constructors.
      Also define addition method to add two complex objects. */

package java_classes;

class ComplexNumber {
    double real, imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String additionOfTwoComplexNumbers(ComplexNumber co2) {
        return (this.real + co2.real) + " + " + (this.imaginary + co2.imaginary) + "i";
    }
}

public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumber co1 = new ComplexNumber(5, 2);
        ComplexNumber co2 = new ComplexNumber(2, 5);

        String final_complex_number = co1.additionOfTwoComplexNumbers(co2);

        System.out.println("Your final complex number is : " + final_complex_number);
    }
}
