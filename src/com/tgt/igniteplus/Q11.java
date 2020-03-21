package com.tgt.igniteplus;

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        int n;
        System.out.print("enter the value of n: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<=n;i=i+2)
            System.out.print(i*i+" ");

    }
}
