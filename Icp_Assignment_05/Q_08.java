package Icp_Assignment_05;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt(),sum=0;
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
