
package problem;

import javafx.animation.Animation;

enum Status{
Running,Pending,Completed;
}

public class Enum {
    public static void main(String[] args) {
        Status[] ss = Status.values();
for(Status s : ss){
    System.out.println(s);
}
    }
}


