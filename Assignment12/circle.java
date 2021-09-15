package com.akhil.training.oops;

public class circle {
    private double radius=1.0;
    private String colour="red";

    circle(){
    }

    circle(double radius){
        this.radius = radius;
    }
    circle(double radius,String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public double getRadius(){
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(){
        return ((this.radius)*(this.radius)*22)/7;
    }

    @Override
    public String toString() {
        return "circle[" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ']';
    }
}
