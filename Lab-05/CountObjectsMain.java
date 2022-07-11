/* 6. WAP that counts the number of objects created using static. */

package java_classes;

class CountObjects {
    static int count;
    public CountObjects() {
        count++;
    }
}

public class CountObjectsMain {
    public static void main(String[] args) {
        CountObjects co1 = new CountObjects();
        CountObjects co2 = new CountObjects();
        CountObjects co3 = new CountObjects();

        System.out.println("Total objects : " + CountObjects.count);
    }
}
