/* 2. Write a program that illustrates interface inheritance.
      Interface A is extended by A1 and A2.
      Interface A12 inherits from both A1 and A2.
      Each interface declares one constant and one method. Class B implements A12.
      Instantiate B and invoke each of its methods.
      Each method displays one of the constants */

package java_classes;

interface A {
    void A();
}

interface A1 extends A {
    void A1();
}

interface A2 extends A {
    void A2();
}

interface A12 extends A1, A2 {
    void A12();
}

class B implements A12 {

    public void A() {
        System.out.println("A");
    }

    public void A1() {
        System.out.println("A1");
    }

    public void A2() {
        System.out.println("A2");
    }

    public void A12() {
        System.out.println("A12");
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        B obj = new B();

        obj.A();
        obj.A12();
    }
}
