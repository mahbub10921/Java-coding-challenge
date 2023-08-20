
package problem;


public class Parent {
   public void print(){
       System.out.println("parent");
   }
}
 class Child extends Parent{
 @Override
 public void print(){
       System.out.println("child");
   }
 }

class Main{
public static void PrintMain(Parent o){
o.print();
}
    public static void main(String[] args) {
        Parent x = new Parent();
        Parent y = new Parent();
        Child z = new Child();
        PrintMain(x);
        PrintMain(y);
        PrintMain(z);
    }
}