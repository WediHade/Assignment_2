package Assignment3.Problem3;

import java.util.Scanner;

public class Problem3 {


    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            String value = sc.nextLine();

            if (value.equals("R")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter width");
                String width = sc1.nextLine();
                double w = Double.parseDouble(width);

                System.out.println("Enter height");
                String height = sc1.nextLine();
                double h = Double.parseDouble(height);

                Rectangle rec = new Rectangle(w, h);
                double result = rec.computeArea();
                System.out.printf("Area of Rectangle is: %.2f  \n", result);

                System.out.println("Do you want to continue ? y | n ");
                Scanner sc2 = new Scanner(System.in);
                String input = sc2.nextLine();
                if (input.equals("n")) {
                    break;
                }

            }

            else if (value.equals("C")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter Radius");
                String radius = sc1.nextLine();
                double r = Double.parseDouble(radius);

                Circle circle = new Circle(r);
                double result = circle.computeArea();
                System.out.printf("Area of Circle is: %.2f  \n", result);

                System.out.println("Do you want to continue ? y | n ");
                Scanner sc2 = new Scanner(System.in);
                String input = sc2.nextLine();
                if (input.equals("n")) {
                    System.out.println("Program ended");
                    break;
                }
            }

            else if (value.equals("T")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter base");
                String base = sc1.nextLine();
                double ba = Double.parseDouble(base);

                System.out.println("Enter height");
                String height = sc1.nextLine();
                double h = Double.parseDouble(height);

                Triangle triangle = new Triangle(ba, h);
                double result = triangle.computeArea();
                System.out.printf("Area of Triangle is:%.2f  \n", result);

                System.out.println("Do you want to continue ? y | n ");
                Scanner sc2 = new Scanner(System.in);
                String input = sc2.nextLine();
                if (input.equals("n")) {
                    break;
                }

            } else {
                System.out.println("Accepted values are only R, T, C");

                System.out.println("Do you want to continue ? y | n ");
                Scanner sc2 = new Scanner(System.in);
                String input = sc2.nextLine();
                if (input.equals("n")) {
                    break;
                }
            }
        }
    }
}