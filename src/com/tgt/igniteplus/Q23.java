package com.tgt.igniteplus;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        int n;
        System.out.print("enter n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1,j=-2; i <= n; i = i + 3,j=j-4)
            System.out.print(i +" "+j+" ");
    }
}