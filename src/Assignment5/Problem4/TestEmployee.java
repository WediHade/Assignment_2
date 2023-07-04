package Assignment5.Problem4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee mike = new CommissionEmployee("mike", "hadera", "srerewr", 100000.00, 0.45 );
        Employee mitu = new CommissionEmployee("azeb", "hadera", "wewewe", 100000.00, 0.55 );
        Employee abe = new HourlyEmployee("abe", "gere", "rtrtrt", 100000.00, 0.45 );
        Employee kira = new SalariedEmployee("kira", "ange", "yuyuyu", 2000.00);
        Employee selam = new BasePlusCommissionEmployee("selam", "mar", "ikikik", 10000.00, 0.45 );

        Employee [] employee = {mike, mitu, abe, kira, selam};
        double totalSalary = 0.0;

        for (Employee i: employee) {

            totalSalary += i.getPayment();
        }

        System.out.println("Total Salary of all employees: " + totalSalary);
    }
}

