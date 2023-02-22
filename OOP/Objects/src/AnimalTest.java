/**
 *  Assignment1 Program
 *  AnimalTest.java Main class
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 * 
 *  This main class is called AnimalTest.java 
 *  It instantiates a Dog, Cat, Racoon, and Whale object while also calling
 *  on each of its available functions
 *  
 *  Executes when file is ran
 */
package Assignment1;

/**
 *
 * @author danie
 */
public class AnimalTest 
{
    public static void main(String[] args) 
    {
        Dog d1 = new Dog("Dog", "Xander", 3, "Male", "House", "12 miles/hr");   //Instantiates a Dog object
        d1.move();  //Prints that the dog is moving
        d1.sound(); //Prints a sound that a dog makes
        d1.eat();   //Prints that the Dog is eatiing
        d1.sleep(); //Prints that the dog is sleeping
        d1.walk();  //Prints that the dog is walking
        d1.greetHuman();    //Prints that the dog greets a human
        d1.bark();  //Prints that the dog is barking
        System.out.println("\n");
        
        Cat c1 = new Cat("Cat", "Stella", 5, "Female", "House", "10 miles/hr"); //Instantiates a Cat object
        c1.move();  //Prints that the Cat is moving
        c1.sound(); //Prints a sound that a cat makes
        c1.eat();   //Prints that the cat is eating
        c1.sleep(); //Prints that the cat is sleeping
        c1.walk();  //Prints that the cat is walking 
        c1.greetHuman();    //Prints that the cat greets a human
        c1.scratch();   //Prints that the cat scratches
        System.out.println("\n");
        
        Racoon r1 = new Racoon("Racoon", "Trashy", 10, "Male", "forest", "6 miles/hr"); //Instantiates a Racoon object
        r1.move();  //Prints that the racoon is moving
        r1.sound(); //Prints that the racoon makes a sound
        r1.eat();   //Prints that the racoon is eating
        r1.sleep(); //Prints that the racoon is sleeping
        r1.scratch();   //Prints that the racoon scratches
        System.out.println("\n");
        
        Whale w1 = new Whale("Whale", "Big Chungus", 32, "Female", "ocean", "20 miles/hr"); //Instantiates a Whale object
        w1.move();  //Prints that the whale is moving
        w1.sound(); //Prints that the whale is making a sound
        w1.eat();   //Prints that the whale is eating
        w1.sleep(); //Prints that the whale is sleeping
        w1.swim();  //Prints that the whale is swimming
    }
    
}
