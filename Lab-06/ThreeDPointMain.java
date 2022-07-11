/* 5. Create a class named ThreeDPoint to model a point in a three-dimensional space.
      Let ThreeDPoint be derived from MyPoint with following additional features:
        - A data fields named z that represents the z-coordinate.
        - A no-arg constructor that creates a point (0, 0, 0).
        - A constructor that constructs a point with three specified coordinates.
        - A get method that returns the z value.
        - Override the distance method to return the distance between two points in the three-dimensional space.
        - Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the distance between the two points. */


/* !! Required to import MyPoint class from the file MyPointMain.java !! */

package java_classes;
import java_classes.MyPoint;

class ThreeDPoint extends MyPoint {
    double z;

    public ThreeDPoint() {
        this.z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(ThreeDPoint mp) {
        return Math.sqrt(Math.pow(this.x - mp.x, 2) + Math.pow(this.y - mp.y, 2) + Math.pow(this.z - mp.z, 2));
    }

    public double distance(double x, double y, double z) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z, 2));
    }

    public double getZ(double z) {
        this.z = z;
        return z;
    }
}

public class ThreeDPointMain {
    public static void main(String[] args) {

        // Distance between (10, 30, 25.5) and (6, 4, 3)
        /*MyPoint mp_final = new ThreeDPoint(10, 30, 25.5);
        ThreeDPoint mp = new ThreeDPoint();
        mp.x = 6;
        mp.y = 4;
        mp.z = 3;
        double ans = mp_final.distance(mp);
        System.out.println("Distance between given two points is : "+ans); */

        // Distance of point (10, 30, 25.5) with respect to origin
        ThreeDPoint mp = new ThreeDPoint(); // Creats point (0, 0, 0)
        double ans = mp.distance(10, 30, 25.5); // Creats point (10, 30, 25.5) and passes to distance method
        System.out.println("Distance of given point from origin is : "+ans);
    }
}