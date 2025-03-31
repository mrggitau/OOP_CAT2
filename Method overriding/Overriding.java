//  METHOD OVERRIDING 

class Animal {
    public void makeSound() {
        System.out.println("The animal makes sound!");
    }
}

// dog subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks!");
    }
}

// cat subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows and purrs!");
    }
}

// polymorphism demonstration 
public class Overriding {
    public static void main(String[] args) {
        Animal newDog = new Dog(); 
        Animal newCat = new Cat(); 

        // calling from the subclasses respective methods
        newDog.makeSound(); 
        newCat.makeSound(); 
    }
}
