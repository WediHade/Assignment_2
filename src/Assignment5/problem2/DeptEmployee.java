package Assignment5.problem2;

import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate hireDate;
    DeptEmployee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }

    public double computeSalary() {
        return salary;
    }
}
