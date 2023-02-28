/*
    StudentTest.java main class

    @author Danny Garcia
    @version 1.0
    @since 2022-2-22
    Last modified date: 2/28/2023

    This main class is called StudentTest.java. Main instaniates a Student object
    and prints out a Course Schedule for the Student

    Executes when you run the program
*/

public class StudentTest 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");   //instantiating a Student Object
        Student.Course c1 = s1.new Course();    //instantianting a Course object using a nested class inside the Student subclass
        c1.printSchedule(); //Prints out a schedule
    }
    
}
