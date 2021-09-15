package com.akhil.training.oops.Assignment14;
import com.akhil.training.oops.Assignment14.shape;

public class rectangle extends shape{
    public double width=1.0;
    public double length=1.0;
    public rectangle(){
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return (this.length)*(this.width);
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", length=" + length +super.toString()+
                '}';
    }
}
