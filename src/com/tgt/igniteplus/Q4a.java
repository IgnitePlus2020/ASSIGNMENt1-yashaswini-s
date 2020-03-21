package com.tgt.igniteplus;
import java.util.Scanner;
public class Q4a {
    public static void main(String[] args){
        int first,second;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no.");
        first=sc.nextInt();
        System.out.println("enter the 2nd no.");
        second=sc.nextInt();
        sc.close();
        System.out.println("before swap");
        System.out.println("first number:"+first);
        System.out.println("second number:"+second);
        int temp=first;
        first=second;
        second=temp;
        System.out.println("after swap");
        System.out.println("first number:"+first);
        System.out.println("second number:"+second);
    }
}

