package Icp_assignment04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer number:");
        int num = in.nextInt(),r,n=0,org = num;

        while(num >0){
            r =num%10;
            num/=10;
            if (r!=0)
                n = n*10+r;
        }
        int tp = 0;
        while (n>0){
            r = n%10;
            n/=10;
            tp = tp*10+r;
        }
        System.out.println("After removing 0 from number "+org+", the new number is "+tp);
    }
}
