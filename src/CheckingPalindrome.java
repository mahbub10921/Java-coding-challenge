
public class CheckingPalindrome {
    
    public static String palin = "Madam";
   public static char len = palin.charAt(0);
    public static char len2 = palin.charAt(palin.length()-1);
    public static boolean isPalindrome = Character.toLowerCase(len)==Character.toLowerCase(len2);
  
    public static boolean check(boolean bo){
    return bo;
    }
    
    
    public static void main(String[] args) {
      
       System.out.println(check(isPalindrome));
        
    }

}
