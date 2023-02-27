package Icp_Assignment_05;

import java.util.Scanner;

public class Hq_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int n = in.nextInt();
        System.out.println("Fibonacci series is: ");
        int a = 0, b = 1, c;
        System.out.print(a+", "+b+", ");
        for (int i = 2 ; i<=n ; i++){
            c = a+b;
            System.out.print(c);
            if(i != n)
                System.out.print(", ");
            a = b;
            b = c;
        }
    }
}
