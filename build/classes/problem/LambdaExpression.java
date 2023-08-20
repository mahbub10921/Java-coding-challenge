
package problem;




public class LambdaExpression {
   
   static String s1 = "Hello";
      static  String s2 = s1;
      String s = new String("Hello");
        
    public String hello(){
    if(s1.equalsIgnoreCase(s)){return "ok";}
    else{return "Not ok";}
    }
           
    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();
        //System.out.println(lambdaExpression.hello());
        
        String str1 = "Hello";

String str3 = new String("Hello");
String str2 = str3;
boolean areSame = (str3 == str2);
System.out.println(areSame);  // true

boolean areDifferent = (str1 == str3);
//System.out.println(areDifferent);  // false

String str = "Hello";
int hashCode = System.identityHashCode(str3);
int hashCode1 = System.identityHashCode(str2);
int hashCode2 = System.identityHashCode(str1);

System.out.println("Memory address of str1: " + hashCode2);
System.out.println("Memory address of str2: " + hashCode1);
System.out.println("Memory address of str3: " + hashCode);


     }
    
}
