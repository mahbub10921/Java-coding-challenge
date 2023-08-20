
package problem;


public class ReversingString {
    
   static ReversingString reversingString;
    
    public ReversingString(String name, int numb){
        System.out.println(name);
        System.out.println(numb);

    }
     public ReversingString(){
     }

    
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println(reversingString);
        
        String name = "kadir";
        //name = "Rahim";
        int a = 10;
        a = 20;
        int hashCode = name.hashCode();
        System.out.println("Hash" + hashCode);
        
        
        StringBuilder builder =  new StringBuilder();
        System.out.println(builder);
        
        for (int i = name.length()-1; i >= 0; i--) {
            builder.append(name.charAt(i));
        }
        //System.out.println(builder.toString());
    }
    
}
