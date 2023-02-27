package Icp_Assignment_05;

import java.util.Scanner;

public class Hq_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double t = 1, sum = 0 ;
        int i =0;
        do{
            sum+=t;
            i+=2;
            t = -t*x*x/(i*(i-1));
        }while(Math.abs(t)>0.000001);
        System.out.println(sum);
    }
}
