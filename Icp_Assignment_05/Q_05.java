package Icp_Assignment_05;

public class Q_05 {
    public static void main(String[] args) {
        for(int i = 2 ; i<=15 ; i++){
            System.out.println("Multiplication table of "+i);
            for(int j = 1 ; j<=10 ; j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
