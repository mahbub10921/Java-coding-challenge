
package problem;


public class StaticClass {
    
    static int staticField;
    int instanceField;
    public static void main(String[] args) {
        StaticClass.staticField = 10;
        StaticClass class1 = new StaticClass();
        StaticClass class2 = new StaticClass();
        System.out.println(staticField);
        System.out.println(class1.staticField);
        System.out.println(class2.staticField);
        System.out.println(class1.instanceField=15);
        System.out.println(class2.instanceField=23);
    }
    
    
}
