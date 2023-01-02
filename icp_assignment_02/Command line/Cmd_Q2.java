public class Cmd_Q2{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(Math.pow(num1, num2));


        /* 
        Command line input 
            javac Cmd_Q2.java
            java Cmd_Q2 2 3
        
        OUTPUT
            8.0
         */
    }
}