// Constructors

class vehicleV1 {
    int wheels;

    vehicleV1() { // No Argument Constructor
        wheels = 4;
    }
}

class vehicleV2 {
    int wheels;
    int headlights;

    public vehicleV2(int n) { // Parameterized Constructor
        wheels = n;
        headlights = 2;
    }
}

class vehicleV3 {
    int wheels; // current object
    int headlights;
    String color;

    public vehicleV3(int wheels) {
        this.wheels = wheels; // 'this' is used to access the current object when the argument name is same to
                              // it
        headlights = 2;
    }

    public vehicleV3(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
        headlights = 2;
    }
}

public class tut39 {
    tut39() { // No Argument Constructor
        System.out.println("This is example of a constructor.");
    }

    public static void main(String[] args) {
        // tut39 obj = new tut39(); // this will print the tut39 constructor print line

        vehicleV1 car = new vehicleV1();
        System.out.println(car.wheels + " wheels of car.");

        vehicleV2 bike = new vehicleV2(2);
        System.out.println(bike.wheels + " wheels and " + bike.headlights + " headlights of bike.");

        vehicleV3 bus = new vehicleV3(6, "Red"); // if the color is not provided it setted to be null by the first
                                                 // constructor of vehicle3 class which have only single argument
        System.out
                .println(bus.wheels + " wheels, " + bus.color + " color and " + bus.headlights + " headlights of bus.");
    }
}
