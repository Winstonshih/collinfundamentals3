/**
 * Creates Ship, CruiseShip, and CargoShip objects, adds them to an array list,
 * and tests out the 3 class's toString methods.
 * Written by Winston Shih
 * Written on 6/20/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class ShipDemo {
    public static void main(String[] args) {
        Ship s1=new Ship("RMS Titanic","1908");
        CruiseShip c1=new CruiseShip("Aegean Goddess", "1994", 1512);
        CargoShip cs1=new CargoShip("COSCO Shipping Universe", "2018", 215553 );
        Ship s2=new Ship("Queen Mary 2", "2003");
        CruiseShip c2= new CruiseShip("Oasis of the Seas", "2006", 5602);
        CargoShip cs2=new CargoShip("Ever Given","2018",220940);
        ArrayList<Ship> shipLog=new ArrayList<Ship>();
        shipLog.add(s1);
        shipLog.add(c1);
        shipLog.add(cs1);
        shipLog.add(s2);
        shipLog.add(c2);
        shipLog.add(cs2);
        for(int i=0;i<shipLog.size();i++)
        {
            System.out.println(shipLog.get(i).toString());
        }
    }
    
}
