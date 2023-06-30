package Problem4;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Creating first object:");
        Prob2 object1 = new Prob2();

        System.out.println("\nCreating second object:");
        Prob2 object2 = new Prob2(42, "Hello!");

        // Calling instance methods
        object1.instanceMethod1();
        object2.instanceMethod2();

        // Calling static methods
        Prob2.staticMethod1();
        Prob2.staticMethod2();
    }
}


