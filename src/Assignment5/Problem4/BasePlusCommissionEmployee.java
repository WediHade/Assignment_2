package Assignment5.Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;
    BasePlusCommissionEmployee( String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName,socialSecurityNumber, grossSales, commissionRate);
    }

    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }
}
