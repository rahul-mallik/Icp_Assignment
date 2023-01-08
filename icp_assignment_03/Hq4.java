package Conditional;

import java.util.Scanner;

public class Hq4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        boolean both = num%5==0 && num%6==0;
        boolean any = num%5==0 || num%6==0;
        System.out.println("Is 10 divisible by 5 and 6? "+both);
        System.out.println("Is 10 divisible by 5 or 6? "+any);
        System.out.println("Is 10 divisible by 5 or 6, but not both? "+any);
    }
}
