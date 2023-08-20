
package problem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SingleTonClass {
     
    private SingleTonClass(){
        System.out.println("Object has created");
    }
    private static SingleTonClass singleTonClass = null;
    
  public static SingleTonClass getInstance(){
        if(singleTonClass==null) return singleTonClass = new SingleTonClass();
        
    return singleTonClass;
    }
    
}

class SingleTonClassTest{
    public static void main(String[] args) {
//        SingleTonClass obj1 = SingleTonClass.getInstance();
//        SingleTonClass obj2 = SingleTonClass.getInstance();
//        SingleTonClass obj3 = SingleTonClass.getInstance();
//        System.out.println(obj1);
//        System.out.println(obj2);
//        System.out.println(obj3);
        ExecutorService executorService =  Executors.newFixedThreadPool(2);
        executorService.execute(() -> SingleTonClass.getInstance());
        executorService.execute(() -> SingleTonClass.getInstance());
        executorService.execute(() -> SingleTonClass.getInstance());
        executorService.execute(() -> SingleTonClass.getInstance());
    }
}