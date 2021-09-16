package com.akhil.training.oops.templates;
import com.akhil.training.oops.templates.Movable;

public class MovablePoint implements Movable{

    int x,y,xspeed,yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public void moveUp() {
        this.y-=this.yspeed;

    }

    @Override
    public void moveDown() {
        this.y+=this.yspeed;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xspeed;
        //System.out.println(this.x);
    }

    @Override
    public void moveRight() {
        this.x+=this.xspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + this.x +
                ", y=" + y +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
}
