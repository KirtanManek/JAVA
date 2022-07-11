/* 1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato.
      Write a java program that demonstrates how to establish this class hierarchy.
      Declare one instance variable of type String that indicates the color of a vegetable.
      Crete and display instances of these objects.
      Override the toString() method of object to return a string with the name of vegetable and its color. */

package java_classes;

abstract class Vegetable {
    String color;
    Vegetable() {
        this.color = color;
    }
}

class Potato extends Vegetable {
    public String toString() {
        return "Potato" + " - " + "Skin";
    }
}

class Brinjal extends Vegetable {
    public String toString() {
        return "Brinjal" + " - " + "Purple";
    }
}

class Tomato extends Vegetable {
    public String toString() {
        return "Tomato" + " - " + "Red";
    }
}

public class VegetableMain {
    public static void main(String[] args) {
        Potato v1 = new Potato();
        Brinjal v2 = new Brinjal();
        Tomato v3 = new Tomato();
    }
}