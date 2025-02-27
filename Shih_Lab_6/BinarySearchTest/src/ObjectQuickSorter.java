/**
 * Sorts list by alphabetical order
 * Written by Winston Shih
 * Written on 7/7/2023
 * JDK Version 17.0.1
 */
public class ObjectQuickSorter {
    public static void sort(Comparable[] array)
    {
        quickSort(array, 0, array.length-1);
    }
    private static void quickSort(Comparable[] array, int start, int end)
    {
        int pivot;
        if(start<end)
        {
            pivot=partition(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot+1,end);
        }
    }
    private static int partition(Comparable[] array, int start, int end)
    {
        Comparable pivot;
        int endOfList;
        int mid=(start+end)/2;
        swap(array,start,end);
        pivot=array[start];
        endOfList=start;
        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan].compareTo(pivot)<1)
            {
                endOfList++;
                swap(array, endOfList, scan);
            }
        }
        swap(array, start, endOfList);
        return endOfList;
    }
     private static void swap(Comparable[] array, int a, int b)
     {
        Comparable temp;
      
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
   }
}
