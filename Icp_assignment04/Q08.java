package Icp_assignment04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int u,ran;
        do{
            System.out.print("Your guess : ");
            u = in.nextInt();

            ran =(int) ((11-1)*Math.random()+1);
            System.out.println("Computer guesses :" + ran);
            if (u<ran)
                System.out.println("Too low, try again");
            if(u>ran)
                System.out.println("Too high, try again");
            if(u==ran)
                System.out.println("Good guess");

        }while(u!=ran);
    }
}
