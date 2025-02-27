/**
 * Subclass of ship that encapsulates concept of a cargo ship.
 * Written by Winston Shih
 * Written on 6/20/2023
 * JDK Version 17.0.1
 */
public class CargoShip extends Ship{
    private int tonnage;
    //Constructs CargoShip object.
    public CargoShip(String n, String y, int t)
    {
        super(n,y);
        tonnage=t;
    }
    //Sets Cargo Ship's tonnage to specific amount.
    public void setTonnage(int t)
    {
        tonnage=t;
    }
    //Accesses Cargo Ship's tonnage.
    public int getTonnage()
    {
        return tonnage;
    }
    //Prints name, year built, and cargo capacity (tonnage) of a cargo ship.
    @Override
    public String toString()
    {
        return "Name: "+getName()+"\nYear Built: "+getYearBuilt()+"\nCargo Capacity: "+getTonnage();
    }
}
