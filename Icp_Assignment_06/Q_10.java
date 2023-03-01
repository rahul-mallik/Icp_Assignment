package Icp_Assignment_06;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Get the are of :" +
                "1. Triangle\n" +
                "2. Square\n" +
                "3. Circle\n" +
                "4. Rectangle");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch (ch){
            case 1:
                System.out.print("Enter the height: ");
                double h = in.nextInt();
                System.out.print("Enter the base: ");
                double b = in.nextInt();
                System.out.println("Area of triangle: "+area(b,h));
                break;
            case 2 :
                System.out.print("Enter the side length: ");
                int s = in.nextInt();
                System.out.println("Area of square: "+area(s));
                break;
            case 3:
                System.out.print("Enter the radius: ");
                double r = in.nextDouble();
                System.out.println("Area of circle: "+area(r));
                break;
            case 4:
                System.out.print("Enter the length: ");
                int l = in.nextInt();
                System.out.print("Enter the breadth: ");
                int bl = in.nextInt();
                System.out.println("Area of Rectangle: "+area(l,bl));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public static double area(double b,double h){//area of triangle
        return 0.5*b*h;
    }
    public static double area(int s){//area of square
        return s*s;
    }
    public static double area(double r) {
        return Math.PI*r*r;
    }
    public static double area(int a, int b){
        return a*b;
    }
}
