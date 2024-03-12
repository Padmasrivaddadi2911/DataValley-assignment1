import java.io.*;
import java.util.*;

class Animal{
    void makeSound(){
        System.out.println("Animals makes sounds");
    }
}
class Dog extends Animal{
     void makeSound(){
        System.out.println("Dog Barks!!");
    }
}
class Cat extends Animal{
     void makeSound(){
            System.out.println("Cat Meows!!");
    }
}
public class Main1
{
	public static void main(String[] args) {
	  Dog obj1=new Dog();
	  obj1.makeSound();
	   Cat obj2=new Cat();
	  obj2.makeSound();
		
	}
}
