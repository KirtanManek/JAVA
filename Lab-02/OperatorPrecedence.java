package java_classes;

public class OperatorPrecedence {
    public static void main(String[] args) {
        double a = 10 + 20 * 30;
        double b = 100 / 10 * 100;
        double c = 5 * 4 / 4 % 3;
        double d = 100 + 200 / 10 - 3 + 10;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
