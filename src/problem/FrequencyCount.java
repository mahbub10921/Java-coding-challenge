
package problem;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
     public static void frequencyCount(String str){
     Map<Character, Integer> map = new HashMap<>();
         for (int i = 0; i < str.length(); i++) {
             char c = str.charAt(i);
             map.put(c, map.getOrDefault(c, 0)+1);
         }
         
         for (char col : map.keySet()) {
             System.out.println("Frequency of character " + " " + col +" " + "is" + " " +map.get(col) + " " + "time");
         }
     };
    public static void main(String[] args) {
       frequencyCount("mahbub");
    }
    
}
