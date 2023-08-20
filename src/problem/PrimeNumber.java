
package problem;

import java.util.Scanner;


public class PrimeNumber {
   
         public static void main(String[] args) {
        
             int prime = 15;
            int count = 0;
             for (int i = 2; i < prime; i++) {
                 if(prime%i==0){
                 count++;
                 break;
                 }
             }
             if(count==0){ System.out.println("prime");
             }else{System.out.println("Not Prime");}
     }
    }
    

