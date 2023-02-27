package Icp_Assignment_05;

public class Hq_01 {
    public static void main(String[] args) {
        for (int r = 1 ; r<=5 ; r++){
            for(int c = 5 ; c >= 1 ; c--){

                if (c==r)
                    System.out.print("* ");
                else
                    System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
