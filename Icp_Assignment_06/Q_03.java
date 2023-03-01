package Icp_Assignment_06;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        if(isPalindrome(n))
            System.out.println(n+" is a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");
    }
    public static int reverse(int number){
        int rev = 0;
        while(number>0){
            int r = number%10;
            number/=10;
            rev = rev*10+r;
        }
        return rev;
    }

    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }

}
