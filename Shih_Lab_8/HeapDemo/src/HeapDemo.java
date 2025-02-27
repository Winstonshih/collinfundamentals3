/**
* This is a demo program to test the heap implementation.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.*;
public class HeapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heap<Integer> h=new Heap<>();
        for(int i=0;i<20;++i)
        {
            int n = new Random().nextInt(100);
            System.out.print(n + " ");
            h.add(n);
        }
        System.out.println();
        for (Integer num = h.remove(); num != null; num = h.remove()) {
            System.out.print(num + " ");
        }
    }
    
}
