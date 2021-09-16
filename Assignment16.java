package com.akhil.training.assignments;

import java.util.*;

public class Assignment16 {

    public static int scanint(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    public static String scanstr(){
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    public static double scandoub(){
        Scanner sc=new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void main(String[] args) {

        ArrayList<String> als = new ArrayList<String>();
        ArrayList<Integer> ali = new ArrayList<>();
        ArrayList<Double> al = new ArrayList<>();


        while(true){
            als.add(scanstr());
            ali.add(scanint());
            al.add(scandoub());
            if((scanstr()).equals("no")){
                break;
            }

        }
        for(String s:als){
            System.out.println(s);
        }
        for(int s1:ali){
            System.out.println(s1);
        }
        for(double s2:al){
            System.out.println(s2);
        }

    }
}
