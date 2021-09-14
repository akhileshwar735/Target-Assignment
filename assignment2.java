package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment2 {
    static boolean isPrimeNumber(int num) {
        for(int i=2; i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        boolean res= isPrimeNumber(num);
        if(res){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not prime");
        }

    }
}
