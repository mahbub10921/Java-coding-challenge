
package problem;

import static problem.TwoSum.newNumberIndex;

public class TwoSum {
  static int[] number = {2,99,7,11,15};
  static int[] newNumber = new int[2];
  static int[] newNumberIndex = new int[2];
  
    public static void main(String[] args) {
        
        TwoSum.sum(number);
        for (int arg : newNumber) {
            System.out.print(arg + " ");
        }
        System.out.println(" ");
    }
    
      public static int[] sum(int[] is){
          
          for (int i = 0; i < is.length; i++) {
              for (int j = i+1; j < is.length; j++) {
                  if (number[i] + number[j]==13) {
                      newNumber[0] = i;
                      newNumber[1] = j;
                  }
              }
          }
          return newNumber;
    }
}
