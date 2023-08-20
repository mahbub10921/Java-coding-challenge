
package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CheckingPalindrome {
     public static void main(String[] args) {
        String input = "Hello, World!"; // Change this string to test different inputs
        
        boolean containsVowel = checkForVowels(input);
        
        if (containsVowel) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
    }
    
    public static boolean checkForVowels(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true; // Found a vowel, return true
            }
        }
        
        return false; // No vowel found
    }
 }
   
	




 class PalindromeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("It is a palindrome word.");
        } else {
            System.out.println("It is not a palindrome word.");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


class Remove{
static int[] arr = {2,6,3,4,9,4};

public static ArrayList tt(int[] b){
ArrayList<Integer> al = new ArrayList<>();
    for (int l : arr) {
        if(!al.contains(l)){
            al.add(l);
        }
    }
    System.out.println(al);
    return al;
}
    public static void main(String[] args) {
       tt(arr);
    }
    
    
}


class Anagram{

public static boolean checkAnagram(String s, String s5){
    
s = s.replaceAll("\\s", "").toLowerCase();
s5 = s5.replaceAll("\\s", "").toLowerCase();
if(s.length()!=s5.length()){
return false;
}

char[] c = s.toCharArray();
char[] c1 = s5.toCharArray();
Arrays.sort(c);
Arrays.sort(c1);
return Arrays.equals(c, c1);


}

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        if(checkAnagram(s1,s2)){
            System.out.println("Ok");
        }else{
            System.out.println("not ok");
        }
    }

}


class SecondLargestInArrayExample1{  
public static int getSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2,66,99};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+getSecondLargest(a,8));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}  


class sumNumber{
public static void getSum(int i){
    String s = String.valueOf(i);
    int sum=0;
    //System.out.println(s);
    for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        int digit = Character.getNumericValue(c);
        sum+=digit;
        
    }
    System.out.println("sum of : " + sum);
    //System.out.println(s.length());
}

    public static void main(String[] args) {
        getSum(1239);
    }
}

class factorial{
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
                for (int i = 1; i <=number; i++) {
            factorial*=i;
            
        }
                System.out.println("Factorial of 5 is :" + factorial);
    }
}

 class LargestContiguousSum {
    public static void main(String[] args) {
        int[] array = {2,  4,  1, 5, 6,-10 };

        int largestSum = findLargestContiguousSum(array);

        System.out.println("The largest sum of a contiguous sequence is: " + largestSum);
    }

    public static int findLargestContiguousSum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
 class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "abracadabra";

        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCount[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // If no non-repeating character is found
    }
}


class Non{
public static void non(String s){
    Set<Character> set = new HashSet<>();
    char c;
    for (int i = 0; i < s.length(); i++) {
        set.add(s.charAt(i));
    }
    System.out.println(set);
}

    public static void main(String[] args) {
        non("abracadabra");
    }
}

 class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
      int sum = 0;
        int digit = number % 10;
        sum+= Math.pow(digit, 3);
        System.out.println(digit);
        System.out.println(sum);
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number = number / 10;
        }

        return originalNumber == sum;
    }
}

class Armo{
public static void ar(int number){
    int num = 153;
String s = String.valueOf(number);
  char c1 = s.charAt(0);
  char c2 = s.charAt(1);
  char c3 = s.charAt(2);
  double i1 = Character.getNumericValue(c1);
  double i2 = Character.getNumericValue(c1);
  double i3 = Character.getNumericValue(c1);
  i1 = Math.pow(i1, 3);
    i2 = Math.pow(i2, 3);
  i3 = Math.pow(i3, 3);
double d = i1+i2+i3;
if(number==d){
    System.out.println("armstrong");
}else{
    System.out.println("Not");
}

}

    public static void main(String[] args) {
        ar(153);
    }

}
