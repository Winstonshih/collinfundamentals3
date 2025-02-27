/**
 * Creates Ship, CruiseShip, and CargoShip objects, adds them to an array list,
 * and tests out the 3 class's toString methods.
 * Written by Winston Shih
 * Written on 6/20/2023
 * JDK Version 17.0.1
 */
public class Ship implements Displayable{
    private String name;
    private String yearBuilt;
    //Constructs Ship object.
    public Ship(String n, String y)
    {
        name=n;
        yearBuilt=y;
    }
    //Sets name of ship.
    public void setName(String n)
    {
        name=n;
    }
    //Sets year that ship was built.
    public void setYearBuilt(String y)
    {
        yearBuilt=y;
    }
    //Accesses name of ship.
    public String getName()
    {
        return name;
    }
    //Accesses year that the ship was built.
    public String getYearBuilt()
    {
        return yearBuilt;
    }
    //Prints name and year that ship was built.
    public String toString()
    {
        return "Name: "+getName()+"\nYear Built: "+getYearBuilt();
    }
    //Prints name and year that ship was built.
    @Override
    public void display()
    {
        System.out.println("Name: "+getName()+"\nYear Built: "+getYearBuilt());
    }
}
