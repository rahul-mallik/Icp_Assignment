package Icp_assignment04;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base : ");
        int base = in.nextInt();
        System.out.print("Enter the power: ");
        int power = in.nextInt(),ans = 1;

        for (int i = 1; i<=power ; i++){
            ans *= base;
        }
        System.out.println(base + " to the power "+power+" is: "+ans);

    }
}
