package array;
import java.util.*;

public class transpose {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size matrix : ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i< size; i++){
            for(int j = 0; j< size; j++){
                System.out.print("Enter an integer : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        //transpose

        for(int i = 0; i< size; i++){
            for(int j = 0; j< size; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
