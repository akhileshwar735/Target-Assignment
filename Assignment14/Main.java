package com.akhil.training.oops.Assignment14;
import com.akhil.training.oops.Assignment14.circle;
import com.akhil.training.oops.Assignment14.rectangle;

public class Main {
    public static void main(String[] args) {

        shape[] p = {
               new circle(),new circle(3.0), new circle("pink",false,2.5),
                new rectangle(),new rectangle(3.0,4.0),new rectangle("yellow",true,2.0,6.0),

        };

        rectangle k=new square("red",true,3.0);

        for(int i=0;i<3;i++){
            System.out.println(p[i]);
            System.out.println(((circle)p[i]).getArea());
            System.out.println(((circle)p[i]).getPerimeter());
        }

        for(int i=3;i<6;i++){
            System.out.println(p[i]);
            System.out.println(((rectangle)p[i]).getArea());
            System.out.println(((rectangle)p[i]).getPerimeter());
        }

        System.out.println(k);
        System.out.println(((rectangle)k).toString());

        System.out.println(((square)k).toString());

    }
}
