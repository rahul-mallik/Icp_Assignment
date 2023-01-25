package Icp_assignment04;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a no. for which you want to find the multiplication table:");
        int num = in.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
