
package problem;

//
//public class Engine {
//   public void start(){
//       System.out.println("Engine Start");
//   }
//}
//
//class Vehicle{
//Engine engine;
//public void Vehicle(){
//this.engine = new Engine();
//}
//
//public void start(){
//    System.out.println("vehicle start");
//    engine.start();
//}
//}
//
//class Main1{
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.start();
//    }
//}



// Engine class representing the engine of a vehicle
public class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

// Vehicle class containing an Engine object through composition
class Vehicle {
    private Engine engine;

    public Vehicle() {
        this.engine = new Engine(); // Composition: Vehicle has an Engine
    }

    public void start() {
        System.out.println("Vehicle starting...");
        engine.start(); // Delegating the start operation to the Engine object
    }
}

 class Main1 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.start(); // Output will show that both Vehicle and Engine start.
    }
}
