
package problem;


public class InnerNested {
  
    public static void main(String[] args) {
        String str = "Hello Bangladesh";
        char[] c = new char[str.length()];
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed.toString());
    }
    
}





