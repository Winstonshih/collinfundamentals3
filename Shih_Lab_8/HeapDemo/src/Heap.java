/**
* This is a demo program to test the heap implementation.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.*;
public class Heap<T extends Comparable<T>>{
    private List<T> a = new ArrayList<>();
    private int left(int i)
    {
        return i*2+1;
    }
    private int right(int i)
    {
        return i*2+2;
    }
    private int parent(int i) {
        return i == 0 ? 0 : (i - 1) / 2;
    }
    private void swap(int i, int j) {
        T tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }
    public void add(T element)
    {
        a.add(element);
        for(int i=a.size()-1;i>0;i=parent(i))
        {
            if (a.get(i).compareTo(a.get(parent(i))) < 0) {
                swap(i, parent(i));
            } else {
                break;
            }
        }
    }
    public T remove() {
        if (a.isEmpty()) {
            return null;
        }
        T ret = a.get(0);
        a.set(0, a.get(a.size() - 1));
        a.remove(a.size() - 1);       
        for (int i = 0; left(i) < a.size();) {
            int leastIdx = left(i);
            if (right(i) < a.size() && a.get(left(i)).compareTo(a.get(right(i))) > 0) {
                leastIdx = right(i);
            }
            if (a.get(i).compareTo(a.get(leastIdx)) > 0) {
                swap(i, leastIdx);
                i = leastIdx;
            } else {
                break;
            }
        }
        return ret;
    }
}
