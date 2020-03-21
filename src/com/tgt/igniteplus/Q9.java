package com.tgt.igniteplus;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        int num,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number") ;
        num=sc.nextInt();
        sc.close();
        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("reversed number:"+rev);
    }
}

