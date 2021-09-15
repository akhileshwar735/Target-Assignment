package com.akhil.training.oops;

import com.akhil.training.oops.circle;

public class cylinder extends circle{
     private double height=1.0;

     cylinder(){
     }
     cylinder(double radius){
         super(radius);
     }
     cylinder(double radius,double height){
         super(radius);
         this.height=height;
     }
     cylinder(double radius,double height,String colour){
         super(radius,colour);
         this.height=height;
     }

    public void setHeight(double height) {
        this.height = height;


    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        //System.out.println("radius of cylinder"+super.getRadius());
         return (22*(getHeight())*(super.getRadius())*super.getRadius())/7;
    }
}
