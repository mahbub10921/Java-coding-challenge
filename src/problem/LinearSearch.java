
package problem;


public class LinearSearch {    
    public static void main(String[] args) {
        int[] number = {4,8,77,2,55};
        int LargestNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if(number[i]>LargestNumber){
               LargestNumber  = number[i];
            }
        }
        System.out.println("Largest Number is " + LargestNumber);
        System.out.println(Math.sqrt(7));
    }
    
}
