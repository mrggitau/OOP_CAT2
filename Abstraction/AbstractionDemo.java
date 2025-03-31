// ABSTRACTION

abstract class Appliance {
    abstract void turnOn(); 
}

// First subclass
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("The fan is ON!");
    }
}

// Second subclass
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("The TV is ON!");
    }
}

// Abstraction demonstration
public class AbstractionDemo {
    public static void main(String[] args) {
        // creating objects of the two subclasses above
        Appliance newFan = new Fan(); 
        Appliance newTV = new TV();   

        // Calling turnOn() method 
        newFan.turnOn();
        newTV.turnOn();
    }
}
