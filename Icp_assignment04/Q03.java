package Icp_assignment04;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int i =1,s=0,random;

        System.out.print("Random numbers generated are: ");
        do{
            random = (int)((num+1)*Math.random());
            System.out.print(random+" ");
            i++;
            s+=random;
        }while (i<=num);

        System.out.println("\nThe Average of "+num+" random numbers are "+(s/num));
    }
}
