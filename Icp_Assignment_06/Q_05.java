package Icp_Assignment_06;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No. of sides of polygon: ");
        int n = in.nextInt();
        System.out.print("Enter the side length of polygon: ");
        double sl = in.nextDouble();
        System.out.println("Area of polygon: "+area(n,sl));
    }
    public static double area(int n, double side){
        return (n*side*side)/4*Math.tan(Math.PI/n);
    }
}
