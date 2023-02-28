/**
 * Assignment1 Program
 * Student class
 * 
 * @author Danny Garcia
 * @version 1.0
 * @since 2022-2-22
 * 
 * This is a class called Student.java
 * Class has constructors in order to instantiate a Student object
 * attributes of a Student include: firstName, lastName, age, GPA, Major, and Department
 * 
 * Class also contains setters and getters for each attribute as well as
 * a nested subclass called Course which has a function that prints a Course schedule
 * 
 *  Executes when StudentTest.java is run
 */

package Assignment1;

/**
 *
 * @author danie
 */
public class Student 
{
    //These are the variables used for the Student class
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    
    /*Constructors that create a Student object
        each constructor requires one more variable
    */
    public Student()    //Default constructor
    {
        firstName = "";
        lastName = "";
        age = 0;
        gpa = 0.0;
        major = "";
        department = "";
    }
    
    public Student(String f, String l)  //Requires a first name and last name
    {
        firstName = f;
        lastName = l;
        age = 0;
        gpa = 0.0;
        major = "";
        department = "";
    }
    
    public Student(String f, String l, int a)   //Requires a first name, last name, and age
    {
        firstName = f;
        lastName =l;
        age = a;
        gpa = 0.0;
        major = "";
        department = "";
    }
    
    public Student(String f, String l, int a, double g) //Requires a first name, last name, age, and GPA
    {
        firstName = f;
        lastName = l;
        age = a;
        gpa = g;
        major = "";
        department = "";
    }
    
    public Student(String f, String l, int a, double g, String m)   //Requires a first name, last name, age, GPA, and major
    {
        firstName = f;
        lastName = l;
        age = a;
        gpa = g;
        major = m;
        department = "";
    }
    
    public Student(String f, String l, int a, double g, String m, String d) //Requires a first name, last name, age, GPA, major, and department
    {
        firstName = f;
        lastName = l;
        age = a;
        gpa = g;
        major = m;
        department = d;
    }
    
    //Setters
    public void setFirstName(String f)  //Sets the Students first name
    {
        firstName = f;
    }
    
    public void setLastName(String l)   //Sets the Students last name
    {
        lastName = l;
    }
    
    public void setAge(int a)   //Sets the Students age
    {
        age = a;
    }
    
    public void setGpa(double g)    //Sets the Students GPA
    {
        gpa = g;
    }
    
    public void setMajor(String m)  //Sets the Students major
    {
        major = m;
    }
    
    public void setDepartment(String d) //Sets the Students department
    {
        department = d;
    }
    
    
    //Getters
    public String getFirstName()    //Gets the Students first name
    {
        return firstName;
    }
    
    public String getLastName() //Gets the Students last name
    {
        return lastName;
    }
    
    public int getAge() //Gets the Students age
    {
        return age;
    }
    
    public double getGpa()  //Gets the Students GPA
    {
        return gpa;
    }
    
    public String getMajor()    //Gets the Students major
    {
        return major;
    }
    
    public String getDepartment()   //Gets the Students department
    {
        return department;
    }
    
    /* Nested non-static inner class called Course
        implements printSchedule() method.
        This method shoud print out the student's course schedule
        Do not need to declare the schedule details as attributes.
        Simply print a hard coded string in the printSchedule method.
    */
    
    class Course {
        //Function that prints a Students class schedule. Schedule is hard coded in
        void printSchedule(){
            System.out.println("Class Schedule:\nCS146 Mon/Wed 9-10:15 \nANTH25 Mon/Wed 10:30-11:45 \nRTVF110 Mon/Wed 12-1:15 \nCS151 Mon/Wed 6-7:15");
        }
    }
}

