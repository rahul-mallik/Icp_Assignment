package Icp_assignment04;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter an integer : ");
        int n = in.nextInt();
        int digit,sum=0,original =n;
        while (n>0){
            digit = n%10;
            n/=10;
            sum += digit;
        }

        if (sum%9==0 )
            System.out.println("Yes "+original+" is divisible by 9 ");
        else
            System.out.println("NO "+original+" is not divisible by 9");


    }
}
