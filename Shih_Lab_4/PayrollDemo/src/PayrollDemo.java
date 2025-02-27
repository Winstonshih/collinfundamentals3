/**
 * Program is supposed to solve Payroll Class Programming Challenge.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class PayrollDemo {
    public static void main(String[] args) {
        String empName;
        int empId;
        double empPayRate;
        double empHoursWorked;
        Scanner input=new Scanner(System.in);
        //Asks for employee to enter their name.
        System.out.print("Enter the employee's name: ");
        empName = input.nextLine();
        //Prompts employee for their id.
        System.out.print("Enter the employee's ID number: ");
        empId = input.nextInt();
        //Asks for employee's hourly wage rate.
        System.out.print("Enter the employee's hourly pay rate: ");
        empPayRate = input.nextDouble();
        //Asks for input for number of hours employee worked.
        System.out.print("Enter the number of hours worked " +
                       " by the employee: ");
        empHoursWorked = input.nextDouble();
        try
        {
            //Creates a Payroll object and initializes it with a name and id.
            Payroll w = new Payroll(empName, empId);
            //Sets PayRate and total hours worked since empPayRate and empHoursWorked
            // were not set in constructor.
            w.setPayRate(empPayRate);
            w.setHoursWorked(empHoursWorked);
            //Prints out the payroll data of an employee 
            System.out.println("\nEmployee Payroll Data");
            System.out.println("Name: " + w.getName());
            System.out.println("ID Number: " + w.getIdNumber());
            System.out.println("Hourly pay rate: " + w.getPayRate());
            System.out.println("Hours worked: " + w.getHoursWorked());
            System.out.println("Gross pay: $" + w.getGrossPay());
        }
        catch(InvalidNameException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidIDException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidHoursException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InvalidHourlyRateException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
