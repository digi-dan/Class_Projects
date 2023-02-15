/**
 *  Assignment1 Program
 *  Animal.java Class
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 * 
 *  This is a class called Animal.java class
 *  This class has a constructor which instantiates an Animal object, setters, getters, and basic functions of an Animal
 *  attributes include: animal type, name, age, gender, environment it lives in, and its speed
 *  Along with setters and getters the functions include:
 *  move()- prints that the Animal moving at a certain speed
 *  sound()- prints that the Animal makes a sound
 *  eat()- prints that the Animal is eating
 *  sleep()- prints that the Animal is sleeping
 *  toString()- overrides the implementation of toString() and returns a String representation of the Animals objects
 */
package Assignment1;

/**
 *
 * @author danie
 */
public class Animal 
{
    //attributes for the Animal class
    private String type;    //Animal type
    private String name;    //Animal name
    private int age;    //Animal's age
    private String gender;  //Animal's gender
    private String environment; //Environment that the Animal lives in
    private String speed;   //Speed at which the Animal moves
    
    //Setters
    public void setAnimalType(String t) //Sets the Animal's type
    {
        this.type = t;
    }
    
    public void setName(String n)   //Sets the Animal's name
    {
        this.name = n;
    }
    
    public void setAge(int a)   //Sets the Animal's age
    {
        this.age = a;
    }
    
    public void setGender(String g) //Sets the Animal's gender
    {
        this.gender = g;
    }
    
    public void setEnvironment(String e)    //Sets the environment it lives in
    {
        this.environment = e;
    }
    
    public void setSpeed(String s)  //Sets the Animal's speed
    {
        this.speed = s;
    }
    
    
    //Getters
    public String getAnimalType()   //Gets the Animal's type
    {
        return type;
    }
    
    public String getName() //Gets the Animal's name
    {
        return name;
    }
    
    public int getAge() //Gets the Animals age
    {
        return age;
    }
    
    public String getGender()   //Gets the Animal's gender
    {
        return gender;
    }
    
    public String getEnvironment()  //Gets the environment it lives in
    {
        return environment;
    }
    
    public String getSpeed()    //Gets the Animal's speed
    {
        return speed;
    }
    
    //Constructors for my Animal class
    public Animal() //Default constructor
    {
        this.type = "";
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.environment = "";
        this.speed = "";
    }
    
    public Animal(String t, String n, int a, String g, String e, String s)  //fully parameterized constructor
    {
        this.type = t;
        this.name = n;
        this.age = a;
        this.gender = g;
        this.environment = e;
        this.speed = s;
    }
    
    //These are the general functionalities of an Animal
    public void move()  //prints that the Animal is moving
    {
        System.out.println(type +" is moving at approximately " + speed);
    }
    
    public void sound() //prints that the Animal is making a sound
    {
        System.out.println(type + " makes a sound!");
    }
    
    public void eat()   //prints that the Animal is eating
    {
        System.out.println(type + " is eating");
    }
    
    public void sleep() //prints that the Animal is sleeping
    {
        System.out.println(type + " is sleeping in the " + environment);
    }
    
    //Overrides the implementation of toString() and returns a String representation of the Animals attributes
    @Override
    public String toString()
    {
        return this.type + this.name + this.age + this.gender + this.environment + this.speed;
    }
}
