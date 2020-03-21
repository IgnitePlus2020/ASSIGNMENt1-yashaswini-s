package com.tgt.igniteplus;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int n, evensum = 0, oddsum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                evensum = evensum + i;
            else
                oddsum = oddsum + i;
        }
        System.out.println("Evensum=" + evensum);
        System.out.println("Oddsum=" + oddsum);
    }
}
