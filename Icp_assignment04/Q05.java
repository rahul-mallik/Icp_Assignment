package Icp_assignment04;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt(),fs =0 ;

        for (int i=1; i<n ; i++){
            if (n%i == 0)
                fs = fs + i;
        }

        if( fs == n )
            System.out.println(n + " is a perfect number.");
        else
            System.out.println(n + " is not a perfect number.");
    }
}
