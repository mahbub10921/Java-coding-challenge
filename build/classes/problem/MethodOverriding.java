
package problem;



public class MethodOverriding {
     
    private void Met(){
        System.out.println("hello");
    }
    
    public static void met2(){
    
    }
    
   
    
    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.Met();
    }
    
}


class MethodOverriding2 extends MethodOverriding{
    
   public static void met2(){
   }
}
