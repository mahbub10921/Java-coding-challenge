
package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;




public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(34);
        data.add(4);
        data.add(11);
        data.add(5);
        
        data.stream()
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));
       
        
    }
}
