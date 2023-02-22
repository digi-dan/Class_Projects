/**
 *  Assignment1 Program
 *  Dog.java subclass
 *  subclass of Animal.java
 *  implements Domesticated interface
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 *  
 *  This is a subclass called Dog.java
 *  This subclass extends Animal class and gains all the attributes of a generic Animal
 *  This subclass also implements Domesticated interface 
 *  This subclass has constructors in order to instantiate a Dog object
 *  Along with the functions it gains from Animal.java class, Dog.java has a set of its own functions
 *  Attributes of a dog directly reflect the attributes of a generic Animal
 *  Functions of Dog include:
 *  bark()- prints that the Dog is barking
 *  Overriden functions:
 *  greetHuman()- prints that the Dog greets human
 *  walk()- prints that the dog is walking
 *  sound()- prints the sound a Dog makes
 */
package Assignment1;

/**
 *
 * @author danie
 */
public class Dog extends Assignment1.Animal implements Domesticated
{
    public Dog()    //Default constructor for a Dog
    {
        super();    //calls the superclass default constructor
    }
    
    public Dog(String t, String n, int a, String g, String e, String s) //fully parameterized constructor
    {
        super(t, n, a, g, e, s);    //calls the superclass fully parameterized constructor
    }
    
    
    public void bark()  //Prints that the dog is barking
    {
        System.out.println("Dog is barking");
    }
    
    @Override
    public void greetHuman()    //Prints that the Dog greets human -Overrides the Domesticated interface function
    {
        System.out.println("Dog greets human");
    }

    @Override
    public void walk()  //Prints that the Dog is walking -Overrides the Domesticated interface fucntion
    {
        System.out.println("Dog is walking");
    }
    
    @Override
    public void sound() //Prints the sound that the Dog makes -Overrides the Animal function
    {
        System.out.println("Woof!");
    }
}
