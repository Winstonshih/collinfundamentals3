/**
 * Searches list for specific phrase.
 * Written by Winston Shih
 * Written on 7/7/2023
 * JDK Version 17.0.1
 */
public class ObjectBinarySearcher {
    public static int search(Comparable [] a, Comparable v)
    {
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int m=(low+high)/2;
            if(v.compareTo(a[m])==0)
            {
                return m;
            }
            if(v.compareTo(a[m])<0)
            {
                high=m-1;
            }
            else
            {
                low=m+1;
            }
        }
        return -1;
    }

}
