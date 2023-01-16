package Icp_assignment04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,num3,sum=0 ;
        System.out.print("Enter first number : ");
        num1 = in.nextInt();
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        System.out.print("Enter third number : ");
        num3 = in.nextInt();

        for (int i = num1;i<=num2;i+=num3){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nThe sum of the numbers displayed is 34 : "+sum);
    }
}