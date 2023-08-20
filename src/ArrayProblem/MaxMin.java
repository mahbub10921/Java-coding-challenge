
package ArrayProblem;
public class MaxMin {
    static int[] number = {5,4,3,1,2};
    static int[] maxNumber = new int[number.length];
    static int max = number[0];
    static int min = number[0];
    
    static int findingMaximum(){
        for (int i = 1; i < number.length; i++) {
            if (number[i]>max) {
                max = number[i];
            }
            if (number[i]<min) {
                min = number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        findingMaximum();
        System.out.println("maximum number is :" + max);
        System.out.println("minimum number is :" + min);
    }
}
