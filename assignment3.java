package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment3 {
    public static void sortThreeNumbers(int a, int b, int c) {
        int t;
        if( a>b ){
            t=a;
            a=b;
            b=t;
        }

        if(a>c){
            t=a;
            a=c;
            c=t;
        }

        if(b>c){
            t=b;
            b=c;
            c=t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b= sc.nextInt();
        System.out.println("Enter third number");
        c= sc.nextInt();
        sortThreeNumbers(a,b,c);

        }
}
