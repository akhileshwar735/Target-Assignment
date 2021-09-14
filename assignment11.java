package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment11 {

     static String[] SPECIALS = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
     static String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty","Seventy", "Eighty", "Ninety"};
     static String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        int index = 0;
        String res = "";
        while (num > 0){
            if (num % 1000 != 0){
                res = helper(num % 1000) + THOUSANDS[index] + " " + res;
            }
            index++;
            num /= 1000;
        }
        return res.trim();
    }

    public static String helper(int num){
        if (num == 0){
            return "";
        } else if (num < 20){
            return SPECIALS[num] + " ";
        } else if (num < 100){
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return SPECIALS[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String result=numberToWords(num);
        System.out.println(result);
    }
}
