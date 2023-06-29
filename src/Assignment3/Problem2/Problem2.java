package Assignment3.Problem2;

import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fname = input.nextLine();

        //System.out.println(fname);
        System.out.println("Please, enter your last name:");
        String lname = input.nextLine();

        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd) - Example 1989-4-14");
        String dob = input.nextLine();


        HeartRates heartrate = new HeartRates(fname, lname, dob);
        int age = heartrate.getAge();


        heartrate.targetHeartRange();
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Maximum Heart Rate: " + heartrate.maxHeartRate());
    }
}