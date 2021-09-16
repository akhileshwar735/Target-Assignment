package com.akhil.training.oops.templates;

import com.akhil.training.oops.templates.Movable;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x,int y, int x1,int y1,int xspeed,int yspeed) {
        topLeft=new MovablePoint(x,y,xspeed,yspeed);
        bottomRight=new MovablePoint(x1,y1,xspeed,yspeed);
    }

    @Override
    public void moveUp() {
        topLeft.y-=topLeft.yspeed;
    }

    @Override
    public void moveDown() {
        bottomRight.y+=bottomRight.yspeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x+= topLeft.xspeed;
    }

    @Override
    public void moveRight() {
        bottomRight.x-=bottomRight.xspeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }
}
