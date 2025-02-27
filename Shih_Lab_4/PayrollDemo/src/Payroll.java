/**
 * Program sets and stores info about employee's name, ID, hourly wage, and
 * number of hours worked.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
public class Payroll{
    private String empName;          // Employee name
    private int idNum;         // ID number
    private double payPerHour;       // Hourly pay rate
    private double numHoursWorked;   // Number of hours worked

    /**
        The constructor initializes a Payroll object with the employee's name and ID number.
        @param name The employee's name.
        @param id The employee's ID number.
    */
    public Payroll(String name, int id) 
            throws InvalidNameException,InvalidIDException, 
            InvalidHoursException,InvalidHourlyRateException
    {
        try
        {
            if(name.length()==0)
            {
                throw new InvalidNameException();
            }
            else
            {
                empName = name;
            }
        }
        catch(InvalidNameException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            if(id<=0)
            {
                throw new InvalidIDException();
            }
            else
            {
                idNum=id;
            }
        }
        catch(InvalidIDException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**
        The setName sets the employee's name of a Payroll Object.
        @param name The employee's name.
    */
    public void setName(String name) throws InvalidNameException
    {
        if(name.length()==0)
        {
            throw new InvalidNameException();
        }
        else
        {
            empName=name;
        }
    }
   /**
      The setIdNumber sets the employee's ID number of PayRoll Object.
      @param id The employee's ID number.
   */ 
   public void setIdNumber(int id) throws InvalidIDException
   {
       if(id<=0)
       {
           throw new InvalidIDException();
       }
       else
       {
           idNum = id; 
       }
   }
   /**
      The setPayRate sets the employee's pay rate per hour.
      @param payPerHr The employee's hourly pay rate.
   */
   public void setPayRate(double pay) throws InvalidHourlyRateException
   {
       try
        {
            if(pay<0||pay>25)
            {
                throw new InvalidHourlyRateException();
            }
        }
        catch(InvalidHourlyRateException e)
        {
            System.out.println(e.getMessage());
        }
       payPerHour= pay;
   }
   /**
      The setHoursWorked sets the number of hours worked.
      @param hoursWorked The number of hours worked.
   */
   public void setHoursWorked(double hoursWorked) throws InvalidHoursException
   {
       if(hoursWorked<0||hoursWorked>84)
       {
           throw new InvalidHoursException();
       }
       else
       {
           numHoursWorked = hoursWorked;
       }
   }
   /**
      The getName returns the employee's name of Payroll Object.
      @return The employee's name.
   */
   public String getName()
   {
      return empName;
   }
   /**
      The getIdNumber returns the employee's ID number.
      @return The employee's ID number.
   */
   public int getIdNumber()
   {
      return idNum;
   }
   /**
      The getPayRate returns the employee's pay rate.
      @return The employee's pay rate.
   */
   public double getPayRate()
   {
      return payPerHour;
   }
   /**
      The getHoursWorked returns the hours worked by the
      employee.
      @return The hours worked.
   */
   public double getHoursWorked()
   {
      return numHoursWorked;
   }
   /**
      The getGrossPay returns the employee's gross pay.
      @return The employee's gross pay.
   */
   public double getGrossPay()
   {
       double grossPay= numHoursWorked*payPerHour;
      return grossPay;
   }
}
