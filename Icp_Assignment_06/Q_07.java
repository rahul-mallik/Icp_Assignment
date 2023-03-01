package Icp_Assignment_06;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();

        System.out.println("No. of vowels in \""+str+"\" : "+count(str));

    }
    public static int count(String str){
        int a =0,e=0,i=0,o=0,u=0,counter=0;
        for(int k = 0; k <str.length() ; k++){
            switch (str.charAt(k)){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }
        if(a >0)
            counter++;
        if(e>0)
            counter++;
        if(i>0)
            counter++;
        if(o>0)
            counter++;
        if(u>0)
            counter++;

        return counter;
    }

}
