package Conditional;

import java.util.Scanner;

public class Hq3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = (int)((12)*Math.random() + 1);
        String m_name = "";

        switch(month){
            case 1 -> m_name = "January";
            case 2 -> m_name = "February";
            case 3 -> m_name = "March";
            case 4 -> m_name = "April";
            case 5 -> m_name = "May";
            case 6 -> m_name = "June";
            case 7 -> m_name = "July";
            case 8 -> m_name = "August";
            case 9 -> m_name = "September";
            case 10 -> m_name = "October";
            case 11 -> m_name = "November";
            case 12 -> m_name = "December";
            default -> System.out.println("Invalid Input :( ");
        }
        System.out.println("Month Chosen by the Computer : "+m_name);
    }
}
