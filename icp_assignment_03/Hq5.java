package Conditional;

import java.util.Scanner;

public class Hq5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char gender = in.next().charAt(0);
        System.out.print("First name : ");
        String f_name = in.next();
        System.out.print("Last name : ");
        String l_name = in.next();
        System.out.print("Age : ");
        int age = in.nextInt();

        if (age>=20 && (gender == 'F' || gender == 'f')) {
            System.out.print("Are you married, Gita (y or n)? ");
            char single = in.next().charAt(0);

            if (single == 'y' || single == 'Y')
                System.out.println("Then I shall call you Mrs. "+f_name+" "+l_name+".");
            else
                System.out.println("Then I shall call you Ms. "+f_name+" "+l_name+".");
        }
        else if (age>=20 && (gender == 'M' || gender == 'm'))
            System.out.println("Then I shall call you Mr. "+f_name+" "+l_name+".");
        else
            System.out.println("Then I shall call you "+f_name+" "+l_name+".");



    }
}
