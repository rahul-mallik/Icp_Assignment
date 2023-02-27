package Icp_Assignment_05;

public class Hq_02 {
    public static void main(String[] args) {
        int n= 4 , c = 1, k = 1;
        for (int r=n ; r>0 ; r--){
            for (int space = 1 ; space <=n-c  ; space++){
                System.out.print("  ");
            }

            for (int star = 1 ; star<=k ; star++ ){
                System.out.print("* ");
            }
            System.out.println();
            c++;
            k+=2;
        }
    }
}
