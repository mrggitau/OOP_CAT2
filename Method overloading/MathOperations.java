// METHOD OVERLOADING AND OVERRIDING

class MathOperations {
    public int multiply(int a, int b) {     // first multiply method
        return a * b;
    }

    public int multiply(int a, int b, int c) {    // second multiply method
        return a * b * c;
    }
    
    // execution begins at main() thus

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        
        // first multiply method 
        System.out.println("First method: " + mathOperations.multiply(65, 87));
        
        // second multiply method
        System.out.println("Second method: " + mathOperations.multiply(8, 8, 9));
    }
}
