
package ArrayProblem;




public class ReverseString {
   
    public static void main(String[] args) {
        String s = "ARJUMAN";
        StringBuffer buffer = new StringBuffer();
        for (int i = s.length()-1; i >=0; i--) {
            buffer.append(s.charAt(i));
        }
        System.out.println(buffer);
}
}