package Assignment5.Problem4;

abstract public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    abstract public double getPayment();
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    @Override
    public String toString() {
        return "First Name= " +this.firstName + "::Last Name = " + this.lastName+ "::SSN = " + this.socialSecurityNumber;
    }
}

