package Icp_Assignment_06;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = in.next();
        System.out.print("Count the occurance of: ");
        char ch = in.next().trim().charAt(0);

        System.out.println("Occurance of "+ch+" in "+str+" is:"+count(str,ch));

    }
    public static int count(String str, char a){
        int c=0;
        for(int i = 0 ; i<str.length(); i++){
            if(str.trim().charAt(i) == a)
                c++;
        }
        return c;
    }
}
