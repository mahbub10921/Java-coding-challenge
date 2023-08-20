
package problem;

 import java.util.HashMap;
import java.util.Map;
public class Frequency {
    
   


//   public static void printCharacterFrequency(String str) {
//        Map<Character, Integer> frequencyMap = new HashMap<>();
//        
//        Map<String, String> frequencyMap1 = new HashMap<>();
//        frequencyMap1.put("1", "Mahbub");
//        frequencyMap1.put("2", "Tamal");
//        frequencyMap1.put("1", "Mahbub");
//
//
//        
//
//        for (char c : str.toCharArray()) {
//            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//        }
//        System.out.println(frequencyMap);
//          System.out.println(frequencyMap1);
//
//        for (char c : frequencyMap.keySet()) {
//            System.out.println("Character '" + c + "' occurs " + frequencyMap.get(c) + " times");
//        }
//        
//    }

   public static void printCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(frequencyMap);

        for (char b : frequencyMap.keySet()) {
            System.out.println("Character '" + b + "' occurs " + frequencyMap.get(b) + " times");
        }
    }

    public static void main(String[] args) {
        String str = "abb";
        printCharacterFrequency(str);
    }
}

//    
//    class FrequencyCheck{
//    public static void frequencyCheck(String string){
//        Map<Character, Integer> map = new HashMap<>();
//        
//        for (int i = 0; i < string.length(); i++) {
//            char a = string.charAt(i);
//            map.put(a, map.getOrDefault(a, 0)+1);
//        }
//        System.out.println(map);
//        
//        for (char a : map.keySet()) {
//            System.out.println("Character '" +   a +   "'occurs'" +  map.get(a));
//        }
//    }
//        public static void main(String[] args) {
//            frequencyCheck("mahbub"); 
//            printCharacterFrequency("arjuman");
//        }
//    
//    
//    }
//    
//    

