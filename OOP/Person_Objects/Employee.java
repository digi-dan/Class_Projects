/**
 *  Assignment1 Program
 *  Employee subclass
 *  child of Person.java parent class
 * 
 *  @author Danny Garcia
 *  @version 1.0
 *  @since 2022-2-22
 * 
 *  This is a subclass called Employee.java
 *  This class extends Person class and gains all of its attributes since an employee is a person
 *  This subclass has constructors to instantiate an Employee object along with setters, getters,
 *  and functions
 *  attributes include: employee ID, employee status(full time, part time, or contractor, and base pay)
 *  Along with setters and getters, functions include:
 *  introduce()- prints out the employee's object information
 *      no parameters
 *  calculatePay()- calculates the employee's pay by looking at the employees status and calculating the pay
 *  according to their base pay.
 *      parameters needed: double unitsWorked (weeks or hours worked)
 * 
 *  Executes when EmployeeTest.java is run
 */

public class Employee extends Assignment1.Person
    {
        /*Variables used for the Employee class
        payAmount depends on employee status
        if employee is full-time, pay amount will reflect per year
        if employee is part-time or contractor, pay amount will reflect per hour
        */
        private int empID;  //Employee ID
        private String empStatus;   //Employee's status (full time, part time, contractor)
        private double payAmount;   //Employee's base pay
        
        //Setters
        public void setEmployeeID(int id)   //Sets the Employee's ID
        {
            this.empID = id;
        }
        
        public void setEmployeeStatus(String status)    //Sets the Employee's status
        {
            this.empStatus = status;
        }
        
        public void setPayAmount(double payAm)  //Sets the Employee's base pay
        {
            this.payAmount = payAm;
        }
        
        
        //Getters
        public int getEmployeeID()  //Gets the Employee's ID
        {
            return empID;
        }
        
        public String getEmployeeStatus()   //Gets the Employee's status
        {
            return empStatus;
        }
        
        public double getPayAmount()    //Gets the Employee's base pay
        {
            return payAmount;
        }
        
        /*Constructors for the Employee class. Since an employee has all the functionality
        of a person. Employee class extends Person class. Instantiating an object
        with the Employee class should pass on instantiation of superclass' attributes
        to the superclass constructor
        */
        
        public Employee()   //default constructor
        {
            super(); //call the superclass default constructor
            this.empID = 0;
            this.empStatus = "";
            this.payAmount = 0.0;
        }
        
        /*Constructor for an Employee object with just the attributes of a Person set
            This constructor only takes in the parameters of a Person object and sets 
            the employee attributes to a default value
            This employee may have just been hired and doesn't have any of these values yet
        */
        public Employee(String f, String l, int a, String s, String ad, String g, double w)
        {
            super(f, l, a, s, ad, g, w);
            this.empID = 0;
            this.empStatus = "";
            this.payAmount = 0.0;
        }
        
        /*Constructor for an Employee object.
            Employee is a Person so to instantiate an Employee object, you must
            input all the parameters of a Person, along with the parameters of an Employee object
            which is their ID, status, and base pay
        */
        public Employee(String f, String l, int a, String s, String ad, String g, double w, int id, String status, double payAm)
        {
            super(f, l, a, s, ad, g, w); //Call the superclass constructor that accepts all parameters
            this.empID = id;
            this.empStatus = status;
            this.payAmount = payAm;
        }
        
        /*introduce() function which overrides the function
            introduce() in the Person superclass. This function
            prints out Person's values as well as the Employee's values
        */
        @Override
        public void introduce()
        {
            super.introduce();
            System.out.println("\nEmployee ID: " + empID + "\nEmployee Status: " + empStatus
            + "\nBase Pay: $" + payAmount);
        }
        
        /*calculatePay() function calculates the Employee's pay according to Employee status
            and hours worked. Parameters need: double unitsWorked
            Returns a double value
        */
        public double calculatePay(double unitsWorked)
        {
            if(empStatus.equalsIgnoreCase("full time"))
            {
                return (payAmount/52) * unitsWorked;
            }
            else
                return payAmount * unitsWorked;
        }
    }
