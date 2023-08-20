
package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamPractise {
    public static void main(String[] args) {
        String before = "Mahbub";
        List<Character> list = new ArrayList<>();
        StringBuilder after = new StringBuilder();
        
        for (int i = before.length()-1; i >=0; i--) {
            after.append(before.charAt(i));
        }
        System.out.println("Before the value was: " + before);
        System.out.println("After the value is: " + after.toString());
        
        
        
        
        
        
        
        
        
        
        
    }
   };
    
 class Other{
     public static void main(String[] kiil) {
         int[] number = {1,2,3,4,5};
         int[] after = new int[5];
         for (int i = number.length; i > 0; i--) {
            after[0]= i;
         }
        
         for (int b : number) {
             System.out.print(b);
         }
            System.out.println(" ");
           for (int c : after) {
             System.out.print(c);
               System.out.print(" ");
              
         }
         
     }
 
 }