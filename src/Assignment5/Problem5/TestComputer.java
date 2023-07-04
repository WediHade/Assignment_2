package Assignment5.Problem5;

public class TestComputer {
    public static void main(String[] args) {
        Computer comp = new Computer("Dell", "itel", 8, 2.76);
        Computer comp1 = new Computer("Dell", "itel", 8, 2.76);

        System.out.println("Result is: " + comp.equals(comp1));
        System.out.println("First obj hashcode: " + comp.hashCode());
        System.out.println("Second obj hashcode: " + comp1.hashCode());
        //computePower method for both
        System.out.println(comp);
        System.out.println(comp1);
    }
}
