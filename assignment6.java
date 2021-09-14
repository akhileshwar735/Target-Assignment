package com.akhil.training.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String s="";
        for(int i=1;i<a+1;i++){
            s=s+'*';
            System.out.println(s);
        }

    }
}
