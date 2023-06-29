package Assignment3.Problem1;

public class Problem1 {
    public static void main(String[] args) {
        // lesson3.problem1.Customer Array
        Customer stud1 = new Customer("Azeb", "Hagos", "23g4");
        Customer stud2 = new Customer("Merhawi", "Belay", "455h");
        Customer stud3 = new Customer("Biniyam", "Kiros", "7758uf");

        //lesson3.problem1.Address Array
        Address add1 = new Address("Illinois", "Chicago","60290");
        Address add2 = new Address("Iowa", "FairFeild", "52556");
        Address add3 = new Address("Illinois", "Chicago","60290");

        stud1.setBillingAddress(add1);
        stud1.setShippingAddress(add1);

        stud2.setBillingAddress(add2);
        stud2.setShippingAddress(add2);

        stud3.setBillingAddress(add3);
        stud3.setShippingAddress(add3);

        Customer [] array1 = {stud1, stud2, stud3};
        for (Customer i: array1) {
            if(i.getBillingAddress().getCity().equals("Chicago") )   {
                System.out.println(i);
            }
        }
    }
}
