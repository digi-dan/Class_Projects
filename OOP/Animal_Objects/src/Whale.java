/**
 *  Assignment1 Program
 *  Whale subclass
 *  Subclass of Animal.java class
 *  Implements Swimmer interface
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 *
 *  This is a subclass called Whale.java
 *  This is a subclass of Animal.java and gains all the attributes of a generic Animal
 *  This class also implements Swimmer interface
 *  This class has a constructor that instantiates a Whale object
 *  Attributes of a Whale object directly reflect attributes of an Animal object
 *  Along with the functions it gains from the Animal class, functions include:
 *  swim()- Prints that the Whale is swimming
 */
package Assignment1;

/**
 *
 * @author danie
 */
public class Whale extends Assignment1.Animal implements Swimmer
{
    //Constructors for the Whale class. Gets the super constructor from the Animal parent class
    public Whale()  //default constructor
    {
        super();    //superclass default constructor
    }
    
    public Whale(String t, String n, int a, String g, String e, String s)   //fully parameterized constructor
    {
        super(t, n, a, g, e, s);    //superclass fully parameterized constructor
    }
    
    //Overriding the swim function of the Swimmer interface
    @Override
    public void swim()  //Prints that the Whale is swimming
    {
        System.out.println("Whale is swimming");
    }
}
