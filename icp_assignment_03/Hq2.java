package Conditional;

import java.util.Scanner;

public class Hq2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int future_day = (today + in.nextInt())%7;

        String day="",fday="";
        switch (today){
            case 0 -> day = "Sunday";
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            default -> System.out.println("Invalid Input :( ");
        }
        switch(future_day){
            case 0 -> fday = "Sunday";
            case 1 -> fday = "Monday";
            case 2 -> fday = "Tuesday";
            case 3 -> fday = "Wednesday";
            case 4 -> fday = "Thursday";
            case 5 -> fday = "Friday";
            case 6 -> fday = "Saturday";
            default -> System.out.println("Invalid Input :( ");
        }

        System.out.println("Today is "+day+" and the future day is "+fday);
    }
}
