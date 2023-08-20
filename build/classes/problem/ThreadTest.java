
package problem;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadTest extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("value of i :" + i);
        }
    }
 
    
    
     public static void main(String[] args) {
         ThreadTest thread = new ThreadTest();
         ThreadTest1 thread1 = new ThreadTest1();
         thread.start();
          thread1.start();
     
 }
}
 
class ThreadTest1 extends Thread {
   @Override
    public void run(){
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("value of j :" + j);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}