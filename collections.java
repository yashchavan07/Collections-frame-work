import java.util.ArrayList;
import java.util.*;

public class collections {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();//modified array we can do the things which we cannot do in array
        ArrayList<Integer> l2 = new ArrayList<>();
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

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));

        }

        
    }
}