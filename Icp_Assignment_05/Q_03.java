package Icp_Assignment_05;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = in.nextInt();

        System.out.print("Enter the 2nd number : ");
        int end = in.nextInt();
        System.out.print("Prime numbers between "+start+" and "+end+ " are : ");
        for(int i = start + 1 ; i<end ; i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    static boolean isPrime(int n) {
        int c = 2;
        for (; c * c <= n; c++) {
            if (n % c == 0)
                return false;
        }
        return true;
    }
}
