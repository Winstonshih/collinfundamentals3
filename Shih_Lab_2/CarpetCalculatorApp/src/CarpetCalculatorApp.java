/**
 * Creates three RoomCarpet objects and tests methods from RoomDimension and 
 * Room Carpet classes.
 * Written by Winston Shih
 * Written on 6/15/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class CarpetCalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creates RoomDimension objects.
        RoomDimension rd1=new RoomDimension(2,3);
        RoomDimension rd2=new RoomDimension(6,9);
        RoomDimension rd3=new RoomDimension(7,9);
        //Creates RoomCarpet objects.
        RoomCarpet r1=new RoomCarpet(rd1,8);
        RoomCarpet r2=new RoomCarpet(rd2,12);
        RoomCarpet r3=new RoomCarpet(rd3,18);
        //Creates copy constructor object.
        RoomCarpet otherR=new RoomCarpet(r1);
        //Creates clone object.
        RoomCarpet roomCarpetCloned=(RoomCarpet) r2.clone();
        //Creates ArrayList to store RoomCarpet objects
        ArrayList<RoomCarpet> roomcarpets=new ArrayList<RoomCarpet>(3);
        //Adds RoomCarpet objects to roomcarpets ArrayList.
        roomcarpets.add(r1);
        roomcarpets.add(r2);
        roomcarpets.add(r3);
        System.out.println("1st Room Carpet");
        //Prints first RoomDimension object's length, width and area.
        System.out.println(rd1.toString());
        //Prints first RoomCarpet object's Cost per square feet and total cost
        System.out.println(r1.toString());
        //Prints hashcode of first RoomDimension object
        System.out.println("Room Dimension Hash code: "+rd1.hashCode());
        //Prints hashcode of first RoomCarpet object
        System.out.println("Room Carpet Hash code: "+r1.hashCode());
        System.out.println("2nd Room Carpet");
         //Prints second RoomDimension object's length, width and area.
        System.out.println(rd2.toString());
        //Prints second RoomCarpet object's Cost per square feet and total cost
        System.out.println(r2.toString());
        //Prints hashcode of second RoomDimension object
        System.out.println("Room Dimension Hash code: "+rd2.hashCode());
        //Prints hashcode of second RoomCarpet object
        System.out.println("Room Carpet Hash code: "+r2.hashCode());
        System.out.println("3rd Room Carpet");
         //Prints third RoomDimension object's length, width and area.
        System.out.println(rd3.toString());
        //Prints third RoomCarpet object's Cost per square feet and total cost
        System.out.println(r3.toString());
        //Prints hashcode of third RoomDimension object
        System.out.println("Room Dimension Hash code: "+rd3.hashCode());
        //Prints hashcode of third RoomCarpet object
        System.out.println("Room Carpet Hash code: "+r3.hashCode());
        //Tests equals methd of RoomCarpet class.
        if(r1.equals(r2))
        {
            System.out.println("r1 is equal to r2");
        }
        else
        {
            System.out.println("r1 is not equal to r2");
        }
        if(r1.equals(r3))
        {
            System.out.println("r1 is equal to r3");
        }
        else
        {
            System.out.println("r1 is not equal to r3");
        }
        if(r2.equals(r3))
        {
            System.out.println("r2 is equal to r3");
        }
        else
        {
            System.out.println("r2 is not equal to r3");
        }
        //Tests RoomDimension's equals method.
        if(rd1.equals(rd2))
        {
            System.out.println("rd1 is equal to rd2");
        }
        else
        {
            System.out.println("rd1 is not equal to rd2");
        }
        if(rd1.equals(rd3))
        {
            System.out.println("rd1 is equal to rd3");
        }
        else
        {
            System.out.println("rd1 is not equal to rd3");
        }
        if(rd2.equals(rd3))
        {
            System.out.println("rd2 is equal to rd3");
        }
        else
        {
            System.out.println("rd2 is not equal to rd3");
        }
        //Tests RoomCarpet's compareTo method
        if(r1.compareTo(r2)==0)
        {
            System.out.println("r1 and r2 are the same");
        }
        else if(r1.compareTo(r2)<0)
        {
            System.out.println("r1 is greater than r2");
        }
        else
        {
            System.out.println("r1 is less than r2");
        }
        if(r1.compareTo(r3)==0)
        {
            System.out.println("r1 and r3 are the same");
        }
        else if(r1.compareTo(r3)<0)
        {
            System.out.println("r1 is greater than r3");
        }
        else
        {
            System.out.println("r1 is less than r3");
        }
        if(r2.compareTo(r3)==0)
        {
            System.out.println("r2 and r3 are the same");
        }
        else if(r2.compareTo(r3)<0)
        {
            System.out.println("r2 is greater than r3");
        }
        else
        {
            System.out.println("r2 is less than r3");
        }
        //Tests RoomDimension's compareTo method
        if(rd1.compareTo(rd2)==0)
        {
            System.out.println("rd1 and rd2 are the same");
        }
        else if(rd1.compareTo(rd2)<0)
        {
            System.out.println("rd1 is greater than rd2");
        }
        else
        {
            System.out.println("rd1 is less than rd2");
        }
        if(rd1.compareTo(rd3)==0)
        {
            System.out.println("rd1 and rd3 are the same");
        }
        else if(rd1.compareTo(rd3)<0)
        {
            System.out.println("rd1 is greater than rd3");
        }
        else
        {
            System.out.println("rd1 is less than rd3");
        }
        if(rd2.compareTo(rd3)==0)
        {
            System.out.println("rd2 and rd3 are the same");
        }
        else if(r2.compareTo(r3)<0)
        {
            System.out.println("rd2 is greater than rd3");
        }
        else
        {
            System.out.println("rd2 is less than rd3");
        }
        //Prints hash codes of copy constructor amd clone objects
        System.out.println("Copy constructor");
        System.out.println("Hash code: "+otherR.hashCode());
        System.out.println("Clone() method");
        System.out.println("Hash code: "+roomCarpetCloned.hashCode());
        //Tests RoomCarpet's finalize method
        r1.finalize();
        r2.finalize();
        r3.finalize();
        //Tests RoomDimension's finalize method
        rd1.finalize();
        rd2.finalize();
        rd3.finalize();
        //Deletes clone and copy constrcutor objects
        otherR.finalize();
        roomCarpetCloned.finalize();
        
    }
    
}
