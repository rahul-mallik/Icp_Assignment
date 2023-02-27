package Icp_Assignment_05;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = in.nextInt(),sum_f1=0;

        System.out.print("Enter the 2nd number :");
        int num2 = in.nextInt(),sum_f2=0;

        for(int i = 1 ; i<num1 ;i++){
            if (num1%i==0)
                sum_f1+=i;
        }
        for(int i = 1 ; i<num2 ;i++){
            if (num2%i==0)
                sum_f2 += i;
        }

        if (num2 == sum_f1 && num1==sum_f2)
            System.out.println(num1+" and "+num2+" are amicable numbers.");
        else
            System.out.println(num1+" and "+num2+" are not amicable numbers.");
    }
}
