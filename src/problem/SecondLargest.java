
package problem;


public class SecondLargest {
    
   
   static int  largest = Integer.MAX_VALUE;
   static int secondLargest = Integer.MIN_VALUE;
    public static void main(String[] args) {
         int[] number={6,2,5,8};
         int largest = number[0];
         for (int i = 0; i < number.length; i++) {
            if(number[i]>largest){
                largest = number[i];
            }
        }
         System.out.println(largest);
    }

}

class FibonacciSeriesRecursion {

    public static void main(String[] args) {
        int n = 10; // Change this value to generate a different number of Fibonacci series elements

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
