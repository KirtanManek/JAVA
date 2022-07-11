/* 6. Demonstrate the use of Super Keyword. */

package java_classes;

class Animal{
	public void sound(){
		System.out.println("Animal sound : ");
	}
}

class Dog extends Animal{
	public void printSound(){
		super.sound();
		System.out.println("Dog bark");
	}
}

public class SuperMain{
	public static void main(String[] args){
		Dog obj = new Dog();
		obj.printSound();
	}
}