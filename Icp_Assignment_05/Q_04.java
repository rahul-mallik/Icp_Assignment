package Icp_Assignment_05;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of m : ");
        int m = in.nextInt();

        System.out.print("Enter the value of n : ");
        int n = in.nextInt();

        for (int i = m ; i<=n ; i++ ){
            int f = 1 ;
            for(int j = 1 ; j<=i ; j++){
                f*=j;
            }
            System.out.println("Factorial of "+i+" is: "+f);
        }
    }
}
