package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment5 {
    public static int fibonacci(int index) {
        if(index==0){
            return 0;
        }
        else if (index ==1){
            return 1;
        }
        return fibonacci(index -1 ) + fibonacci(index-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the index");
        int index=sc.nextInt();
        int res=fibonacci(index);
        System.out.println(res);
    }
}
