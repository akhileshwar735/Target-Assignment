package com.akhil.training.oops.Assignment13;

public class PersonStaffStudent {
    public static void main(String[] args) {
        Person[] people = {
                new student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
                new staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
                new staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
                new student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
                new student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
        };
        for(int i=0;i<5;i++){
        System.out.println(people[i]);}

    }
}
