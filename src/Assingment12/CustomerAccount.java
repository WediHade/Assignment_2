package Assingment12;

import java.lang.invoke.LambdaMetafactory;

public class CustomerAccount {


    private String Cus_name;
    private String Acc_No;
    private double balance;

    public CustomerAccount(String Cus_name, String Acc_No, double balance) {
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) throws CustomException{
        balance -= amount;
        try{
            if (amount >= balance)
                throw new CustomException("You don't have enough funds to withdraw");
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }
    public double getBalance() throws CustomException{

        try{
            if (balance <= 100)
                throw new CustomException("Your balance is below $100, please recharge your account");
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        finally {
            return balance;
        }
    }
    @Override
    public String toString(){
        return "Name: " + Cus_name + "\tAccount Number: " + Acc_No + "\tBalance: " + balance;
    }

    public static void main(String[] args) throws CustomException {
        CustomerAccount cash = new CustomerAccount("Micheale", "M234556", 3000);
        System.out.println(cash);
        cash.deposit(2000);
        cash.withdraw(5900);
        System.out.println("Balance : " + cash.getBalance());
    }
}
