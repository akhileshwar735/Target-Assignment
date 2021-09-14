package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment1 {
    static boolean isValidDate(int year, int month, int day) {
        if(month> 0 && month <=12 ){
            if(month==2){
                if((year %4)==0){
                    if((year % 100==0) && (year % 400 ==0 ) && day<=29){
                        return true;}
                    else if( (year % 100==0) && (year % 400 !=0 ) && day<=28){
                        return true;}
                }
                else if( day<=28){
                    return true;
                }

            }
            else if (month ==1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12){
                if(day > 1 && day<=31){
                return true;}
            }

            else if(month ==4 || month == 6 || month ==9 || month==11){
                if(day > 1 && day<=30){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year= sc.nextInt();
        System.out.println("enter month");
        int month = sc.nextInt();
        System.out.println("enter day");
        int day = sc.nextInt();

        boolean res= isValidDate(year,month,day);
        if(res){
        System.out.println("The date is valid"); }
        else{
            System.out.println("The date is invalid");
        }
    }


}
