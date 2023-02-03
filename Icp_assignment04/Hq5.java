package Icp_assignment04;

import java.util.Scanner;

public class Hq5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n = ");
        int n = in.nextInt();
        String s = "";

        for (int i = 1 ; i<=n ; i++){
            System.out.println(s+i+s);
            s = s+i+s;
        }
    }
}
/*
1
121
1213121
121312141213121
 */