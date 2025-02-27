/**
 * Class encapsulates concept of cost of a room's carpet.
 * Written by Winston Shih
 * Written on 6/15/2023
 * JDK Version 17.0.1
 */
public class RoomCarpet implements Comparable{
    private RoomDimension size;
    private double carpetCost;
    //Constructs RoomCarpet object
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size=dim;
        carpetCost=cost;
    }
    //Creates copy of RoomCarpet object
    public RoomCarpet(RoomCarpet o)
    {
        size=o.size;
        carpetCost=o.carpetCost;
    }
    //Creates clone of RoomCarpet object.
    public Object clone()
    {
        return new RoomCarpet(this);
    }
    //Determines hashcode of size and carpet cost.
    public int hashCode()
    {
        int result=17;
        result=37*result+size.hashCode();
        result=37*result+Double.hashCode(carpetCost);
        return result;
    }
    //Calculates total cost of carpet.
    public double getTotalCost()
    {
        return carpetCost*size.getArea();
    }
    //Prints Cost per square foor and total cost.
    public String toString()
    {
        return "Cost per square foot: $"+carpetCost+"\nTotal Cost: $"+getTotalCost();
    }
    //Compares equivalence of 2 RoomCarpetObjects using size and carpetCost
    public boolean equals(RoomCarpet obj)
    {
        boolean status;
        if(size.equals(obj.size)&&carpetCost==obj.carpetCost)
        {
            status=true;
        }
        else
        {
            status=false;
        }
        return status;
    }
    //Compares size and carpetCost of 2 objects.
    public int compareTo(Object o)
    {
        int result=0;
        RoomCarpet r=(RoomCarpet) o;
        if(size.equals(r.size)&&carpetCost==r.carpetCost)
        {
            result=0;
        }
        else if(size.equals(r.size)&&carpetCost<r.carpetCost)
        {
            result=-1;
        }
        else
        {
            result=1;
        }
        return result;
    }
    //Destroys RoomCarpet object.
    public void finalize()
    {
        System.out.println("Room Carpet object has been destroyed!");
    }
}
