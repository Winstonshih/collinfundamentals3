/**
 * Tests ObjectBinarySearcher and ObjectQuickSorter on data.
 * Written by Winston Shih
 * Written on 7/7/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] data={"Lance", "Tim", "David", "Jimmy", "Ana", "Ian"};
        ObjectQuickSorter.sort(data);
        System.out.println(Arrays.asList(data));
        System.out.println("Enter a string to search for:");
        String str=input.nextLine();
        System.out.println("You entered "+str);
        int position=ObjectBinarySearcher.search(data, str);
        if(position!=-1)
        {
            System.out.println(str+" is found at position "+position);
        }
        else
        {
            System.out.println(str+" is not in the array.");
        }
    }
    
}
