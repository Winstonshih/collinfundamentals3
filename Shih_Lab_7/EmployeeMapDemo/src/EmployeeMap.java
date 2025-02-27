/**
 * Creates methods to add elements to EmployeeMap or look up elements.
 * Written by Winston Shih
 * Written on 6/15/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class EmployeeMap {
    SortedMap<Integer,String> empMap=new TreeMap<>();
    public void add(Employee e)
    {
        empMap.put(e.getID(), e.getName());
    }
    public String lookUp(int ID)
    {
        return empMap.get(ID);
    }
}
