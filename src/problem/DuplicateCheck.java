
package problem;
public class DuplicateCheck {
    static int[] number = {4,9,6,2,7};
    public static boolean duplicateCheck(int[] is){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length ; j++) {
                if(number[i]==number[j]){
                return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
      boolean isTrue =   duplicateCheck(number);
        if (isTrue) {
            System.out.println("Contains Duplicate");
        }
        if (!isTrue) {
            System.out.println("No Duplicate");
        }
    }
}
