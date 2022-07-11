/* 4. Design a class named MyPoint to represent a point with x and y-coordinates. The class contains:
        - The data fields x and y that represent the coordinates with getter methods.
        - A no-arg constructor that creates a point (0, 0).
        - A constructor that constructs a point with specified coordinates.
        - A method named distance that returns the distance from this point to a specified point of the MyPoint type.
        - A method named distance that returns the distance from this point to another point with specified x- and y-coordinates. */

package java_classes;

class MyPoint {
    double x, y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint mp) {
        return Math.sqrt(Math.pow(this.x - mp.x, 2) + Math.pow(this.y - mp.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}

public class MyPointMain {
    public static void main(String[] args) {

        // Distance between (10,2) and (6,4)
        MyPoint mp_final = new MyPoint(10, 2);
        MyPoint mp = new MyPoint();
        mp.x = 6;
        mp.y = 4;
        double ans = mp_final.distance(mp);
        System.out.println("Distance of given point is : "+ans);

        // Distance of point (10,2) with respect to origin
        /*MyPoint mp = new MyPoint();
        double ans = mp.distance(10,2);
        System.out.println("Distance of given point is : "+ans); */
    }
}
