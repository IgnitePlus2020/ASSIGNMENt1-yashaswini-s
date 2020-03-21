package com.tgt.igniteplus;
import java.util.Scanner;
public class Q5{
    public static void  main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer number");
        num=sc.nextInt();
        sc.close();
        if(num%2==0) {
            System.out.println("entered number is even");
        }
        else {
            System.out.println("entered number is odd");
        }

    }
}

