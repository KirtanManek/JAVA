/* 3. The Transport interface declares a deliver () method.
      The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes.
      The Transport interface is implemented by the Camel and Donkey classes.
      Write a test program that initialize an array of four Animal objects.
      If the object implements the Transport interface, the deliver () method is invoked. */

interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void display();
}

//Tiger Class
class Tiger extends Animal {
    void display() {
        System.out.println("Tiger Class");
    }
}

//Camel Class
class Camel extends Animal implements Transport {
    void display() {
        System.out.println("Camel Class");
    }

    public void deliver() {
        System.out.println("Camel deliver in desert area");
    }
}

//Deer Class
class Deer extends Animal {
    void display() {
        System.out.println("Deer Class");
    }
}

//Donkey Class
class Donkey extends Animal implements Transport {
    void display() {
        System.out.println("Donkey Class");
    }

    public void deliver() {
        System.out.println("Donkey deliver in village area");
    }
}

//Main Class
class AnimalMain {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.display();
        Camel c = new Camel();
        c.display();
        c.deliver();
        Deer d = new Deer();
        d.display();
        Donkey don = new Donkey();
        don.display();
        don.deliver();
    }
}
