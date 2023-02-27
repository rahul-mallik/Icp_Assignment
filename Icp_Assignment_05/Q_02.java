package Icp_Assignment_05;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt(),org = num, rev=0;

        while (num>0) {
            int r = num%10;
            rev = rev*10+r;
            num/=10;
        }

        if(isPrime(org) && isPrime(rev))
            System.out.println(org+" is a twisted prime.");
        else
            System.out.println(org+" is not a twisted prime.");
    }

    static boolean isPrime(int n){
        int c = 2 ;
        for( ; c*c<=n ; c++){
            if(n%c==0)
                return false;
        }
        return true;
    }
}
