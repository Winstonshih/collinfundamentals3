/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
public class SequentialAlgorithm {
    public static void main(String[] args) {
        int position=-1;
        int index=5;
        int[] grades=new int[index];
        grades[0]=100;
        grades[1]=99;
        grades[2]=80;
        grades[3]=69;
        grades[4]=79;
        int i=0;
        boolean found=false;
        while(!found&&i<index)
        {
            if(grades[i]==69)
            {
                found=true;
                position=i;
            }
            i++;
        }
        System.out.println(position);
    }   
}
