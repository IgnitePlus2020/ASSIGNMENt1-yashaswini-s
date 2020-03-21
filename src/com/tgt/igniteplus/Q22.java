package com.tgt.igniteplus;

import java.util.Scanner;

public class Q22{
    public static void main(String[] args) {
        int count,num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of terms: ");
        count= in.nextInt();
        System.out.print("enter the 1st num ");
       num1= in.nextInt();
        System.out.print("enter the 2nd num ");
        num2= in.nextInt();
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}

