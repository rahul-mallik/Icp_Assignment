package Icp_Assignment_05;

public class Q_06 {
    public static void main(String[] args) {
        System.out.println("Patter a");
        for (int row = 0 ; row <= 5 ; row++){
            for(int column = 0 ; column<=row ; column++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("Patter b");
        for (int row = 1 ; row <= 5 ; row++){
            for(int column = 1 ; column<=row ; column++){
                System.out.print(row+"\t");
            }
            System.out.println();
        }

        System.out.println("Patter c");
        int k = 1;
        for (int row = 1 ; row <= 5 ; row++){
            for(int column = 1 ; column<=row ; column++){
                System.out.print(k++ +"\t");
            }
            System.out.println();
        }

        System.out.println("Patter d");
        for (int row = 1 ; row <= 5 ; row++){
            for(int column = 1 ; column<=row ; column++){
                System.out.print(column+"\t");
            }
            System.out.println();
        }
    }
}
