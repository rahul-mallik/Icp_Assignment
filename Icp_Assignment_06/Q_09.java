package Icp_Assignment_06;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = in.next();
        System.out.println(passwd_check(password));

    }
    public static String passwd_check(String password){
        int passwd_length = password.length();
        String cond1 = "",cond2 ="", cond3="";
        if(passwd_length>=8)
            cond1 = "ok";

        for (int i = 0 ; i<passwd_length ; i++){
            char ch = password.charAt(i);
            if ((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))
                cond2 = "ok";
            else{
                cond2 = "no";
                break;
            }
        }
        int counter = 0 ;
        for (int i = 0 ; i<passwd_length ; i++){
            char ch = password.charAt(i);
            if(ch>='0' && ch<='9')
                counter++;
        }
        if (counter>=2)
            cond3="ok";

        if(cond1.equals("ok")&&cond2.equals("ok")&&cond3.equals("ok"))
            return "Valid Password";
        else
            return "Invalid Password";
    }
}
