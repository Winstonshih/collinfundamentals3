/**
 * Class encapsulates concept of a room's dimensions.
 * Written by Winston Shih
 * Written on 6/15/2023
 * JDK Version 17.0.1
 */
public class RoomDimension implements Comparable{
    private double length;
    private double width;
    //Constructs a RoomDimension object
    public RoomDimension(double len, double w)
    {
        length=len;
        width=w;
    }
    //Constructs copy RoomDimension object
    public RoomDimension(RoomDimension o2)
    {
        length=o2.length;
        width=o2.length;
    }
    //ToString method prints length and width of Room Dimension object.
    public String toString()
    {
        return "Length: "+length+" ft\nWidth: "+width+" ft\nArea: "+getArea()+" ft^2";
    }
    //Allows creation of RoomDimension object clones.
    public Object clone()
    {
        return new RoomDimension(this);
    }
    //Creates hashcode for fields
    public int hashCode()
    {
        int result=17;
        result=37*result+Double.hashCode(length);
        result=37*result+Double.hashCode(width);
        return result;
    }
    //Tests equivalence of 2 object's carpet areas.
    public boolean equals(RoomDimension obj)
    {
        boolean status;
        if(length==obj.length&&width==obj.width)
        {
            status=true;
        }
        else
        {
            status=false;
        }
        return status;
    }
    //Compares areas of two objects.
    public int compareTo(Object o)
    {
        int result=0;
        RoomDimension r=(RoomDimension) o;
        if(getArea()==r.getArea())
        {
            result=0;
        }
        else if(getArea()<r.getArea())
        {
            result=-1;
        }
        else
        {
            result=1;
        }
        return result;
    }
    //Accesses area of RoomDimension object
    public double getArea()
    {
        return length*width;
    }
    //Destroys Room Dimension object
    public void finalize()
    {
        System.out.println("Room Dimension object has been destroyed!");
    }
}
