
package problem;

import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;


public class Animal{
    
    public void poly(){
        System.out.println("Animal make sound");
    }
    
}
 class Dog extends Animal{
 @Override
 public void poly(){
     System.out.println("Dog bark");
 }
 }

class Cat extends Animal{
@Override
public void poly(){
    System.out.println("Cat Meow");
}
}

class Horse extends Animal{
    @Override
    public void poly(){}
    
    LinkedList<String> linkedList = new LinkedList<>();
    
    
}



class AtomicIntegerExample{
//    public static void main(String[] args) {
//        AtomicInteger counter = new AtomicInteger();
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                System.out.println("Incremented" + counter.incrementAndGet());
//            }).start();
//        }
//    }
}

class Prac{

    public static void main(String[] args) {
         String[] arr = {"ab", "bc", "ca"};
         StringBuilder builder = new StringBuilder();
         
         for(String arr1 : arr) {
            if(arr1.startsWith("ab")||arr1.startsWith("bc")){
            builder.append(arr1+"-");}
            if(arr1.startsWith("ca")){
            builder.append(arr1);}
            
        }
         System.out.println(builder);
    }
}