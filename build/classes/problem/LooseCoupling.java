
package problem;
public class LooseCoupling {
public static void main(String[] args) {
        Developer Mahbub = new Developer();
       Computer G71 = new Desktop();
        Computer inspiron = new Laptop();
        Mahbub.code(inspiron );
    }
    
}

class Developer{
public void code(Computer c){
 c.code();
}
}

class Laptop implements Computer{
@Override
public void code(){
    System.out.println("laptop is slower");
}
}

class Desktop implements Computer{
@Override
public void code(){
    System.out.println("Desktop is Faster");
}
}
interface Computer{
void code();
}