/**
 * Creates three Employee objects and prints the contents of each object.
 * Written by Winston Shih
 * Written on 6/6/2023
 * JDK Version 17.0.1
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1=new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee e2=new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3=new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
    }
    
}
