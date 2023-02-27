package Icp_Assignment_05;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum += 1.0/Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
