package icp_lab1;

//Write a java program to exchange the values of two variables of integer type X and Y using
//third temporary variable Z

public class Q7 {
    public static void main(String[] args) {
        int x = 5;//any no. of your choice
        int y = 3;
        int z = y;
        System.out.println("Before Swapping x :"+x+" y :"+y);
        y=x;
        x=z;
        System.out.println("After Swapping x :"+x+" y :"+y);

    }
}
