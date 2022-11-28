package icp_lab1;

//Write a java program to exchange the values of two variables of integer type X and Y without
//using third temporary variable.

public class Q8 {
    public static void main(String[] args) {
        int x = 5;//any no. of your choice
        int y = 3;
        System.out.println("Before Swapping x :"+x+" y :"+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swapping x :"+x+" y :"+y);
    }
}
