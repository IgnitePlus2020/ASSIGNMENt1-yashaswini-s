package com.tgt.igniteplus;
import java.util.Scanner;
    public class Q4b {
        public static void main(String[] args){
            int a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the 1st no.");
            a=sc.nextInt();
            System.out.println("enter the 2nd no.");
            b=sc.nextInt();
            System.out.println("enter the 3rd no.");
            c=sc.nextInt();
            sc.close();
            System.out.println("before swap");
            System.out.println("first number:"+a);
            System.out.println("second number:"+b);
            System.out.println("third number:"+c);

            int temp=a;
            a=b;
            b=c;
            c=temp;
            System.out.println("after swap");
            System.out.println("first number:"+a);
            System.out.println("second number:"+b);
            System.out.println("third number:"+c);
        }
    }

