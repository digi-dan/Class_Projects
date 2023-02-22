/**
 *  Assignment1 Program
 *  Racoon subclass
 *  Subclass of Animal.java Class
 *  Implements Scratcher interface
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 *  
 *  This is a subclass called Racoon.java
 *  This is a subclass of Animal.java and gains all the attributes of a generic animal
 *  This class also implements Scratcher interface
 *  This class has constructors in order to instantiate a Racoon object
 *  Attributes of a Racoon directly reflect the attributes of a generic animal
 *  Along with the functions it gains from the Animal class functions also include:
 *  scratch()- prints that the Racoon scratches
 */
package Assignment1;

/**
 *
 * @author danie
 */
public class Racoon extends Assignment1.Animal implements Scratcher
{
    //Constructors for the Racoon class. Uses the super constructor from the Animal class
    public Racoon() //default constructor
    {
        super();    //superclass default constructor
    }
    
    public Racoon(String t, String n, int a, String g, String e, String s)  //fully parameterized Racoon constructor
    {
        super(t, n, a, g, e, s);    //superclass fully parameterized constructor
    }
    
    @Override
    public void scratch()   //Prints that the Racoon stratches -Overrides Scratcher interface function
    {
        System.out.println("Racoon scratches!");
    }
}
