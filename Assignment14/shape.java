package com.akhil.training.oops.Assignment14;

public class shape {
    private String color="red";
    private boolean filled = true;
    shape(){
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
