package Icp_Assignment_05;

public class Q_07 {
    public static void main(String[] args) {
        System.out.println("Patter a");
        for (int row = 0 ; row < 5 ; row++){
            for(int column = 0 ; column<=row ; column++){
                System.out.print((char)('A'+column)+"\t");
            }
            System.out.println();
        }

        System.out.println("Patter b");
        for (int row = 5 ; row > 0 ; row--){
            for(int column = 0 ; column<row ; column++){
                System.out.print("$\t");
            }
            System.out.println();
        }

        System.out.println("Patter c");
        for (int row = 1 ; row <=5 ; row++){
            for(int k = 1 ; k<=5-row ; k++){
                System.out.print("\t");
            }
            for(int column = 1 ; column<=row ; column++){
                System.out.print(row+"\t");
            }
            System.out.println();
        }
    }
}
