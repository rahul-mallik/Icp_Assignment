package icp_lab1;

import java.util.Scanner;

public class Hq1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter (0)Scissor, (1)rock, (2)paper : ");
        int user = in.nextInt();

        int random = (int)(3*Math.random());
        
        switch (random){
            case 0 :
                System.out.print("The Computer choose Scissor.");
                if (random == user)
                    System.out.println("You choose Scissor too. Its a draw");
                else if (user == 1)
                    System.out.println("You choose rock. You won");
                else
                    System.out.println("You choose paper. Computer won");
                break;

            case 1 :
                System.out.print("The Computer choose Rock.");
                if (random == user)
                    System.out.println("You choose Rock too. Its a draw");
                else if (user == 2)
                    System.out.println("You choose paper. You won");
                else
                    System.out.println("You choose scissor. Computer won");
                break;

            case 2 :
                System.out.print("The Computer choose paper.");
                if (random == user)
                    System.out.println("You choose paper too. Its a draw");
                else if (user == 1)
                    System.out.println("You choose rock. You won");
                else
                    System.out.println("You choose scissor. Computer won");
                break;

            default:
                System.out.println("invalid Input :( ");
        }



    }
}
