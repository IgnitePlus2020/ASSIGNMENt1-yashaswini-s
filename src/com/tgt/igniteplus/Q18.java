package com.tgt.igniteplus;
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        int number;
        long fact = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        number=sc.nextInt();
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
