package com.akhil.training.oops.Assignment13;

import com.akhil.training.oops.Assignment13.Person;

public class student extends Person{
    private String program;
    private int year;
    private double fee;

    public student(String name,String address,String program, int year, double fee) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +super.toString()+
                '}';
    }
}
