package com.tgt.igniteplus;
import java.util.Scanner;
public class Q19
{
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the decimal no.");
   int n=sc.nextInt();
   sc.close();
       int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0)
        {

            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    }


  