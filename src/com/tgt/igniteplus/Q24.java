package com.tgt.igniteplus;
import java.util.Scanner;
public class Q24{
    public static void main(String[] args) {

        int base, exponent;
        Scanner in = new Scanner(System.in);
        System.out.print("enter base: ");
        base=in.nextInt();
        System.out.print("enter exponent: ");
        exponent=in.nextInt();
        long result = 1;
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}
