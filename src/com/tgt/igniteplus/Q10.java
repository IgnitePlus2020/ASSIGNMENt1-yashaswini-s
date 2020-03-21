package com.tgt.igniteplus;
import java.util.Scanner;
public class Q10
{
    public static void main(String[] args) {

        int n,num=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sc.close();
        while(n!=0) {
            num = (num * 10) + (n % 10);
            n /= 10;
        }
        while (num != 0)
        {

            switch(num%10){
                case 1:System.out.print("One\t");
                    break;
                case 2:System.out.print("Two\t");
                    break;
                case 3:System.out.print("Three\t");
                    break;
                case 4:System.out.print("Four\t");
                    break;
                case 5:System.out.print("Five\t");
                    break;
                case 6:System.out.print("Six\t");
                    break;
                case 7:System.out.print("Seven \t");
                    break;
                case 8:System.out.print("Eight \t");
                    break;
                case 9:System.out.print("Nine \t");
                    break;
                case 0:System.out.print("Zero \t");
                    break;
                default:
            }
            num=num/10;

        }
    }
}
