package Assignment8.prob2;
import java.util.List;

public class Statistics {
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double totalSalaries = 0.0;
        for (EmployeeData e : aList) {
            totalSalaries += e.getSalary();
        }
        return totalSalaries;
        //implement
        //compute sum of all salaries of people in aList and return
    }
}
