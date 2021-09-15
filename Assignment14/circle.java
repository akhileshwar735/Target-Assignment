package com.akhil.training.oops.Assignment14;
import com.akhil.training.oops.Assignment14.shape;

public class circle extends shape {
    private double radius=1.0;
    public circle(){
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (22*(this.radius)*(this.radius))/7;
    }
    public double getPerimeter(){
        return (22*2*(this.radius))/7;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +super.toString()+
                '}';
    }
}
