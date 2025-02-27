/**
 * Encapsulates the concept of an employee with attributes like name, ID number
 * department, and position.
 * Written by Winston Shih
 * Written on 6/6/2023
 * JDK Version 17.0.1
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    public Employee(String name, int idNumber, String department, String position){
        this.name=name;
        this.idNumber=idNumber;
        this.department=department;
        this.position=position;
    }
    public Employee(String name, int idNumber)
    {
        this.name=name;
        this.idNumber=idNumber;
        this.department="";
        this.position="";
    }
    public Employee()
    {
        this.name="";
        this.idNumber=0;
        this.department="";
        this.position="";
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getIDNumber()
    {
        return this.idNumber;
    }
    public void setIDNumber(int idNumber)
    {
        this.idNumber=idNumber;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getPosition()
    {
        return this.position;
    }
    public void setPosition(String department)
    {
        this.department=department;
    }
    public String toString()
    {
        return "Name: "+getName()+"\nID Number: "+getIDNumber()+"\nDepartment: "+getDepartment()+"\nPosition: "+getPosition();
    }
}
