/**
 * Subclass of ship that encapsulates concept of a cruise ship.
 * Written by Winston Shih
 * Written on 6/20/2023
 * JDK Version 17.0.1
 */
public class CruiseShip extends Ship{
     private int passengers;
     //Creates Cruise Ship object.
     public CruiseShip(String n, String y, int p)
     {
         super(n,y);
         passengers=p;
     }
     //Sets number of passengers.
     public void setPassengers(int p)
     {
         passengers=p;
     }
     //Accesses number of passengers.
     public int getPassengers()
     {
         return passengers;
     }
     //Prints name, year Ship was built, and max number of passengers on ship.
     @Override
     public String toString()
     {
         return "Name: "+getName()+"\nYear Built: "+getYearBuilt()+"\nMaximum Number of Passengers: "+getPassengers();
     }
}
