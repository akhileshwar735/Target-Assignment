package com.akhil.training.oops.Assignment14;
import com.akhil.training.oops.Assignment14.rectangle;

public class square extends rectangle {
    private double side;
    public square(){
    }

    public square(double side) {
        this.side = side;
    }

    public square(String color, boolean filled,  double side) {
        super(color,filled);
        this.side = side;
    }

    /*public square(double width, double length) {
        super(width, length);
    }*/

    public void setSquare(double square) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    //@Override
    public void setWidth(double width) {
        this.width=this.side ;
    }

    //@Override
    public void setLength(double length) {
        //super.setLength(length);
        this.length=this.side;
    }


    @Override
    public String toString() {
        return "sbquare{" +
                "side=" + side +"width"+width+"length"+length+"color"+super.getColor()+"filler"+super.isFilled()+super.toString()+
                '}';
    }
}
