
@FunctionalInterface
interface MyFunctionalInterface {
    int doSomething(int a, int b);
   
}


public class Main{
    public static void stone(){
        System.out.println("this is class");
    }
    
    public static void main(String[] args) {
        MyFunctionalInterface addOperation = (a, b) -> a+b;
        MyFunctionalInterface subtractOperation = (a, b) -> a-b;
        System.out.println(addOperation.doSomething(10,20));
         System.out.println(subtractOperation.doSomething(10,20));
        //MyFunctionalInterface functionalInterface2 = Main::stone;
        //functionalInterface2.doSomething();

}

    
}