package Assignment5.problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    int numberOfPublications;
    LocalDate hireDate;
    Professor(String name, double salary, int year, int month, int day, int numberOfPublications) {
        super(name, salary, year, month, day);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }
    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

}
