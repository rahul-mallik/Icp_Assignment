package Icp_Assignment_05;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n =  in.nextInt();
        int a = 0, b = 1, c = 1;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i = 3 ; i<n ; i++){
            int sum = a+b+c;
            System.out.print(sum+" ");
            a = b;
            b = c;
            c = sum;
        }
    }
}
