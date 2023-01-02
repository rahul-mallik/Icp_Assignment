public class Cmd_Q7{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        boolean condition = num1<=num2*num3 || num3<=num2*num1 || num2<=num1*num3;
        System.out.println(condition);

        /* 
        Command line input 
            javac Cmd_Q7.java
            java Cmd_Q7 11 5 3
        
        OUTPUT
            true
            
         */
    }
}