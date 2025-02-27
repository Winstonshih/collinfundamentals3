/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author winst
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        queue.add(1);

        queue.add(30);

        queue.add(50);

        queue.add(60);

        queue.add(100);

        //queue.remove(1);
        System.out.println(queue);
    }
}
