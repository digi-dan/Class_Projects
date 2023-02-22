/**
 *  Assignment1 Program
 *  Cat.java subclass
 *  Subclass of Animal.java
 *  implements Domesticated and Scratcher interface
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 * 
 *  This is a subclass called Cat.java
 *  This is a subclass of Animal.java class and gains all the attributes of a generic animal
 *  This subclass also implements Domesticated and Scratcher interface
 *  This subclass has constructors in order to instantiate a Cat object
 *  Attributes of a cat directly reflect the attributes of a generic animal
 *  Along with the functions it gains from the Animal class, functions of a Cat include:
 *  walk()- prints that the Cat is walking
 *  greetHuman()- prints that the Cat greets a human
 *  scratch()- prints that the Cat scratches
 *  sound()- prints a sound that a Cat makes
 */

/**
 *
 * @author danie
 */
public class Cat extends Animal implements Domesticated, Scratcher
{
    //Constructors for my Cat class. Uses the superconstructor from Animal Class
    public Cat()
    {
        super();    //superclass default constructor
    }
    
    public Cat(String t, String n, int a, String g, String e, String s) //fully parameterized Cat constructor
    {
        super(t, n, a, g, e, s);    //superclass constructor
    }
    
    //Functionalities of a Cat
    @Override
    public void walk()  //Prints that the Cat is walking -Overrides the Domesticated interface function
    {
        System.out.println("Cat is walking");
    }
    
    @Override
    public void greetHuman()    //Prints that the Cat greets a human - Overrides the Domesticated interface function
    {
        System.out.println("Cat greets human");
    }
    
    @Override
    public void scratch()   //Prints that the Cat scratches - Overrides the Scratcher interface function
    {
        System.out.println("Cat scratches!");
    }
    
    @Override
    public void sound() //Prints a sound that a Cat makes -Overrides the Animal function
    {
        System.out.println("Meow!");
    }
}
