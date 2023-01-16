package Icp_assignment04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = in.nextInt();

        System.out.print("Enter the 2nd number : ");
        int num2 =in.nextInt();
        int x,y;
        if (num1>num2){
            x = num1;
            y =num2;
        }else {
            x = num2;
            y = num1;
        }

        while (x % y != 0) {
            y = x % y;
        }
        System.out.println("The GCD of "+num1+" and "+num2+" is "+y);
    }
}
