package Icp_Assignment_06;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Options:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Remainder and\n" +
                "6. Square Root");
        System.out.print("Enter your choice (1-6): ");
        int choice = in.nextInt();

        switch (choice){
            case 1 :
                System.out.print("Enter the value of x and y: ");
                int x = in.nextInt(),y=in.nextInt();
                System.out.println(additionSimple(x,y));
                break;
            case 2 :
                System.out.print("Enter the value of x and y: ");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println(subtractionSimple(x,y));
                break;
            case 3 :
                System.out.print("Enter the value of x and y: ");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println(multiplicationSimple(x,y));
                break;
            case 4 :
                System.out.print("Enter the value of x and y: ");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println(divisionSimple(x,y));
                break;
            case 5 :
                System.out.print("Enter the value of x and y: ");
                x = in.nextInt();
                y = in.nextInt();
                System.out.println(remainderSimple(x,y));
                break;
            case 6 :
            do{
                System.out.print("Enter a Value: ");
                x = in.nextInt();
                if (x<0)
                    System.out.println("Please enter a positive number.");
            }while (x<0);
                System.out.println(squareRootSimple(x));
                break;
            default:
                System.out.println("Invalid Input..");
        }


    }
    public static int additionSimple(int x, int y){
        return(x+y);
    }
    public static int subtractionSimple(int x, int y){
        return (y-x);
    }

    public static int multiplicationSimple(int x, int y)
    {
        return (x*y);
    }
    public static double divisionSimple(int x, int y){
        if(x!=0)
            return (double)x/y;
        else
            return Double.POSITIVE_INFINITY;
    }

    public static int remainderSimple(int n, int m){
        return n%m;
    }
    public static double squareRootSimple(int n){
        return Math.sqrt(n);
    }
}
