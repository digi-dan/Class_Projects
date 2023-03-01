/**
 *  Assignment1 Program
 *  EmployeeTest main class
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 *  Last Modified Date: 3/1/2023
 * 
 *  This main class is called EmployeeTest.java. It instantiates employee objects by taking in 
 *  the parameters needed for an Employee. It then displays each Employee's information while
 *  also calculating their pay and displays that information as well
 * 
 *  Executes when file is ran
 */

public class EmployeeTest 
{
    public static void main(String[] args) 
    {   
        //Instantiates 5 Employee objects with different values
        Employee e1 = new Employee("Joe", "Smith", 25, "160-95-7825", "One Washington Square", "Male", 205.3, 3805, "contractor", 60); 
        Employee e2 = new Employee("Lisa", "Gray", 24, "845-15-3647", "Santa Cruz", "Female", 125.8, 2132, "full time", 110000);
        Employee e3 = new Employee("Timothy", "Briggs", 36, "087-51-7423", "935 McLaughlin", "Male", 180.5, 3421, "full time", 80000);
        Employee e4 = new Employee("George", "Wallace", 53, "172-34-7213", "Oakland", "Male", 210.4, 1243, "part time", 20);
        Employee e5 = new Employee("Amy", "Student", 20, "342-43-9573", "One Washington Square", "Female", 115.2, 5420, "contractor", 45);
        
        //Prints out 1st Employees information along with pay
        e1.introduce();
        double e1Pay = e1.calculatePay(30);
        System.out.println("Pay: $" + String.format("%.2f", e1Pay) + "\n");
        
        //Prints out 2nd Employees information along with pay
        e2.introduce();
        double e2Pay = e2.calculatePay(2);
        System.out.println("Pay: $" + String.format("%.2f", e2Pay) + "\n");
        
        //Prints out 3rd Employees information along with pay
        e3.introduce();
        double e3Pay = e3.calculatePay(4);
        System.out.println("Pay: $" + String.format("%.2f", e3Pay) + "\n");
        
        //Prints out 4th Employees information along with pay
        e4.introduce();
        double e4Pay = e4.calculatePay(25);
        System.out.println("Pay: $" + String.format("%.2f", e4Pay) + "\n");
        
        //Prints out 5th Employees information along with pay
        e5.introduce();
        double e5Pay = e5.calculatePay(45);
        System.out.println("Pay: $" + String.format("%.2f", e5Pay) + "\n");
    }
    
}
