
package ArrayProblem;


public class CheckingAnagram {
    static String first = "listen";
      static String second = "tatto";
   static boolean checkingAnagram(String s, String s1){
       for (int i = 0; i < first.length() ; i++) {
           for (int j = 0; j < second.length(); j++) {
              if(first.charAt(i)==second.charAt(j)){
                  return true;
              } 
           }
       }
       return false;
     }
    public static void main(String[] args) {
        boolean boo = checkingAnagram(first,second);
        if(boo)System.out.println("Anagram");
        if(!boo)System.out.println("Not Anagram");
    }
}
