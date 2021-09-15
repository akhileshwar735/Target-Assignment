package com.akhil.training.oops;
import com.akhil.training.oops.cylinder;
import com.akhil.training.oops.circle;

public class circlecylinder {
    public static void main(String[] args) {

        circle[] circles = {
                new cylinder(12.34),
                new cylinder(12.34, 15.0),
                new cylinder(12.34, 10.0, "blue")
        };
        //circle c= new circle(13.0);
        //System.out.println(c.getRadius());

        //cylinder s =new cylinder(14.0);
        //System.out.println(s.getHeight());
        //System.out.println(s.getRadius());



        for(int i=0;i<3;i++){
        System.out.println(circles[i]);
        System.out.println("Area of circle in cylinder is"+circles[i].getArea());
        System.out.println(((cylinder)circles[i]).getVolume());}

    }
}
