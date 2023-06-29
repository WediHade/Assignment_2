package Assignment3.Problem1;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String firstName) {
        this.lastName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSocSecurityNum(String firstName) {
        this.socSecurityNum = firstName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }


    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }
}
