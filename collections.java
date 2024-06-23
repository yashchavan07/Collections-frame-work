import java.util.ArrayList;
import java.util.*;

public class collections {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();//modified array we can do the things which we cannot do in array
        ArrayList<Integer> l2 = new ArrayList<>();//in the last braces we can initialize capacity set
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l1.add(6);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(0,3);
        l1.add(0,4);
        l1.addAll(0,l2);
        l1.set(1,600);
        l1.trimToSize();
        //l1.clear();//clears the arraylist
        //l1.clone(); creats a copy

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
            

        }
        System.out.println(l1.contains(6));
        System.out.println(l1.contains(100));
        System.out.println(l1.indexOf(6));//returns the index of the elements or if the elements is not there it will return -1 it will always give the first index if the number is occured multiple times
        //similarly we have lastIndex(); to check if there are multiple numbers then it will check the last index of the number
        System.out.println(l1.isEmpty());//returns true if list has no elements
        System.out.println(l1.size());
       
        
    }
}