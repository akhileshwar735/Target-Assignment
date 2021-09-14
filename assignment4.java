package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment4 {
    public static int sumOfPrimes(int from, int to) {
        int s=0,x;
        if(from==1){
            from=-1;
        }
        for(int i=from;i<to+1;i++){
             x=1;
            for(int j=2;j<i/2+1;j++){
                if(i%j==0){
                    x=0;
                    break;
                }
            }
            if(x==1){
                s+=i;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b= sc.nextInt();
        int res=sumOfPrimes(a,b);
        System.out.println("result is "+res);

    }
}
