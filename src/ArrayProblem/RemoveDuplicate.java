
package ArrayProblem;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
     public static int[] duplicate = {2,6,4,9,2,6};
     static Set<Integer> set = new HashSet<>();
     public static int[] nonDuplicate = new int[4];
     static int temp = 0;
     
     public static int[] findingDuplicate(int[] is){
        
         for (int in : duplicate) {
             set.add(in);
         }
         for (Integer set1 : set) {
             nonDuplicate[temp] = set1;
             temp++;
         }
         return nonDuplicate;
     }
     
     public static void main(String[] args) {
         findingDuplicate(duplicate);
         for (int arg : nonDuplicate) {
             System.out.print(arg + " ");
         }
         System.out.println(" ");
    }
     
}
