package Assignment5.problem2;

import java.util.Scanner;

public class DeptTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Jonas", 90000, 2014, 1, 2, 80);
        Professor professor1 = new Professor("Kaleb", 950000, 2015, 2, 3, 85);
        Professor professor2 = new Professor("Azeb", 100000, 2016, 3, 4, 90);
        Secretary secretary = new Secretary("Tirhas", 45000, 2000, 4, 5, 10);
        Secretary secretary1 = new Secretary("Merhawi", 50000, 2002, 5, 6, 15);

        DeptEmployee[] deptEmployees = {professor, professor1, professor2, secretary, secretary1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all Professor and Secretary salaries");
        String response = sc.nextLine();

        if (response.equals("Y")) {
            double totalSalary = 0;
            for (DeptEmployee emp: deptEmployees) {
                totalSalary += emp.computeSalary();
            }
            System.out.println("The total salaries of Professors and Secretaries is: " + totalSalary);
        }
    }
}
