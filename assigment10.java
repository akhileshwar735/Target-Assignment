package com.akhil.training.assignments;

import java.util.Scanner;

public class assigment10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        String[] str=word.split(" ");
        String rev="";
        for(String s:str){
            rev=s+" "+rev;
        }
        System.out.println(rev);
    }
}
