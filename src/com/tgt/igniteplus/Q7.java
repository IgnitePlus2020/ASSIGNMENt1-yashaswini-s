package com.tgt.igniteplus;
        import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no.");
        x=sc.nextInt();
        System.out.println("enter the 2ndt no.");
        y=sc.nextInt();
        System.out.println("enter the 3rd no.");
        z=sc.nextInt();
        sc.close();
        if(x>y && x>z){
            System.out.println("largest no. is:"+x);
            if(y>z)
                System.out.println("second largest no. is:"+y);
            else
                System.out.println("second largest no. is:"+z);
        } else if (y > z) {
            System.out.println("largest no. is:"+y);
            if(x>z)
                System.out.println("second largest no. is:"+x);
            else
                System.out.println("second largest no. is:"+z);
        }
        else{
            System.out.println("largest no. is:"+z);
            if(x>y)
                System.out.println("second largest no. is:"+x);
            else
                System.out.println("second largest no. is:"+y);
        }
    }
}
