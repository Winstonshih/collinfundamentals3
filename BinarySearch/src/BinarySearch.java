/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
public class BinarySearch {
    public static void main(String[] args) {
        boolean found=false;
        int position=-1;
        int lowest=0;
        int highest=10;
        int[] array={0,1,2,3,4,5,6,7,8,9,10};
        int X=7;
        while(!found&&lowest<=highest)
        {
            int middle=(lowest+highest)/2;
            if(array[middle]==X)
            {
                found=true;
                position=middle;
            }
            else if(array[middle]>X)
            {
                highest=middle-1;
            }
            else
            {
                lowest=middle+1;
            }
        }
        System.out.println(position);
    }
}
