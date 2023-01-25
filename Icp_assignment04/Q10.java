package Icp_assignment04;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt(),i = 1 ,k=1;

        while(k<num){
            k = k*3;
            i++;
        }

        System.out.println("The largest power of 3 less than or equal to 100 is "+k);
    }
}
