package Assignment3.Problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private  String dob;

    final double LB = 0.5;
    final double UB = 0.85;
    final double RHR = 70;

    //constructor

    public HeartRates(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName (){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName (){
        return lastName;
    }


    public int getAge() {
       // LocalDate birthday = LocalDate.parse(dob);
        LocalDate curDate = LocalDate.now();
        return  Period.between(LocalDate.parse(dob), curDate).getYears();
        //return dob;
    }
    public double maxHeartRate() {
        double MHR = 220 - getAge();
        return MHR;
    }

    public double averageHeartRate() {
        double AHR = maxHeartRate() - RHR;
        return AHR;
    }

    public void targetHeartRange() {
        double ahr = averageHeartRate();
        double LBTHR = (ahr * UB) + RHR;
        double UBTHR = (ahr * LB) + RHR;
        System.out.println("THe target Heart Rate Range is between "+ LBTHR + " and "+ UBTHR);//return UBTHR - LBTHR;
    }
}
