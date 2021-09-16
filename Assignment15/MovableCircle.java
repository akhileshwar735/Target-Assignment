package com.akhil.training.oops.templates;
import com.akhil.training.oops.templates.Movable;
import com.akhil.training.oops.templates.MovablePoint;

public class MovableCircle implements Movable{

    private MovablePoint center;
    private int radius;

    public MovableCircle(int x,int y,int xspeed,int yspeed, int radius) {
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        (this.center).y-=this.center.yspeed;
    }

    @Override
    public void moveDown() {
        (this.center).x+=this.center.xspeed;
    }

    @Override
    public void moveLeft() {
        (this.center).x-=this.center.xspeed;
    }

    @Override
    public void moveRight() {
        (this.center).x+=this.center.xspeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
}
