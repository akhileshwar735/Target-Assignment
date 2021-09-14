package com.akhil.training.assignments;

import java.util.Scanner;

public class assignment9 {

    public static int[] sumOfEvensAndOdds(int []nums) {
        int[] res=new int[2];
        int o=0,e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                e+=nums[i];
            }
            else{
                o+=nums[i];
            }
        }
        res[0]=o;res[1]=e ;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int len=sc.nextInt();
        int[] array=new int[len];
        for (int i=0;i<len;i++){
            array[i]=sc.nextInt();
        }
        int[] result=sumOfEvensAndOdds(array);
        for(int a:result){
            System.out.println(a);
        }
    }
}
