/**
 * Encapsulates concept of an employee.
 * Written by Winston Shih
 * Written on 7/17/2023
 * JDK Version 17.0.1
 */
public class Employee {
    private String empName;
    private int empID;
    public Employee(int id, String n)
    {
        empID=id;
        empName=n;
    }
    public String getName()
    {
        return empName;
    }
    public void setName(String name)
    {
        empName=name;
    }
    public int getID()
    {
        return empID;
    }
    public void setID(int ID)
    {
        empID=ID;
    }
    public String toString()
    {
        return "Name: "+getName()+"\nID: "+getID();
    }
}
