package com.akhil.training.oops.Assignment13;
import com.akhil.training.oops.Assignment13.Person;

public class staff extends Person{
    private String school;
    private double pay;

    public staff(String name,String address,String school, double pay) {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay + super.toString()+
                '}';
    }
}
