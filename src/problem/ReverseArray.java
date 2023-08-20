
package problem;

import java.util.LinkedList;
import java.util.List;

public class ReverseArray {
   
   
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        
         int[] before = {1,2,3,4,5};
         int[] after = new int[5];
        int length = before.length-1;
        for (int i = length; i >= 0; i--) {
            list.add(before[i]);
        }
        for (int i = 0; i <= list.size()-1; i++) {
            after[i] = list.get(i);
        }
        
        for (int b : before) {
            System.out.print(b);
        }
        System.out.println(" ");
          for (int b : after) {
            System.out.print(b);
        }
          System.out.println(" ");
        
        //System.out.println(list);
    }
   
}
