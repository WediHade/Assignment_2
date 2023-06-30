package Problem4;

public class Prob2 {
        // Instance fields
        private int instance1;
        private String instance2;

        // Static field
        private static boolean data;

        // Instance initialization blocks
        {
            System.out.println("Inside instance initialization block 1");
        }

        {
            System.out.println("Inside instance initialization block 2");
        }

        // Static initialization blocks
        static {
            System.out.println("Inside static initialization block 1");
        }

        static {
            System.out.println("Inside static initialization block 2");
        }

        // Constructors
        public Prob2() {
            System.out.println("Inside default constructor");
        }

        public Prob2(int instance1, String instance2) {
            this.instance1 = instance1;
            this.instance2 = instance2;
            System.out.println("Inside parameterized constructor");
        }

        // Instance methods
        public void instanceMethod1() {
            System.out.println("Inside instance method 1");
        }

        public void instanceMethod2() {
            System.out.println("Inside instance method 2");
        }

        // Static methods
        public static void staticMethod1() {
            System.out.println("Inside static method 1");
        }

        public static void staticMethod2() {
            System.out.println("Inside static method 2");
        }
    }


