/**
 *  Assignment1 Program
 *  Person.java class
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 *  Last Modified Date: 2/28/2023
 * 
 *  This is a class called Person.java
 *  Class has constructors in order to instantiate a Person object
 *  Attributes of a Person include: firstName, lastName, age, SSN, address, gender, and weight
 *  This class has setters and getters along with two functions:
 *  toString()- which overrides the implementation of toString() which returns a string representation of an object
 *  introduce()- which prints the object information and has a return type void
 * 
 *  Executes when EmployeeTest.java is run
 */

/**
 *
 * @author danie
 */
public class Person 
{
    //These are the variables used for Person class
    private String firstName;
    private String lastName;
    private int age;
    private String SSN;
    private String address;
    private String gender;
    private double weight;
    
    //Constructors used for the Person class
    public Person() //Default constructor
    {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.SSN = "";
        this.address = "";
        this.gender = "";
        this.weight = 0.0;
    }
    
    public Person(String f, String l)   //Requires a first name and last name
    {
        this.firstName = f;
        this.lastName = l;
        this.age = 0;
        this.SSN = "";
        this.address = "";
        this.gender = "";
        this.weight = 0.0;
    }
    
    public Person(String f, String l, int a)    //Requires a first name, last name, and age
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.SSN = "";
        this.address = "";
        this.gender = "";
        this.weight = 0.0;
    }
    
    public Person(String f, String l, int a, String s)  //Requires a first name, last name, age, and SSN
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.SSN = s;
        this.address = "";
        this.gender = "";
        this.weight = 0.0;
    }
    
    public Person(String f, String l, int a, String s, String ad)   //Requires a first name, last name, age, SSN, and address
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.SSN = s;
        this.address = ad;
        this.gender = "";
        this.weight = 0.0;
    }
    
    public Person(String f, String l, int a, String s, String ad, String g) //Requires a first name, last name, age, SSN, address, and gender
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.SSN = s;
        this.address = ad;
        this.gender = g;
        this.weight = 0.0;
    }
    
    public Person(String f, String l, int a, String s, String ad, String g, double w)   //Requires a first name, last name, age, SSN, address, gender, and weight
    {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.SSN = s;
        this.address = ad;
        this.gender = g;
        this.weight = w;
    }
    
    //Setters
public void setFirstName(String f)  //Sets the Person's first name
    {
        this.firstName = f;
    }
    
    public void setLastName(String l)   //Sets the Person's last name
    {
        this.lastName = l;
    }
    
    public void setAge(int a)   //Sets the Person's age
    {
        this.age = a;
    }
    
    public void setSSN(String s)    //Sets the Person's SSN
    {
        this.SSN = s;
    }
    
    public void setAddress(String ad)   //Sets the Person's address
    {
        this.address = ad;
    }
    
    public void setGender(String g) //Sets the Person's gender
    {
        this.gender = g;
    }
    
    public void setWeight(double w) //Sets the Person's weight
    {
        this.weight = w;
    }
    
    
    //Getters
    public String getFirstName()    //Gets the Person's first name
    {
        return firstName;
    }
    
    public String getLastName() //Gets the Person's last name
    {
        return lastName;
    }
    
    public int getAge() //Gets the Person's age
    {
        return age;
    }
    
    public String getSSN()  //Gets the Person's SSN
    {
        return SSN;
    }
    
    public String getAddress()  //Gets the Person's address
    {
        return address;
    }
    
    public String getGender()   //Gets the Person's gender
    {
        return gender;
    }
    
    public double getWeight()   //Gets the Person's weight
    {
        return weight;
    }
    
    //Returns a string representation of the object
    @Override
    public String toString()
    {
        return this.firstName + this.lastName + this.age + this.SSN + this.address +
                this.gender + this.weight;
    }
    
    //Prints the object information
    public void introduce()
    {
        System.out.println("First Name: " + this.getFirstName() + "\nLast Name: " + this.getLastName()
        + "\nAge: " + this.getAge() + "\nSSN: " + this.getSSN() + "\nAddress: " + this.getAddress()
        + "\nGender: " + this.getGender() + "\nWeight: " + this.getWeight()+" lbs");
    }
    
    
}
