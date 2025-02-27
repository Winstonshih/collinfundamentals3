/**
 * Tests Employee methods on EmployeeMap objects
 * Written by Winston Shih
 * Written on 7/17/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class EmployeeMapDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        EmployeeMap e=new EmployeeMap();
        e.add(new Employee(1, "Lydia"));
        e.add(new Employee(2, "Gus"));
        e.add(new Employee(3, "Walter"));
        e.add(new Employee(4, "Mike"));
        try
        {
            System.out.println("Enter ID of employee: ");
            int id=input.nextInt();
            if(e.lookUp(id)==null)
            {
                throw new Exception();
            }
            System.out.println("Name is "+e.lookUp(id));
        }
        catch(Exception err)
        {
            System.out.println("Invalid ID.");
        }
    }
}
